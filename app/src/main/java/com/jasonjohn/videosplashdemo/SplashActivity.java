package com.jasonjohn.videosplashdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.jasonjohn.videosplash.VideoSplashView;

import mehdi.sakout.fancybuttons.FancyButton;

public class SplashActivity extends AppCompatActivity {
    VideoSplashView splashVideo;
    FancyButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Hide the status bar.
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        splashVideo = (VideoSplashView) findViewById(R.id.videoSplashView);
        splashVideo.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tunnel_splash_video));
        splashVideo.play();

        button = (FancyButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NextActivity.class));
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        splashVideo.play();
    }

    @Override
    protected void onResume() {
        super.onResume();
        splashVideo.play();
    }

    @Override
    protected void onStop() {
        super.onStop();
        splashVideo.stop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        splashVideo.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashVideo.stop();
    }
}
