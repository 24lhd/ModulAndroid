package duong.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * Created by D on 7/24/2017.
 */

public class SMSRecerver extends BroadcastReceiver {
    private static final String TAG = "SMSRecerver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
            Bundle bundle = intent.getExtras();
            SmsMessage[] msgs = null;
            String msg_from = "";
            String msgBody = "";
            if (bundle != null) {
                try {
                    Object[] pdus = (Object[]) bundle.get("pdus");
                    msgs = new SmsMessage[pdus.length];
                    for (int i = 0; i < msgs.length; i++) {
                        msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
                        msg_from = msgs[i].getOriginatingAddress();
                        msgBody = msgBody + msgs[i].getMessageBody();
                    }
                    Log.e("ken", msgBody);
                } catch (Exception e) {
                    Log.e("ken", e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
