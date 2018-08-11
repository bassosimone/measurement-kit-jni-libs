/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class io_ooni_mk_FFI */

#ifndef _Included_io_ooni_mk_FFI
#define _Included_io_ooni_mk_FFI
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_nettest_start
 * Signature: (Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_io_ooni_mk_FFI_mk_1nettest_1start
  (JNIEnv *, jclass, jstring);

/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_nettest_is_done
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_io_ooni_mk_FFI_mk_1nettest_1is_1done
  (JNIEnv *, jclass, jlong);

/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_nettest_wait_for_next_event
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_io_ooni_mk_FFI_mk_1nettest_1wait_1for_1next_1event
  (JNIEnv *, jclass, jlong);

/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_nettest_interrupt
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_io_ooni_mk_FFI_mk_1nettest_1interrupt
  (JNIEnv *, jclass, jlong);

/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_nettest_destroy
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_io_ooni_mk_FFI_mk_1nettest_1destroy
  (JNIEnv *, jclass, jlong);

/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_event_serialize
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_io_ooni_mk_FFI_mk_1event_1serialize
  (JNIEnv *, jclass, jlong);

/*
 * Class:     io_ooni_mk_FFI
 * Method:    mk_event_destroy
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_io_ooni_mk_FFI_mk_1event_1destroy
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif
