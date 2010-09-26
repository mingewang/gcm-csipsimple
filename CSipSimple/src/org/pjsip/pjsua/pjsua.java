/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua implements pjsuaConstants {
  public static pj_str_t pj_str_copy(String str) {
    return new pj_str_t(pjsuaJNI.pj_str_copy(str), true);
  }

  public static int get_snd_dev_info(pjmedia_snd_dev_info info, int id) {
    return pjsuaJNI.get_snd_dev_info(pjmedia_snd_dev_info.getCPtr(info), info, id);
  }

  public static void setCallbackObject(Callback callback) {
    pjsuaJNI.setCallbackObject(Callback.getCPtr(callback), callback);
  }

  public static pj_pool_t pjsua_pool_create(String name, long init_size, long increment) {
    long cPtr = pjsuaJNI.pjsua_pool_create(name, init_size, increment);
    return (cPtr == 0) ? null : new pj_pool_t(cPtr, false);
  }

  public static void pj_pool_release(pj_pool_t pool) {
    pjsuaJNI.pj_pool_release(pj_pool_t.getCPtr(pool), pool);
  }

  public static int snd_get_dev_count() {
    return pjsuaJNI.snd_get_dev_count();
  }

  public static int pjmedia_snd_set_latency(long input_latency, long output_latency) {
    return pjsuaJNI.pjmedia_snd_set_latency(input_latency, output_latency);
  }

  public static int pjmedia_tonegen_create2(pj_pool_t pool, pj_str_t name, long clock_rate, long channel_count, long samples_per_frame, long bits_per_sample, long options, pjmedia_port pp_port) {
    return pjsuaJNI.pjmedia_tonegen_create2(pj_pool_t.getCPtr(pool), pool, pj_str_t.getCPtr(name), name, clock_rate, channel_count, samples_per_frame, bits_per_sample, options, pp_port);
  }

  public static int pjmedia_tonegen_play(pjmedia_port tonegen, long count, pjmedia_tone_desc[] tones, long options) {
    return pjsuaJNI.pjmedia_tonegen_play(pjmedia_port.getCPtr(tonegen), tonegen, count, pjmedia_tone_desc.cArrayUnwrap(tones), options);
  }

  public static int pjmedia_tonegen_rewind(pjmedia_port tonegen) {
    return pjsuaJNI.pjmedia_tonegen_rewind(pjmedia_port.getCPtr(tonegen), tonegen);
  }

  public synchronized static void logging_config_default(pjsua_logging_config cfg) {
    pjsuaJNI.logging_config_default(pjsua_logging_config.getCPtr(cfg), cfg);
  }

  public synchronized static void logging_config_dup(pj_pool_t pool, pjsua_logging_config dst, pjsua_logging_config src) {
    pjsuaJNI.logging_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_logging_config.getCPtr(dst), dst, pjsua_logging_config.getCPtr(src), src);
  }

  public synchronized static void config_default(pjsua_config cfg) {
    pjsuaJNI.config_default(pjsua_config.getCPtr(cfg), cfg);
  }

  public synchronized static void config_dup(pj_pool_t pool, pjsua_config dst, pjsua_config src) {
    pjsuaJNI.config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_config.getCPtr(dst), dst, pjsua_config.getCPtr(src), src);
  }

  public synchronized static void msg_data_init(SWIGTYPE_p_pjsua_msg_data msg_data) {
    pjsuaJNI.msg_data_init(SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int create() {
    return pjsuaJNI.create();
  }

  public synchronized static int init(pjsua_config ua_cfg, pjsua_logging_config log_cfg, pjsua_media_config media_cfg) {
    return pjsuaJNI.init(pjsua_config.getCPtr(ua_cfg), ua_cfg, pjsua_logging_config.getCPtr(log_cfg), log_cfg, pjsua_media_config.getCPtr(media_cfg), media_cfg);
  }

  public synchronized static int start() {
    return pjsuaJNI.start();
  }

  public synchronized static int destroy() {
    return pjsuaJNI.destroy();
  }

  public synchronized static int handle_events(long msec_timeout) {
    return pjsuaJNI.handle_events(msec_timeout);
  }

  public synchronized static pj_pool_t pool_create(String name, long init_size, long increment) {
    long cPtr = pjsuaJNI.pool_create(name, init_size, increment);
    return (cPtr == 0) ? null : new pj_pool_t(cPtr, false);
  }

  public synchronized static int reconfigure_logging(pjsua_logging_config c) {
    return pjsuaJNI.reconfigure_logging(pjsua_logging_config.getCPtr(c), c);
  }

  public synchronized static SWIGTYPE_p_pjsip_endpoint get_pjsip_endpt() {
    long cPtr = pjsuaJNI.get_pjsip_endpt();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_endpoint(cPtr, false);
  }

  public synchronized static SWIGTYPE_p_pjmedia_endpt get_pjmedia_endpt() {
    long cPtr = pjsuaJNI.get_pjmedia_endpt();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjmedia_endpt(cPtr, false);
  }

  public synchronized static SWIGTYPE_p_pj_pool_factory get_pool_factory() {
    long cPtr = pjsuaJNI.get_pool_factory();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pj_pool_factory(cPtr, false);
  }

  public synchronized static int detect_nat_type() {
    return pjsuaJNI.detect_nat_type();
  }

  public synchronized static int get_nat_type(SWIGTYPE_p_pj_stun_nat_type type) {
    return pjsuaJNI.get_nat_type(SWIGTYPE_p_pj_stun_nat_type.getCPtr(type));
  }

  public synchronized static int resolve_stun_servers(long count, pj_str_t srv, int wait, byte[] token, SWIGTYPE_p_f_p_q_const__pj_stun_resolve_result__void cb) {
    return pjsuaJNI.resolve_stun_servers(count, pj_str_t.getCPtr(srv), srv, wait, token, SWIGTYPE_p_f_p_q_const__pj_stun_resolve_result__void.getCPtr(cb));
  }

  public synchronized static int cancel_stun_resolution(byte[] token, int notify_cb) {
    return pjsuaJNI.cancel_stun_resolution(token, notify_cb);
  }

  public synchronized static int verify_sip_url(String url) {
    return pjsuaJNI.verify_sip_url(url);
  }

  public synchronized static int schedule_timer(SWIGTYPE_p_pj_timer_entry entry, SWIGTYPE_p_pj_time_val delay) {
    return pjsuaJNI.schedule_timer(SWIGTYPE_p_pj_timer_entry.getCPtr(entry), SWIGTYPE_p_pj_time_val.getCPtr(delay));
  }

  public synchronized static void cancel_timer(SWIGTYPE_p_pj_timer_entry entry) {
    pjsuaJNI.cancel_timer(SWIGTYPE_p_pj_timer_entry.getCPtr(entry));
  }

  public synchronized static void perror(String sender, String title, int status) {
    pjsuaJNI.perror(sender, title, status);
  }

  public synchronized static void dump(int detail) {
    pjsuaJNI.dump(detail);
  }

  public synchronized static void transport_config_default(pjsua_transport_config cfg) {
    pjsuaJNI.transport_config_default(pjsua_transport_config.getCPtr(cfg), cfg);
  }

  public synchronized static void transport_config_dup(pj_pool_t pool, pjsua_transport_config dst, pjsua_transport_config src) {
    pjsuaJNI.transport_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_transport_config.getCPtr(dst), dst, pjsua_transport_config.getCPtr(src), src);
  }

  public synchronized static int transport_create(pjsip_transport_type_e type, pjsua_transport_config cfg, int[] p_id) {
    return pjsuaJNI.transport_create(type.swigValue(), pjsua_transport_config.getCPtr(cfg), cfg, p_id);
  }

  public synchronized static int transport_register(SWIGTYPE_p_pjsip_transport tp, SWIGTYPE_p_int p_id) {
    return pjsuaJNI.transport_register(SWIGTYPE_p_pjsip_transport.getCPtr(tp), SWIGTYPE_p_int.getCPtr(p_id));
  }

  public synchronized static long transport_get_count() {
    return pjsuaJNI.transport_get_count();
  }

  public synchronized static int enum_transports(int[] id, long[] count) {
    return pjsuaJNI.enum_transports(id, count);
  }

  public synchronized static int transport_get_info(int id, pjsua_transport_info info) {
    return pjsuaJNI.transport_get_info(id, pjsua_transport_info.getCPtr(info), info);
  }

  public synchronized static int transport_set_enable(int id, int enabled) {
    return pjsuaJNI.transport_set_enable(id, enabled);
  }

  public synchronized static int transport_close(int id, int force) {
    return pjsuaJNI.transport_close(id, force);
  }

  public synchronized static void acc_config_default(pjsua_acc_config cfg) {
    pjsuaJNI.acc_config_default(pjsua_acc_config.getCPtr(cfg), cfg);
  }

  public synchronized static void acc_config_dup(pj_pool_t pool, pjsua_acc_config dst, pjsua_acc_config src) {
    pjsuaJNI.acc_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_acc_config.getCPtr(dst), dst, pjsua_acc_config.getCPtr(src), src);
  }

  public synchronized static long acc_get_count() {
    return pjsuaJNI.acc_get_count();
  }

  public synchronized static int acc_is_valid(int acc_id) {
    return pjsuaJNI.acc_is_valid(acc_id);
  }

  public synchronized static int acc_set_default(int acc_id) {
    return pjsuaJNI.acc_set_default(acc_id);
  }

  public synchronized static int acc_get_default() {
    return pjsuaJNI.acc_get_default();
  }

  public synchronized static int acc_add(pjsua_acc_config acc_cfg, int is_default, int[] p_acc_id) {
    return pjsuaJNI.acc_add(pjsua_acc_config.getCPtr(acc_cfg), acc_cfg, is_default, p_acc_id);
  }

  public synchronized static int acc_add_local(int tid, int is_default, int[] p_acc_id) {
    return pjsuaJNI.acc_add_local(tid, is_default, p_acc_id);
  }

  public synchronized static int acc_set_user_data(int acc_id, byte[] user_data) {
    return pjsuaJNI.acc_set_user_data(acc_id, user_data);
  }

  public synchronized static byte[] acc_get_user_data(int acc_id) {
	return pjsuaJNI.acc_get_user_data(acc_id);
}

  public synchronized static int acc_del(int acc_id) {
    return pjsuaJNI.acc_del(acc_id);
  }

  public synchronized static int acc_modify(int acc_id, pjsua_acc_config acc_cfg) {
    return pjsuaJNI.acc_modify(acc_id, pjsua_acc_config.getCPtr(acc_cfg), acc_cfg);
  }

  public synchronized static int acc_set_online_status(int acc_id, int is_online) {
    return pjsuaJNI.acc_set_online_status(acc_id, is_online);
  }

  public synchronized static int acc_set_online_status2(int acc_id, int is_online, SWIGTYPE_p_pjrpid_element pr) {
    return pjsuaJNI.acc_set_online_status2(acc_id, is_online, SWIGTYPE_p_pjrpid_element.getCPtr(pr));
  }

  public synchronized static int acc_set_registration(int acc_id, int renew) {
    return pjsuaJNI.acc_set_registration(acc_id, renew);
  }

  public synchronized static int acc_get_info(int acc_id, pjsua_acc_info info) {
    return pjsuaJNI.acc_get_info(acc_id, pjsua_acc_info.getCPtr(info), info);
  }

  public synchronized static int enum_accs(int[] ids, long[] count) {
    return pjsuaJNI.enum_accs(ids, count);
  }

  public synchronized static int acc_enum_info(pjsua_acc_info info, long[] count) {
    return pjsuaJNI.acc_enum_info(pjsua_acc_info.getCPtr(info), info, count);
  }

  public synchronized static int acc_find_for_outgoing(pj_str_t url) {
    return pjsuaJNI.acc_find_for_outgoing(pj_str_t.getCPtr(url), url);
  }

  public synchronized static int acc_find_for_incoming(SWIGTYPE_p_pjsip_rx_data rdata) {
    return pjsuaJNI.acc_find_for_incoming(SWIGTYPE_p_pjsip_rx_data.getCPtr(rdata));
  }

  public synchronized static int acc_create_request(int acc_id, SWIGTYPE_p_pjsip_method method, pj_str_t target, SWIGTYPE_p_p_pjsip_tx_data p_tdata) {
    return pjsuaJNI.acc_create_request(acc_id, SWIGTYPE_p_pjsip_method.getCPtr(method), pj_str_t.getCPtr(target), target, SWIGTYPE_p_p_pjsip_tx_data.getCPtr(p_tdata));
  }

  public synchronized static int acc_create_uac_contact(pj_pool_t pool, pj_str_t contact, int acc_id, pj_str_t uri) {
    return pjsuaJNI.acc_create_uac_contact(pj_pool_t.getCPtr(pool), pool, pj_str_t.getCPtr(contact), contact, acc_id, pj_str_t.getCPtr(uri), uri);
  }

  public synchronized static int acc_create_uas_contact(pj_pool_t pool, pj_str_t contact, int acc_id, SWIGTYPE_p_pjsip_rx_data rdata) {
    return pjsuaJNI.acc_create_uas_contact(pj_pool_t.getCPtr(pool), pool, pj_str_t.getCPtr(contact), contact, acc_id, SWIGTYPE_p_pjsip_rx_data.getCPtr(rdata));
  }

  public synchronized static int acc_set_transport(int acc_id, int tp_id) {
    return pjsuaJNI.acc_set_transport(acc_id, tp_id);
  }

  public synchronized static long call_get_max_count() {
    return pjsuaJNI.call_get_max_count();
  }

  public synchronized static long call_get_count() {
    return pjsuaJNI.call_get_count();
  }

  public synchronized static int enum_calls(int[] ids, long[] count) {
    return pjsuaJNI.enum_calls(ids, count);
  }
  
  public synchronized static int call_make_call(int acc_id, pj_str_t dst_uri, long options, byte[] user_data, SWIGTYPE_p_pjsua_msg_data msg_data, int[] p_call_id) {
    return pjsuaJNI.call_make_call(acc_id, pj_str_t.getCPtr(dst_uri), dst_uri, options, user_data, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data), p_call_id);
  }

  public synchronized static int call_is_active(int call_id) {
    return pjsuaJNI.call_is_active(call_id);
  }

  public synchronized static int call_has_media(int call_id) {
    return pjsuaJNI.call_has_media(call_id);
  }

  public synchronized static SWIGTYPE_p_pjmedia_session call_get_media_session(int call_id) {
    long cPtr = pjsuaJNI.call_get_media_session(call_id);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjmedia_session(cPtr, false);
  }

  public synchronized static SWIGTYPE_p_pjmedia_transport call_get_media_transport(int cid) {
    long cPtr = pjsuaJNI.call_get_media_transport(cid);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjmedia_transport(cPtr, false);
  }

  public synchronized static int call_get_conf_port(int call_id) {
    return pjsuaJNI.call_get_conf_port(call_id);
  }

  public synchronized static int call_get_info(int call_id, pjsua_call_info info) {
    return pjsuaJNI.call_get_info(call_id, pjsua_call_info.getCPtr(info), info);
  }

  public synchronized static SWIGTYPE_p_pjsip_dialog_cap_status call_remote_has_cap(int call_id, int htype, pj_str_t hname, pj_str_t token) {
    return new SWIGTYPE_p_pjsip_dialog_cap_status(pjsuaJNI.call_remote_has_cap(call_id, htype, pj_str_t.getCPtr(hname), hname, pj_str_t.getCPtr(token), token), true);
  }

  public synchronized static int call_set_user_data(int call_id, byte[] user_data) {
    return pjsuaJNI.call_set_user_data(call_id, user_data);
  }

  public synchronized static byte[] call_get_user_data(int call_id) {
	return pjsuaJNI.call_get_user_data(call_id);
}

  public synchronized static int call_get_rem_nat_type(int call_id, SWIGTYPE_p_pj_stun_nat_type p_type) {
    return pjsuaJNI.call_get_rem_nat_type(call_id, SWIGTYPE_p_pj_stun_nat_type.getCPtr(p_type));
  }

  public synchronized static int call_answer(int call_id, long code, pj_str_t reason, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_answer(call_id, code, pj_str_t.getCPtr(reason), reason, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_hangup(int call_id, long code, pj_str_t reason, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_hangup(call_id, code, pj_str_t.getCPtr(reason), reason, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_process_redirect(int call_id, SWIGTYPE_p_pjsip_redirect_op cmd) {
    return pjsuaJNI.call_process_redirect(call_id, SWIGTYPE_p_pjsip_redirect_op.getCPtr(cmd));
  }

  public synchronized static int call_set_hold(int call_id, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_set_hold(call_id, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_reinvite(int call_id, int unhold, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_reinvite(call_id, unhold, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_update(int call_id, long options, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_update(call_id, options, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_xfer(int call_id, pj_str_t dest, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_xfer(call_id, pj_str_t.getCPtr(dest), dest, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_xfer_replaces(int call_id, int dest_call_id, long options, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_xfer_replaces(call_id, dest_call_id, options, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_dial_dtmf(int call_id, pj_str_t digits) {
    return pjsuaJNI.call_dial_dtmf(call_id, pj_str_t.getCPtr(digits), digits);
  }

  public synchronized static int call_send_im(int call_id, pj_str_t mime_type, pj_str_t content, SWIGTYPE_p_pjsua_msg_data msg_data, byte[] user_data) {
    return pjsuaJNI.call_send_im(call_id, pj_str_t.getCPtr(mime_type), mime_type, pj_str_t.getCPtr(content), content, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data), user_data);
  }

  public synchronized static int call_send_typing_ind(int call_id, int is_typing, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_send_typing_ind(call_id, is_typing, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static int call_send_request(int call_id, pj_str_t method, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.call_send_request(call_id, pj_str_t.getCPtr(method), method, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static void call_hangup_all() {
    pjsuaJNI.call_hangup_all();
  }

  public synchronized static String call_dump(int call_id, int with_media, String indent) {
    return pjsuaJNI.call_dump(call_id, with_media, indent);
  }

  public synchronized static void buddy_config_default(pjsua_buddy_config cfg) {
    pjsuaJNI.buddy_config_default(pjsua_buddy_config.getCPtr(cfg), cfg);
  }

  public synchronized static long get_buddy_count() {
    return pjsuaJNI.get_buddy_count();
  }

  public synchronized static int buddy_is_valid(int buddy_id) {
    return pjsuaJNI.buddy_is_valid(buddy_id);
  }

  public synchronized static int enum_buddies(int[] ids, long[] count) {
    return pjsuaJNI.enum_buddies(ids, count);
  }

  public synchronized static int buddy_find(pj_str_t uri) {
    return pjsuaJNI.buddy_find(pj_str_t.getCPtr(uri), uri);
  }

  public synchronized static int buddy_get_info(int buddy_id, pjsua_buddy_info info) {
    return pjsuaJNI.buddy_get_info(buddy_id, pjsua_buddy_info.getCPtr(info), info);
  }

  public synchronized static int buddy_set_user_data(int buddy_id, byte[] user_data) {
    return pjsuaJNI.buddy_set_user_data(buddy_id, user_data);
  }

  public synchronized static byte[] buddy_get_user_data(int buddy_id) {
	return pjsuaJNI.buddy_get_user_data(buddy_id);
}

  public synchronized static int buddy_add(pjsua_buddy_config buddy_cfg, SWIGTYPE_p_int p_buddy_id) {
    return pjsuaJNI.buddy_add(pjsua_buddy_config.getCPtr(buddy_cfg), buddy_cfg, SWIGTYPE_p_int.getCPtr(p_buddy_id));
  }

  public synchronized static int buddy_del(int buddy_id) {
    return pjsuaJNI.buddy_del(buddy_id);
  }

  public synchronized static int buddy_subscribe_pres(int buddy_id, int subscribe) {
    return pjsuaJNI.buddy_subscribe_pres(buddy_id, subscribe);
  }

  public synchronized static int buddy_update_pres(int buddy_id) {
    return pjsuaJNI.buddy_update_pres(buddy_id);
  }

  public synchronized static int pres_notify(int acc_id, SWIGTYPE_p_pjsua_srv_pres srv_pres, SWIGTYPE_p_pjsip_evsub_state state, pj_str_t state_str, pj_str_t reason, int with_body, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.pres_notify(acc_id, SWIGTYPE_p_pjsua_srv_pres.getCPtr(srv_pres), SWIGTYPE_p_pjsip_evsub_state.getCPtr(state), pj_str_t.getCPtr(state_str), state_str, pj_str_t.getCPtr(reason), reason, with_body, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static void pres_dump(int verbose) {
    pjsuaJNI.pres_dump(verbose);
  }

  public static SWIGTYPE_p_pjsip_method getPjsip_message_method() {
    return new SWIGTYPE_p_pjsip_method(pjsuaJNI.pjsip_message_method_get(), true);
  }

  public synchronized static int im_send(int acc_id, pj_str_t to, pj_str_t mime_type, pj_str_t content, SWIGTYPE_p_pjsua_msg_data msg_data, byte[] user_data) {
    return pjsuaJNI.im_send(acc_id, pj_str_t.getCPtr(to), to, pj_str_t.getCPtr(mime_type), mime_type, pj_str_t.getCPtr(content), content, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data), user_data);
  }

  public synchronized static int im_typing(int acc_id, pj_str_t to, int is_typing, SWIGTYPE_p_pjsua_msg_data msg_data) {
    return pjsuaJNI.im_typing(acc_id, pj_str_t.getCPtr(to), to, is_typing, SWIGTYPE_p_pjsua_msg_data.getCPtr(msg_data));
  }

  public synchronized static void media_config_default(pjsua_media_config cfg) {
    pjsuaJNI.media_config_default(pjsua_media_config.getCPtr(cfg), cfg);
  }

  public synchronized static long conf_get_max_ports() {
    return pjsuaJNI.conf_get_max_ports();
  }

  public synchronized static long conf_get_active_ports() {
    return pjsuaJNI.conf_get_active_ports();
  }

  public synchronized static int enum_conf_ports(int[] id, long[] count) {
    return pjsuaJNI.enum_conf_ports(id, count);
  }

  public synchronized static int conf_get_port_info(int port_id, pjsua_conf_port_info info) {
    return pjsuaJNI.conf_get_port_info(port_id, pjsua_conf_port_info.getCPtr(info), info);
  }

  public synchronized static int conf_add_port(pj_pool_t pool, pjmedia_port port, int[] p_id) {
    return pjsuaJNI.conf_add_port(pj_pool_t.getCPtr(pool), pool, pjmedia_port.getCPtr(port), port, p_id);
  }

  public synchronized static int conf_remove_port(int port_id) {
    return pjsuaJNI.conf_remove_port(port_id);
  }

  public synchronized static int conf_connect(int source, int sink) {
    return pjsuaJNI.conf_connect(source, sink);
  }

  public synchronized static int conf_disconnect(int source, int sink) {
    return pjsuaJNI.conf_disconnect(source, sink);
  }

  public synchronized static int conf_adjust_tx_level(int slot, float level) {
    return pjsuaJNI.conf_adjust_tx_level(slot, level);
  }

  public synchronized static int conf_adjust_rx_level(int slot, float level) {
    return pjsuaJNI.conf_adjust_rx_level(slot, level);
  }

  public synchronized static int conf_get_signal_level(int slot, SWIGTYPE_p_unsigned_int tx_level, SWIGTYPE_p_unsigned_int rx_level) {
    return pjsuaJNI.conf_get_signal_level(slot, SWIGTYPE_p_unsigned_int.getCPtr(tx_level), SWIGTYPE_p_unsigned_int.getCPtr(rx_level));
  }

  public synchronized static int player_create(pj_str_t filename, long options, SWIGTYPE_p_int p_id) {
    return pjsuaJNI.player_create(pj_str_t.getCPtr(filename), filename, options, SWIGTYPE_p_int.getCPtr(p_id));
  }

  public synchronized static int playlist_create(pj_str_t file_names, long file_count, pj_str_t label, long options, SWIGTYPE_p_int p_id) {
    return pjsuaJNI.playlist_create(pj_str_t.getCPtr(file_names), file_names, file_count, pj_str_t.getCPtr(label), label, options, SWIGTYPE_p_int.getCPtr(p_id));
  }

  public synchronized static int player_get_conf_port(int id) {
    return pjsuaJNI.player_get_conf_port(id);
  }

  public synchronized static int player_get_port(int id, SWIGTYPE_p_p_pjmedia_port p_port) {
    return pjsuaJNI.player_get_port(id, SWIGTYPE_p_p_pjmedia_port.getCPtr(p_port));
  }

  public synchronized static int player_set_pos(int id, long samples) {
    return pjsuaJNI.player_set_pos(id, samples);
  }

  public synchronized static int player_destroy(int id) {
    return pjsuaJNI.player_destroy(id);
  }

  public synchronized static int recorder_create(pj_str_t filename, long enc_type, byte[] enc_param, SWIGTYPE_p_pj_ssize_t max_size, long options, SWIGTYPE_p_int p_id) {
    return pjsuaJNI.recorder_create(pj_str_t.getCPtr(filename), filename, enc_type, enc_param, SWIGTYPE_p_pj_ssize_t.getCPtr(max_size), options, SWIGTYPE_p_int.getCPtr(p_id));
  }

  public synchronized static int recorder_get_conf_port(int id) {
    return pjsuaJNI.recorder_get_conf_port(id);
  }

  public synchronized static int recorder_get_port(int id, SWIGTYPE_p_p_pjmedia_port p_port) {
    return pjsuaJNI.recorder_get_port(id, SWIGTYPE_p_p_pjmedia_port.getCPtr(p_port));
  }

  public synchronized static int recorder_destroy(int id) {
    return pjsuaJNI.recorder_destroy(id);
  }

  public synchronized static int enum_aud_devs(SWIGTYPE_p_pjmedia_aud_dev_info info, long[] count) {
    return pjsuaJNI.enum_aud_devs(SWIGTYPE_p_pjmedia_aud_dev_info.getCPtr(info), count);
  }

  public synchronized static int enum_snd_devs(pjmedia_snd_dev_info info, long[] count) {
    return pjsuaJNI.enum_snd_devs(pjmedia_snd_dev_info.getCPtr(info), info, count);
  }

  public synchronized static int get_snd_dev(int[] capture_dev, int[] playback_dev) {
    return pjsuaJNI.get_snd_dev(capture_dev, playback_dev);
  }

  public synchronized static int set_snd_dev(int capture_dev, int playback_dev) {
    return pjsuaJNI.set_snd_dev(capture_dev, playback_dev);
  }

  public synchronized static int set_null_snd_dev() {
    return pjsuaJNI.set_null_snd_dev();
  }

  public synchronized static pjmedia_port set_no_snd_dev() {
    long cPtr = pjsuaJNI.set_no_snd_dev();
    return (cPtr == 0) ? null : new pjmedia_port(cPtr, false);
  }

  public synchronized static int set_ec(long tail_ms, long options) {
    return pjsuaJNI.set_ec(tail_ms, options);
  }

  public synchronized static int get_ec_tail(SWIGTYPE_p_unsigned_int p_tail_ms) {
    return pjsuaJNI.get_ec_tail(SWIGTYPE_p_unsigned_int.getCPtr(p_tail_ms));
  }

  public synchronized static int snd_is_active() {
    return pjsuaJNI.snd_is_active();
  }

  public synchronized static int snd_set_setting(SWIGTYPE_p_pjmedia_aud_dev_cap cap, byte[] pval, int keep) {
    return pjsuaJNI.snd_set_setting(SWIGTYPE_p_pjmedia_aud_dev_cap.getCPtr(cap), pval, keep);
  }

  public synchronized static int snd_get_setting(SWIGTYPE_p_pjmedia_aud_dev_cap cap, byte[] pval) {
    return pjsuaJNI.snd_get_setting(SWIGTYPE_p_pjmedia_aud_dev_cap.getCPtr(cap), pval);
  }

  public synchronized static int enum_codecs(pjsua_codec_info id, long[] count) {
    return pjsuaJNI.enum_codecs(pjsua_codec_info.getCPtr(id), id, count);
  }
  
  public synchronized static int get_nbr_of_codecs() {
	  return pjsuaJNI.get_nbr_of_codecs();
  }
  
  public synchronized static pj_str_t codec_get_id(int index) {
	  long cPtr = pjsuaJNI.codec_get_id(index);
	  return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public synchronized static int codec_set_priority(pj_str_t codec_id, short priority) {
    return pjsuaJNI.codec_set_priority(pj_str_t.getCPtr(codec_id), codec_id, priority);
  }

  public synchronized static int codec_get_param(pj_str_t codec_id, pjmedia_codec_param param) {
    return pjsuaJNI.codec_get_param(pj_str_t.getCPtr(codec_id), codec_id, pjmedia_codec_param.getCPtr(param), param);
  }

  public synchronized static int codec_set_param(pj_str_t codec_id, pjmedia_codec_param param) {
    return pjsuaJNI.codec_set_param(pj_str_t.getCPtr(codec_id), codec_id, pjmedia_codec_param.getCPtr(param), param);
  }

  public synchronized static int media_transports_create(pjsua_transport_config cfg) {
    return pjsuaJNI.media_transports_create(pjsua_transport_config.getCPtr(cfg), cfg);
  }

  public synchronized static void test_audio_dev(long clock_rate, long ptime) {
    pjsuaJNI.test_audio_dev(clock_rate, ptime);
  }
}
