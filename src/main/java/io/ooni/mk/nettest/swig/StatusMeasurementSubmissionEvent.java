/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.mk.nettest.swig;

public class StatusMeasurementSubmissionEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StatusMeasurementSubmissionEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StatusMeasurementSubmissionEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mk_swig_nettestJNI.delete_StatusMeasurementSubmissionEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIdx(long value) {
    mk_swig_nettestJNI.StatusMeasurementSubmissionEvent_idx_set(swigCPtr, this, value);
  }

  public long getIdx() {
    return mk_swig_nettestJNI.StatusMeasurementSubmissionEvent_idx_get(swigCPtr, this);
  }

  public StatusMeasurementSubmissionEvent() {
    this(mk_swig_nettestJNI.new_StatusMeasurementSubmissionEvent(), true);
  }

  public final static String key = mk_swig_nettestJNI.StatusMeasurementSubmissionEvent_key_get();
}