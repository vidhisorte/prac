package com.example.adexp8_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaplay = null;
    }

    public void Music(View view) {
        if (view.getId() == R.id.Playbtn) {
            if (mediaplay == null) {
                mediaplay = MediaPlayer.create(this, R.raw.file_example);
            }
            mediaplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopMusic();
                }
            });
            mediaplay.start();
        } else if (view.getId() == R.id.Pausebtn) {
            if (mediaplay != null)
                mediaplay.pause();
        } else if (view.getId() == R.id.Stopbtn) {
            if (mediaplay != null) {
                mediaplay.stop();
                stopMusic();
            }
        }
    }

    private void stopMusic() {
        mediaplay.release();
        mediaplay = null;
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMusic();
    }
}