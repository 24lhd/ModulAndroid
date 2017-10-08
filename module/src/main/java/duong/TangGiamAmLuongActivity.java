package duong;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by D on 7/14/2017.
 */

/*
        Sử dụng điều khiển tăng giảm âm lượng trong android
*/
public class TangGiamAmLuongActivity extends AppCompatActivity {
    private AudioManager audioManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tang_giam_am_luong_layout);
        Log.e("faker", "show");
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
    }


    public void onGiamClick(View view) {
        audioManager.adjustStreamVolume( // Điều chính luồng âm thanh
                AudioManager.STREAM_MUSIC,// int streamType Kiểu luồng
                AudioManager.ADJUST_LOWER, // int direction theo hướng thấp
                AudioManager.FLAG_SHOW_UI + AudioManager.FLAG_VIBRATE// int flags cờ hiện toast và rung
        );


    }

    public void onTangClick(View view) {
        audioManager.adjustStreamVolume(// Điều chính luồng âm thanh
                AudioManager.STREAM_MUSIC,// int streamType Kiểu luồng
                AudioManager.ADJUST_RAISE,// int direction theo hướng lên
                AudioManager.FLAG_VIBRATE +
                        AudioManager.FLAG_PLAY_SOUND +
                        AudioManager.FLAG_SHOW_UI
        );
    }

    public void onChuongClick(View view) { // kích hoạt chế độ âm thanh
        audioManager.setRingerMode(
                AudioManager.RINGER_MODE_NORMAL
        );
    }


    public void onImLangClick(View view) { //  kích hoạt chế độ im lặng
        audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
    }

    public void onRungClick(View view) { //  kích hoạt chế độ rung
        audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
    }

    public void onMaxClick(View view) { // max âm lượng
        audioManager.setStreamVolume(
                AudioManager.STREAM_MUSIC,
                audioManager.getStreamMaxVolume(
                        AudioManager.STREAM_MUSIC
                ),
                AudioManager.FLAG_SHOW_UI +
                        AudioManager.FLAG_VIBRATE +
                        AudioManager.FLAG_PLAY_SOUND
        );

    }

    public void onMinClick(View view) { // min âm lượng
        audioManager.setStreamVolume(
                AudioManager.STREAM_MUSIC,
                0,
                AudioManager.FLAG_SHOW_UI + AudioManager.FLAG_VIBRATE);
//        this.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
    }

    public void onClick(View view) { // tăng âm lượng
    }
}
