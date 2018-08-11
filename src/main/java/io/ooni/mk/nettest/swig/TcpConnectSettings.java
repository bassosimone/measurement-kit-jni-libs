/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.mk.nettest.swig;

public class TcpConnectSettings extends Settings {
  private transient long swigCPtr;

  protected TcpConnectSettings(long cPtr, boolean cMemoryOwn) {
    super(mk_swig_nettestJNI.TcpConnectSettings_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TcpConnectSettings obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mk_swig_nettestJNI.delete_TcpConnectSettings(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mk_swig_nettestJNI.TcpConnectSettings_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mk_swig_nettestJNI.TcpConnectSettings_change_ownership(this, swigCPtr, true);
  }

  public TcpConnectSettings() {
    this(mk_swig_nettestJNI.new_TcpConnectSettings(), true);
    mk_swig_nettestJNI.TcpConnectSettings_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public final static String name = mk_swig_nettestJNI.TcpConnectSettings_name_get();
}