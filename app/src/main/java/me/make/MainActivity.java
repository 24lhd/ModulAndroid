package me.make;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

import duong.ChucNangPhu;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showAll(new ABC(), new ABC(), new ABC(), new ABC(), new ABC(), new ABC());
        CharSequence replace = m1310a("e864702ca3c7602961a3c36020a3cc60236ab3c86070286e61aab1e84e2325fe236b9bb1e0b6c021a6cd602963aab1e8607023699bb1e572602164702e6fbab1e9686b60239bb1e86021a6cd60247daab1", "e2325f").replace("<br>", "\n");
        Log.e("faker", replace.toString());
    }

    class ABC {

    }

    private void showAll(ABC... aBC) {
        Log.e("faker", "" + aBC.length);
    }

    @Override
    public void onBackPressed() {
        ChucNangPhu.finishDoubleCick(this);
    }

    public String m1310a(String str, String str2) {
        int i = 0;
        if (str.indexOf(str2) < 0) {
            return str;
        }
        String[] split = str.split(str2);
        String stringBuffer = new StringBuffer(split[1] + split[0]).reverse().toString();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i < stringBuffer.length()) {
            byteArrayOutputStream.write(Integer.parseInt(stringBuffer.substring(i, i + 2), 16));
            i += 2;
        }
        return new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
    }

//    CharSequence replace = c0149i.m1310a(c0147g.m1295b(), "e2325f").replace("<br>", "\n");
//    e864702ca3c7602961a3c36020a3cc60236ab3c86070286e61aab1e84e2325fe236b9bb1e0b6c021a6cd602963aab1e8607023699bb1e572602164702e6fbab1e9686b60239bb1e86021a6cd60247daab1


}
