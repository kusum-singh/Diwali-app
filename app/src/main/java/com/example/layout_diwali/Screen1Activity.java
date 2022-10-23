package com.example.layout_diwali;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;




public class Screen1Activity extends AppCompatActivity {
    private SurfaceView surfaceView2;
    private Button button2;
    private SeekBar seekbar2;
    private MediaPlayer mediaPlayer;
    private View seekBar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        surfaceView2 = findViewById(R.id.surfaceView);
        button2 = findViewById(R.id.button);
        mediaPlayer = MediaPlayer.create(this, R.raw.aarti);
        surfaceView2.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView2.getHolder();
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
//        seekbar2.setMax(mediaPlayer.getDuration());
//        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
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

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    button2.setText("Play");
                }
                else{
                    mediaPlayer.start();
                    button2.setText("Pause");
                }
            }
        });


    }






}
