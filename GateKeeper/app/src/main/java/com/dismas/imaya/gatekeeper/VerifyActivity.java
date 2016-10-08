package com.dismas.imaya.gatekeeper;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);


//        MediaPlayer player = MediaPlayer.create(this,
//                Settings.System.DEFAULT_ALARM_ALERT_URI);// DEFAULT_RINGTONE_URI or DEFAULT_NOTIFICATION_URI
//        player.start();

        //successful

        ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 100);

        toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 20000);



        //end of successful





    }
}
