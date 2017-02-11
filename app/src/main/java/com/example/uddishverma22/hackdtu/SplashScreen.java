package com.example.uddishverma22.hackdtu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class SplashScreen extends AppCompatActivity{

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        videoView = (VideoView) findViewById(R.id.splash_vid);

        String uriPath = "android.resource://com.example.uddishverma22.hackdtu/raw/splash";
        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);

        videoView.start();
        videoView.requestFocus();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        });

    }


}
