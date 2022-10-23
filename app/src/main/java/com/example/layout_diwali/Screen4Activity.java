package com.example.layout_diwali;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Screen4Activity extends AppCompatActivity {

    private SurfaceView surfaceView3;
    private Button button3;
    private SeekBar seekbar3;
    private MediaPlayer mediaPlayer;
    private View seekBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        surfaceView3 = findViewById(R.id.surfaceView3);
        button3 = findViewById(R.id.button3);
        mediaPlayer = MediaPlayer.create(this, R.raw.crackers);
        surfaceView3.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView3.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
//        seekbar3.setMax(mediaPlayer.getDuration());
//        seekbar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    button3.setText("Play");
                }
                else{
                    mediaPlayer.start();
                    button3.setText("Pause");
                }
            }
        });
    }
}
