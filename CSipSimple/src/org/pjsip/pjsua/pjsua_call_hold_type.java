/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjsua_call_hold_type {
  PJSUA_CALL_HOLD_TYPE_RFC3264,
  PJSUA_CALL_HOLD_TYPE_RFC2543;

  public final int swigValue() {
    return swigValue;
  }

  public static pjsua_call_hold_type swigToEnum(int swigValue) {
    pjsua_call_hold_type[] swigValues = pjsua_call_hold_type.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjsua_call_hold_type swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjsua_call_hold_type.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjsua_call_hold_type() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjsua_call_hold_type(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjsua_call_hold_type(pjsua_call_hold_type swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

