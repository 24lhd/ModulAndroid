package me.make;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import duong.ChucNangPhu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showAll(new ABC(),new ABC(),new ABC(),new ABC(),new ABC(),new ABC());
    }
    class  ABC{

    }
    private void showAll(ABC... aBC) {
        Log.e("faker",""+aBC.length);
    }

    @Override
    public void onBackPressed() {
        ChucNangPhu.finishDoubleCick(this);
    }

}
