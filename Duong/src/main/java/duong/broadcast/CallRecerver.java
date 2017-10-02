package duong.broadcast;

import android.content.Context;
import android.util.Log;

import java.util.Date;

/**
 * Created by D on 7/24/2017.
 */

public class CallRecerver extends CallMain {
/*
    <receiver android:name="com.lhd.broadcast.CallRecerver">
            <intent-filter>
                <action android:name="android.intent.action.PHONE_STATE" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.NEW_OUTGOING_CALL" />
            </intent-filter>
        </receiver>
 */
    private static final String TAG = "CallRecerver";

    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        Log.e(TAG,"onIncomingCallReceived"+number);
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        Log.e(TAG,"onIncomingCallAnswered"+number);
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        Log.e(TAG,"onIncomingCallEnded"+number);
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        Log.e(TAG,"onOutgoingCallStarted"+number);
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        Log.e(TAG,"onOutgoingCallEnded"+number);
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {



    }

}