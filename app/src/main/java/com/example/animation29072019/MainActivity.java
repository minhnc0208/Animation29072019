package com.example.animation29072019;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageviewAlpha);
        //1 - alpha cho chuyen man hinh
        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_image_alpha);
//        imageView.startAnimation(animation);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.startAnimation(animation);
//
//            }
//        });
    }
}
