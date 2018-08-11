/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.mk.nettest.swig;

public class StatusGeoipLookupEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StatusGeoipLookupEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StatusGeoipLookupEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mk_swig_nettestJNI.delete_StatusGeoipLookupEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProbeIp(String value) {
    mk_swig_nettestJNI.StatusGeoipLookupEvent_probeIp_set(swigCPtr, this, value);
  }

  public String getProbeIp() {
    return mk_swig_nettestJNI.StatusGeoipLookupEvent_probeIp_get(swigCPtr, this);
  }

  public void setProbeAsn(String value) {
    mk_swig_nettestJNI.StatusGeoipLookupEvent_probeAsn_set(swigCPtr, this, value);
  }

  public String getProbeAsn() {
    return mk_swig_nettestJNI.StatusGeoipLookupEvent_probeAsn_get(swigCPtr, this);
  }

  public void setProbeCc(String value) {
    mk_swig_nettestJNI.StatusGeoipLookupEvent_probeCc_set(swigCPtr, this, value);
  }

  public String getProbeCc() {
    return mk_swig_nettestJNI.StatusGeoipLookupEvent_probeCc_get(swigCPtr, this);
  }

  public void setProbeNetworkName(String value) {
    mk_swig_nettestJNI.StatusGeoipLookupEvent_probeNetworkName_set(swigCPtr, this, value);
  }

  public String getProbeNetworkName() {
    return mk_swig_nettestJNI.StatusGeoipLookupEvent_probeNetworkName_get(swigCPtr, this);
  }

  public StatusGeoipLookupEvent() {
    this(mk_swig_nettestJNI.new_StatusGeoipLookupEvent(), true);
  }

  public final static String key = mk_swig_nettestJNI.StatusGeoipLookupEvent_key_get();
}