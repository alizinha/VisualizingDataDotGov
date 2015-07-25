package alizinha.c4q.nyc.visualizingdatadotgov.receivers;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by c4q-Allison on 7/25/15.
 */
public class AlarmReceiver extends BroadcastReceiver
{


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("alarm", "received alarm");

    }
}
