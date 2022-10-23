package com.example.layout_diwali;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;

public class Screen2Activity extends AppCompatActivity {
    ImageView image;
    Button Sharebtn;
    BitmapDrawable drawable;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        
        image = findViewById(R.id.imageView);
        Sharebtn = findViewById(R.id.button4);
        Sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Shareimage();
            }
        });

    }

    private void Shareimage() {
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        drawable = (BitmapDrawable) image.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        File file =new File(getExternalCacheDir() + "/"+ getResources().getString(R.string.app_name)+".png");
        Intent shareint;
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
            outputStream.flush();
            outputStream.close();
            shareint = new Intent(Intent.ACTION_SEND);
            shareint.setType("image/");
            shareint.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
            shareint.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
        startActivity(Intent.createChooser(shareint,"Share image Via:"));
        
    }
}
