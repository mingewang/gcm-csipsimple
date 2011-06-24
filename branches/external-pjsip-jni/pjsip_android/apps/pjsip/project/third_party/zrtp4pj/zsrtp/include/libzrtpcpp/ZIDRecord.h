/*
  Copyright (C) 2006-2010 Werner Dittmann

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

#ifndef _ZIDRECORD_H_
#define _ZIDRECORD_H_


/**
 * @file ZIDRecord.h
 * @brief ZID record management
 * 
 * A ZID record stores (caches) ZID (ZRTP ID) specific data that helps ZRTP 
 * to achives its key continuity feature. Please refer to the ZRTP 
 * specification to get detailed information about the ZID.
 * 
 * @ingroup GNU_ZRTP
 * @{
 */

#include <string.h>
#include <stdint.h>

#define IDENTIFIER_LEN  12
#define RS_LENGTH       32
#define TIME_LENGTH      8      // 64 bit, can hold time on 64 bit systems

/**
 * This is the recod structure of version 1 ZID records.
 * 
 * This is not longer in use - only during migration.
 */
typedef struct zidrecord1 {
    char recValid;  //!< if 1 record is valid, if 0: invalid
	char ownZid;	//!< if >1 record contains own ZID, usually 1st record
	char rs1Valid;  //!< if 1 RS1 contains valid data
	char rs2Valid;  //!< if 1 RS2 contains valid data
    unsigned char identifier[IDENTIFIER_LEN]; ///< the peer's ZID or own ZID
    unsigned char rs1Data[RS_LENGTH], rs2Data[RS_LENGTH]; ///< the peer's RS data
} zidrecord1_t;

/**
 * This is the recod structure of version 2 ZID records.
 */
typedef struct zidrecord2 {
    char version;	///< version number of file format, this is #2
	char flags;	    ///< bit field holding various flags, see below
	char filler1;   ///< round up to next 32 bit 
	char filler2;   ///< round up to next 32 bit
    unsigned char identifier[IDENTIFIER_LEN]; ///< the peer's ZID or own ZID
    unsigned char rs1Interval[TIME_LENGTH];   ///< expiration time of RS1; -1 means indefinite
    unsigned char rs1Data[RS_LENGTH];         ///< the peer's RS2 data
    unsigned char rs2Interval[TIME_LENGTH];   ///< expiration time of RS2; -1 means indefinite
    unsigned char rs2Data[RS_LENGTH];         ///< the peer's RS2 data
    unsigned char mitmKey[RS_LENGTH];         ///< MiTM key if available
} zidrecord2_t;

/**
 * This class implements the ZID record.
 *
 * The ZID record holds data about a peer. According to ZRTP specification
 * we use a ZID to identify a peer. ZRTP uses the RS (Retained Secret) data
 * to construct shared secrets.
 * <p/>
 * NOTE: ZIDRecord has ZIDFile as friend. ZIDFile knows about the private
 *	 data of ZIDRecord - please keep both classes synchronized.
 *
 * @author: Werner Dittmann <Werner.Dittmann@t-online.de>
 */

static const int Valid            = 0x1;
static const int SASVerified      = 0x2;
static const int RS1Valid         = 0x4;
static const int RS2Valid         = 0x8;
static const int MITMKeyAvailable = 0x10;
static const int OwnZIDRecord     = 0x20;

class ZIDRecord {
    friend class ZIDFile;

private:
    zidrecord2_t record;
    unsigned long position;

    /*
     * The default constructor is private
     */
    ZIDRecord() {	
	record.version = 2;
    }

    /**
     * Functions for I/O availabe for ZID file handling
     *
     * These functions are private, thus only friends may use it.
     */
    void setPosition(long pos) {position = pos;}
    long getPosition()         {return position; }

    zidrecord2_t* getRecordData() {return &record; }
    int getRecordLength()         {return sizeof(zidrecord2_t); }

    bool isValid()    { return ((record.flags & Valid) == Valid); }
    void setValid()   { record.flags |= Valid; }
    
public:
    /**
     * Create a ZID Record with given ZID data
     * 
     * The method creates a new ZID record and initializes its ZID
     * data field. All other fields are set to null.
     * 
     * An application can use this pre-initialized record to look
     * up the associated record in the ZID file. If the record is
     * available, the ZID record fields are filled with the stored
     * data.
     * 
     * @param idData
     *     Pointer to the fixed length ZID data
     * @see ZIDFile::getRecord
     */
    ZIDRecord(const unsigned char *idData) {
	memset(&record, 0, sizeof(zidrecord2_t));
	memcpy(record.identifier, idData, IDENTIFIER_LEN);
	record.version = 2;
    }

    /**
     * Set @c valid flag in RS1
     */
    void setRs1Valid()   { record.flags |= RS1Valid; }
    
    /**
     * reset @c valid flag in RS1
     */
    void resetRs1Valid() { record.flags &= ~RS1Valid; }
    
    /**
     * Check @c valid flag in RS1
     */
    bool isRs1Valid()    { return ((record.flags & RS1Valid) == RS1Valid); }

    /**
     * Set @c valid flag in RS2
     */
    void setRs2Valid()   { record.flags |= RS2Valid; }
    
    /**
     * Reset @c valid flag in RS2
     */
    void resetRs2Valid() { record.flags &= ~RS2Valid; }
    
    /**
     * Check @c valid flag in RS2
     */
    bool isRs2Valid()    { return ((record.flags & RS2Valid) == RS2Valid); }

    /**
     * Set MITM key available
     */
    void setMITMKeyAvailable()    { record.flags |= MITMKeyAvailable; }
    
    /**
     * Reset MITM key available
     */
    void resetMITMKeyAvailable()  { record.flags &= ~MITMKeyAvailable; }
    
    /**
     * Check MITM key available is set
     */
    bool isMITMKeyAvailable()     { return ((record.flags & MITMKeyAvailable) == MITMKeyAvailable); }

    /**
     * Mark this as own ZID record
     */
    void setOwnZIDRecord()  { record.flags = OwnZIDRecord; }
    /**
     * Reset own ZID record marker
     */
    void resetOwnZIDRecord(){ record.flags = 0; }
    
    /**
     * Check own ZID record marker
     */
    bool isOwnZIDRecord()   { return (record.flags == OwnZIDRecord); }  // no other flag allowed if own ZID

    /**
     * Set SAS for this ZID as verified
     */
    void setSasVerified()   { record.flags |= SASVerified; }
    /**
     * Reset SAS for this ZID as verified
     */
    void resetSasVerified() { record.flags &= ~SASVerified; }
    
    /**
     * Check if SAS for this ZID was verified
     */
    bool isSasVerified()    { return ((record.flags & SASVerified) == SASVerified); }

    /**
     * Return the ZID for this record
     */
    const uint8_t* getIdentifier() {return record.identifier; }
    
    /**
     * Check if RS1 is still valid
     *
     * Returns true if RS1 is still valid, false otherwise.
     *
     * @return
     *    Returns true is RS1 is not expired (valid), false otherwise. 
     */
    const bool isRs1NotExpired();

    /**
     * Returns pointer to RS1 data.
     */
    const unsigned char* getRs1() { return record.rs1Data; }

    /**
     * Check if RS2 is still valid
     *
     * Returns true if RS2 is still valid, false otherwise.
     *
     * @return
     *    Returns true is RS2 is not expired (valid), false otherwise. 
     */
    const bool isRs2NotExpired();

    /**
     * Returns pointer to RS1 data.
     */
    const unsigned char* getRs2() { return record.rs2Data; }

    /**
     * Sets new RS1 data and associated expiration value.
     *
     * If the expiration value is >0 or -1 the method stores the new
     * RS1. Before it stores the new RS1 it shifts the exiting RS1
     * into RS2 (together with its expiration time). Then it computes
     * the expiration time of the and stores the result together with
     * the new RS1.
     *
     * If the expiration value is -1 then this RS will never expire. 
     * 
     * If the expiration value is 0 then the expiration value of a
     * stored RS1 is cleared and no new RS1 value is stored. Also RS2
     * is left unchanged.
     *
     * @param data
     *    Points to the new RS1 data.
     * @param expire
     *    The expiration interval in seconds. Default is -1.
     *
     */
    void setNewRs1(const unsigned char* data, int32_t expire =-1);

    /**
     * Set MiTM key data.
     *
     */
    void setMiTMData(const unsigned char* data);

    /**
     * Get MiTM key data.
     *
     */
    const unsigned char* getMiTMData() {return record.mitmKey; }
};

#endif // ZIDRECORD


/** EMACS **
 * Local variables:
 * mode: c++
 * c-default-style: ellemtel
 * c-basic-offset: 4
 * End:
 */
