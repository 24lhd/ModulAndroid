package duong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


/**
 * Created by D on 8/9/2017.
 */

public class StateScreen extends BroadcastReceiver {


    /*
        <receiver android:name="com.lhd.mvp.toprunapp.StateScreen">
        <intent-filter>
        <action android:name="android.intent.action.SCREEN_ON" />
        <action android:name="android.intent.action.SCREEN_OFF" />
        </intent-filter>
        </receiver>
     */
    private static final int REQUEST_CODE = 100;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
        }
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
        }
    }


}