/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_acc_config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public pjsua_acc_config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(pjsua_acc_config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_acc_config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUser_data(byte[] value) {
    pjsuaJNI.pjsua_acc_config_user_data_set(swigCPtr, this, value);
  }

  public byte[] getUser_data() {
	return pjsuaJNI.pjsua_acc_config_user_data_get(swigCPtr, this);
}

  public void setPriority(int value) {
    pjsuaJNI.pjsua_acc_config_priority_set(swigCPtr, this, value);
  }

  public int getPriority() {
    return pjsuaJNI.pjsua_acc_config_priority_get(swigCPtr, this);
  }

  public void setId(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_id_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getId() {
    long cPtr = pjsuaJNI.pjsua_acc_config_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setReg_uri(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_reg_uri_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getReg_uri() {
    long cPtr = pjsuaJNI.pjsua_acc_config_reg_uri_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setReg_hdr_list(SWIGTYPE_p_pjsip_hdr value) {
    pjsuaJNI.pjsua_acc_config_reg_hdr_list_set(swigCPtr, this, SWIGTYPE_p_pjsip_hdr.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_hdr getReg_hdr_list() {
    return new SWIGTYPE_p_pjsip_hdr(pjsuaJNI.pjsua_acc_config_reg_hdr_list_get(swigCPtr, this), true);
  }

  public void setMwi_enabled(int value) {
    pjsuaJNI.pjsua_acc_config_mwi_enabled_set(swigCPtr, this, value);
  }

  public int getMwi_enabled() {
    return pjsuaJNI.pjsua_acc_config_mwi_enabled_get(swigCPtr, this);
  }

  public void setPublish_enabled(int value) {
    pjsuaJNI.pjsua_acc_config_publish_enabled_set(swigCPtr, this, value);
  }

  public int getPublish_enabled() {
    return pjsuaJNI.pjsua_acc_config_publish_enabled_get(swigCPtr, this);
  }

  public void setPublish_opt(SWIGTYPE_p_pjsip_publishc_opt value) {
    pjsuaJNI.pjsua_acc_config_publish_opt_set(swigCPtr, this, SWIGTYPE_p_pjsip_publishc_opt.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_publishc_opt getPublish_opt() {
    return new SWIGTYPE_p_pjsip_publishc_opt(pjsuaJNI.pjsua_acc_config_publish_opt_get(swigCPtr, this), true);
  }

  public void setUnpublish_max_wait_time_msec(long value) {
    pjsuaJNI.pjsua_acc_config_unpublish_max_wait_time_msec_set(swigCPtr, this, value);
  }

  public long getUnpublish_max_wait_time_msec() {
    return pjsuaJNI.pjsua_acc_config_unpublish_max_wait_time_msec_get(swigCPtr, this);
  }

  public void setAuth_pref(SWIGTYPE_p_pjsip_auth_clt_pref value) {
    pjsuaJNI.pjsua_acc_config_auth_pref_set(swigCPtr, this, SWIGTYPE_p_pjsip_auth_clt_pref.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_auth_clt_pref getAuth_pref() {
    return new SWIGTYPE_p_pjsip_auth_clt_pref(pjsuaJNI.pjsua_acc_config_auth_pref_get(swigCPtr, this), true);
  }

  public void setPidf_tuple_id(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_pidf_tuple_id_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getPidf_tuple_id() {
    long cPtr = pjsuaJNI.pjsua_acc_config_pidf_tuple_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setForce_contact(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_force_contact_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getForce_contact() {
    long cPtr = pjsuaJNI.pjsua_acc_config_force_contact_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setContact_params(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_contact_params_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getContact_params() {
    long cPtr = pjsuaJNI.pjsua_acc_config_contact_params_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setContact_uri_params(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_contact_uri_params_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getContact_uri_params() {
    long cPtr = pjsuaJNI.pjsua_acc_config_contact_uri_params_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setRequire_100rel(int value) {
    pjsuaJNI.pjsua_acc_config_require_100rel_set(swigCPtr, this, value);
  }

  public int getRequire_100rel() {
    return pjsuaJNI.pjsua_acc_config_require_100rel_get(swigCPtr, this);
  }

  public void setUse_timer(pjsua_sip_timer_use value) {
    pjsuaJNI.pjsua_acc_config_use_timer_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_sip_timer_use getUse_timer() {
    return pjsua_sip_timer_use.swigToEnum(pjsuaJNI.pjsua_acc_config_use_timer_get(swigCPtr, this));
  }

  public void setTimer_setting(SWIGTYPE_p_pjsip_timer_setting value) {
    pjsuaJNI.pjsua_acc_config_timer_setting_set(swigCPtr, this, SWIGTYPE_p_pjsip_timer_setting.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_timer_setting getTimer_setting() {
    return new SWIGTYPE_p_pjsip_timer_setting(pjsuaJNI.pjsua_acc_config_timer_setting_get(swigCPtr, this), true);
  }

  public void setProxy_cnt(long value) {
    pjsuaJNI.pjsua_acc_config_proxy_cnt_set(swigCPtr, this, value);
  }

  public long getProxy_cnt() {
    return pjsuaJNI.pjsua_acc_config_proxy_cnt_get(swigCPtr, this);
  }

  public void setProxy(pj_str_t[] value) {
    pjsuaJNI.pjsua_acc_config_proxy_set(swigCPtr, this, pj_str_t.cArrayUnwrap(value));
  }

  public pj_str_t[] getProxy() {
    return pj_str_t.cArrayWrap(pjsuaJNI.pjsua_acc_config_proxy_get(swigCPtr, this), false);
  }

  public void setReg_timeout(long value) {
    pjsuaJNI.pjsua_acc_config_reg_timeout_set(swigCPtr, this, value);
  }

  public long getReg_timeout() {
    return pjsuaJNI.pjsua_acc_config_reg_timeout_get(swigCPtr, this);
  }

  public void setUnreg_timeout(long value) {
    pjsuaJNI.pjsua_acc_config_unreg_timeout_set(swigCPtr, this, value);
  }

  public long getUnreg_timeout() {
    return pjsuaJNI.pjsua_acc_config_unreg_timeout_get(swigCPtr, this);
  }

  public void setCred_count(long value) {
    pjsuaJNI.pjsua_acc_config_cred_count_set(swigCPtr, this, value);
  }

  public long getCred_count() {
    return pjsuaJNI.pjsua_acc_config_cred_count_get(swigCPtr, this);
  }

  public void setCred_info(pjsip_cred_info value) {
    pjsuaJNI.pjsua_acc_config_cred_info_set(swigCPtr, this, pjsip_cred_info.getCPtr(value), value);
  }

  public pjsip_cred_info getCred_info() {
    long cPtr = pjsuaJNI.pjsua_acc_config_cred_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjsip_cred_info(cPtr, false);
  }

  public void setTransport_id(int value) {
    pjsuaJNI.pjsua_acc_config_transport_id_set(swigCPtr, this, value);
  }

  public int getTransport_id() {
    return pjsuaJNI.pjsua_acc_config_transport_id_get(swigCPtr, this);
  }

  public void setAllow_contact_rewrite(int value) {
    pjsuaJNI.pjsua_acc_config_allow_contact_rewrite_set(swigCPtr, this, value);
  }

  public int getAllow_contact_rewrite() {
    return pjsuaJNI.pjsua_acc_config_allow_contact_rewrite_get(swigCPtr, this);
  }

  public void setContact_rewrite_method(int value) {
    pjsuaJNI.pjsua_acc_config_contact_rewrite_method_set(swigCPtr, this, value);
  }

  public int getContact_rewrite_method() {
    return pjsuaJNI.pjsua_acc_config_contact_rewrite_method_get(swigCPtr, this);
  }

  public void setUse_rfc5626(long value) {
    pjsuaJNI.pjsua_acc_config_use_rfc5626_set(swigCPtr, this, value);
  }

  public long getUse_rfc5626() {
    return pjsuaJNI.pjsua_acc_config_use_rfc5626_get(swigCPtr, this);
  }

  public void setRfc5626_instance_id(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_rfc5626_instance_id_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getRfc5626_instance_id() {
    long cPtr = pjsuaJNI.pjsua_acc_config_rfc5626_instance_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setRfc5626_reg_id(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_rfc5626_reg_id_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getRfc5626_reg_id() {
    long cPtr = pjsuaJNI.pjsua_acc_config_rfc5626_reg_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setKa_interval(long value) {
    pjsuaJNI.pjsua_acc_config_ka_interval_set(swigCPtr, this, value);
  }

  public long getKa_interval() {
    return pjsuaJNI.pjsua_acc_config_ka_interval_get(swigCPtr, this);
  }

  public void setKa_data(pj_str_t value) {
    pjsuaJNI.pjsua_acc_config_ka_data_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getKa_data() {
    long cPtr = pjsuaJNI.pjsua_acc_config_ka_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setMax_audio_cnt(long value) {
    pjsuaJNI.pjsua_acc_config_max_audio_cnt_set(swigCPtr, this, value);
  }

  public long getMax_audio_cnt() {
    return pjsuaJNI.pjsua_acc_config_max_audio_cnt_get(swigCPtr, this);
  }

  public void setMax_video_cnt(long value) {
    pjsuaJNI.pjsua_acc_config_max_video_cnt_set(swigCPtr, this, value);
  }

  public long getMax_video_cnt() {
    return pjsuaJNI.pjsua_acc_config_max_video_cnt_get(swigCPtr, this);
  }

  public void setRtp_cfg(pjsua_transport_config value) {
    pjsuaJNI.pjsua_acc_config_rtp_cfg_set(swigCPtr, this, pjsua_transport_config.getCPtr(value), value);
  }

  public pjsua_transport_config getRtp_cfg() {
    long cPtr = pjsuaJNI.pjsua_acc_config_rtp_cfg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjsua_transport_config(cPtr, false);
  }

  public void setUse_srtp(pjmedia_srtp_use value) {
    pjsuaJNI.pjsua_acc_config_use_srtp_set(swigCPtr, this, value.swigValue());
  }

  public pjmedia_srtp_use getUse_srtp() {
    return pjmedia_srtp_use.swigToEnum(pjsuaJNI.pjsua_acc_config_use_srtp_get(swigCPtr, this));
  }

  public void setSrtp_secure_signaling(int value) {
    pjsuaJNI.pjsua_acc_config_srtp_secure_signaling_set(swigCPtr, this, value);
  }

  public int getSrtp_secure_signaling() {
    return pjsuaJNI.pjsua_acc_config_srtp_secure_signaling_get(swigCPtr, this);
  }

  public void setSrtp_optional_dup_offer(int value) {
    pjsuaJNI.pjsua_acc_config_srtp_optional_dup_offer_set(swigCPtr, this, value);
  }

  public int getSrtp_optional_dup_offer() {
    return pjsuaJNI.pjsua_acc_config_srtp_optional_dup_offer_get(swigCPtr, this);
  }

  public void setUse_zrtp(pjmedia_zrtp_use value) {
    pjsuaJNI.pjsua_acc_config_use_zrtp_set(swigCPtr, this, value.swigValue());
  }

  public pjmedia_zrtp_use getUse_zrtp() {
    return pjmedia_zrtp_use.swigToEnum(pjsuaJNI.pjsua_acc_config_use_zrtp_get(swigCPtr, this));
  }

  public void setReg_retry_interval(long value) {
    pjsuaJNI.pjsua_acc_config_reg_retry_interval_set(swigCPtr, this, value);
  }

  public long getReg_retry_interval() {
    return pjsuaJNI.pjsua_acc_config_reg_retry_interval_get(swigCPtr, this);
  }

  public void setDrop_calls_on_reg_fail(int value) {
    pjsuaJNI.pjsua_acc_config_drop_calls_on_reg_fail_set(swigCPtr, this, value);
  }

  public int getDrop_calls_on_reg_fail() {
    return pjsuaJNI.pjsua_acc_config_drop_calls_on_reg_fail_get(swigCPtr, this);
  }

  public void setReg_use_proxy(long value) {
    pjsuaJNI.pjsua_acc_config_reg_use_proxy_set(swigCPtr, this, value);
  }

  public long getReg_use_proxy() {
    return pjsuaJNI.pjsua_acc_config_reg_use_proxy_get(swigCPtr, this);
  }

  public void setCall_hold_type(pjsua_call_hold_type value) {
    pjsuaJNI.pjsua_acc_config_call_hold_type_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_call_hold_type getCall_hold_type() {
    return pjsua_call_hold_type.swigToEnum(pjsuaJNI.pjsua_acc_config_call_hold_type_get(swigCPtr, this));
  }

  public pjsua_acc_config() {
    this(pjsuaJNI.new_pjsua_acc_config(), true);
  }

}
