// Part of measurement-kit <https://measurement-kit.github.io/>.
// Measurement-kit is free software. See AUTHORS and LICENSE for more
// information on the copying conditions.

package org.openobservatory.measurement_kit.android;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import java.util.HashMap;
import java.util.Map;

public class IntentRouter {
    public static synchronized IntentRouter getInstance(Context ctx) {
        if (!(ctx instanceof Application)) {
            throw new RuntimeException("unexpected context type");
        }
        if (singleton == null) {
            singleton = new IntentRouter(ctx);
        }
        return singleton;
    }

    private IntentRouter(Context ctx) {
        lbm = LocalBroadcastManager.getInstance(ctx);
        routes = new HashMap<>();
    }

    public IntentRouter emit_intent(Intent intent) {
        // Note: no need to synchronize: `lbm` is already synchronized
        lbm.sendBroadcast(intent);
        return this;
    }

    public IntentRouter emit_string(String event, String key, String value) {
        // Note: no need to synchronize: `lbm` is already synchronized
        Intent intent = new Intent();
        intent.setAction(event);
        intent.putExtra(key, value);
        lbm.sendBroadcast(intent);
        return this;
    }

    public synchronized IntentRouter register_handler(
            final String receiver_id, final String event,
            final IntentCallback cb) {
        IntentFilter filter = new IntentFilter();
        filter.addAction(event);
        BroadcastReceiver receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                cb.callback(intent);
            }
        };
        lbm.registerReceiver(receiver, filter);
        routes.put(make_key(receiver_id, event), receiver);
        return this;
    }

    public synchronized IntentRouter unregister_handler(
            final String receiver_id, final String event) {
        String key = make_key(receiver_id, event);
        if (routes.containsKey(key)) {
            BroadcastReceiver receiver = routes.get(key);
            lbm.unregisterReceiver(receiver);
            routes.remove(key);
        }
        return this;
    }

    private String make_key(final String receiver_id, final String event) {
        return receiver_id + "/" + event;
    }

    private LocalBroadcastManager lbm;
    private Map<String, BroadcastReceiver> routes;
    private static IntentRouter singleton;
}
