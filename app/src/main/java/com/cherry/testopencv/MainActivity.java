package com.cherry.testopencv;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sam);
        Bitmap bitmap1 = ImageProcess.processFace(bitmap);
        ImageView imageView = findViewById(R.id.image_view);
        if (bitmap1 != null)
            imageView.setImageBitmap(bitmap);
    }

}
