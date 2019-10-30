package com.example.animation29072019;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView1, imageView2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageviewScale);
        imageView = findViewById(R.id.imageviewAlpha);
        imageView2 = findViewById(R.id.imageviewRotate);
        //1 - alpha cho chuyen man hinh
//        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_image_alpha);
        // x < 50 => chạy về bên tay phải và ngược lại
        // y < 50 => chạy về bên dưới và ngược lại
        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_image_rotate);
//        imageView.startAnimation(animation);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.startAnimation(animation);
//
//            }
//        });

//        imageView1.startAnimation(animation);
//        imageView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.startAnimation(animation);
//
//            }
//        });
        // y < 50: toa do nam tren va nguoc lai

        // x < 50: toa do nam ben trai va nguoc lai
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);

            }
        });
    }
}
