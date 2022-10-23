package com.example.layout_diwali;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button screen1, screen2, screen3, screen4, screen5;



//    ActionBar actionBar = getSupportActionBar();
//   actionBar.setDisplayHomeAsUpEnabled(true);
//
//
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                this.finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen1 = findViewById(R.id.screen_1);
        screen2 = findViewById(R.id.screen_2);
        screen3 = findViewById(R.id.screen_3);
        screen4 = findViewById(R.id.screen_4);
        screen5 = findViewById(R.id.screen_5);

        screen1.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this,Screen1Activity.class);
            startActivity(intent);



        });

        screen2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Screen2Activity.class);
            startActivity(intent);

        });
        screen3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Screen3Activity.class);
            startActivity(intent);

        });
        screen4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Screen4Activity.class);
            startActivity(intent);

        });
        screen5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Screen5Activity.class);
            startActivity(intent);

        });


    }
}