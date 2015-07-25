package alizinha.c4q.nyc.visualizingdatadotgov.receivers;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import alizinha.c4q.nyc.visualizingdatadotgov.R;
import alizinha.c4q.nyc.visualizingdatadotgov.ui.MainActivity;

/**
 * Created by c4q-Allison on 7/25/15.
 */
public class AlarmReceiver extends BroadcastReceiver
{


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("alarm", "received alarm");
        String title = context.getResources().getString(R.string.notificationTitle);
        String message = context.getResources().getString(R.string.notificationMessage);

        Intent resultIntent = new Intent(context, MainActivity.class);
        PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, resultIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);



        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
         builder.setContentTitle(title);
        builder.setContentText(message);
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setContentIntent(resultPendingIntent);

        int notificationId = 001;

        NotificationManager notifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationId, builder.build());

    }
}
