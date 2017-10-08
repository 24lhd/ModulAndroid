package duong.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by D on 7/19/2017.
 */

public class BootBroadcast extends BroadcastReceiver {
    /*
     <receiver android:name="com.lhd.view.broadcast.BootBroadcast">
            <intent-filter>
                <action android:name="android.intent.action.BOOT_COMPLETED" />
            </intent-filter>
        </receiver>
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {

        }

    }
}
