/*
  Copyright (C) 2006-2009 Werner Dittmann

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

#ifndef _ZRTPPACKETPINGACK_H_
#define _ZRTPPACKETPINGACK_H_

#include <libzrtpcpp/ZrtpPacketBase.h>

/**
 * Implement the PingAck packet.
 *
 * The ZRTP simple message PingAck.
 *
 * @author Werner Dittmann <Werner.Dittmann@t-online.de>
 */
class ZrtpPacketPingAck : public ZrtpPacketBase {

 protected:
    PingAck_t* pingAckHeader;

 public:
    ZrtpPacketPingAck();
    ZrtpPacketPingAck(uint8_t* data);
    virtual ~ZrtpPacketPingAck();

    uint32_t getSSRC() { return ntohl(pingAckHeader->ssrc); };

    void setVersion(uint8_t *text)      { memcpy(pingAckHeader->version, text, ZRTP_WORD_SIZE ); }
    void setSSRC(uint32_t data)         {pingAckHeader->ssrc = htonl(data); };
    void setRemoteEpHash(uint8_t *hash) { memcpy(pingAckHeader->remoteEpHash, hash, sizeof(pingAckHeader->remoteEpHash)); }
    void setLocalEpHash(uint8_t *hash)  { memcpy(pingAckHeader->localEpHash, hash, sizeof(pingAckHeader->localEpHash)); }

 private:
     PingAckPacket_t data;
};

#endif // ZRTPPACKETCLEARACK

