// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.
package io.ooni.mk;

/** MKCollectorResubmitTask is a sync task for resubmitting
 * a specific measurement with the OONI collector. */
public class MKCollectorResubmitTask {
    long handle = 0;

    final static native long New();

    final static native void SetTimeout(long handle, long timeout);

    final static native void SetCABundlePath(long handle, String path);

    final static native void SetContent(long handle, String content);

    final static native long Perform(long handle);

    final static native void Delete(long handle);

    /** MKCollectorResubmitTask creates a new resubmit task. */
    MKCollectorResubmitTask(String measurement) {
        handle = New();
        if (handle == 0) {
            throw new RuntimeException(
                    "MKCollectorResubmitTask.New failed");
        }
        setSerializedMeasurement(measurement);
    }

    /** setTimeout sets the number of seconds after which pending
     * requests are aborted by Measurement Kit. */
    public void setTimeout(long timeout) {
        SetTimeout(handle, timeout);
    }

    /** setCABundlePath sets the path of the CA bundle to use. */
    public void setCABundlePath(String path) {
        SetCABundlePath(handle, path);
    }

    void setSerializedMeasurement(String measurement) {
        SetContent(handle, measurement);
    }

    @Override public synchronized void finalize() {
        Delete(handle);
    }

    /** perform resubmits the configured serialized measurements with current
     * settings to the OONI collector and returns the results. */
    public MKCollectorResubmitResults perform() {
        long results = Perform(handle);
        if (results == 0) {
            throw new RuntimeException(
                    "MKCollectorResubmitTask.Perform failed");
        }
        return new MKCollectorResubmitResults(results);
    }
}
