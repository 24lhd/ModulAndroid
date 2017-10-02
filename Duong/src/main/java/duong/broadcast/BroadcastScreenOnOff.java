package duong.broadcast;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import static android.content.Context.KEYGUARD_SERVICE;

/**
 * Created by D on 7/4/2017.
 */

public class BroadcastScreenOnOff extends BroadcastReceiver {

    Intent intentListenOnOff;

    @Override
    public void onReceive(Context context, Intent intent) {
//        intentListenOnOff = new Intent(context, FloatIcon.class);
        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            intentListenOnOff.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intentListenOnOff.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            context.startService(intentListenOnOff);
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            ((KeyguardManager) context.getSystemService(KEYGUARD_SERVICE)).newKeyguardLock(context.getPackageName()).disableKeyguard();
            intentListenOnOff.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intentListenOnOff.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            //  context.stopService(intentListenOnOff);
        }
    }


}
