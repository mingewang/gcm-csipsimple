/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjmedia_dir {
  PJMEDIA_DIR_NONE(pjsuaJNI.PJMEDIA_DIR_NONE_get()),
  PJMEDIA_DIR_ENCODING(pjsuaJNI.PJMEDIA_DIR_ENCODING_get()),
  PJMEDIA_DIR_DECODING(pjsuaJNI.PJMEDIA_DIR_DECODING_get()),
  PJMEDIA_DIR_ENCODING_DECODING(pjsuaJNI.PJMEDIA_DIR_ENCODING_DECODING_get());

  public final int swigValue() {
    return swigValue;
  }

  public static pjmedia_dir swigToEnum(int swigValue) {
    pjmedia_dir[] swigValues = pjmedia_dir.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjmedia_dir swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjmedia_dir.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjmedia_dir() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjmedia_dir(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjmedia_dir(pjmedia_dir swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

