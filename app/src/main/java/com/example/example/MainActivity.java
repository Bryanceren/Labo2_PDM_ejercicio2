package com.example.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int[] photos = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9};
            int viewId = v.getId();
            switch (viewId) {
                case R.id.img1:
                    img1.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img2:
                    img2.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img3:
                    img3.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img4:
                    img4.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img5:
                    img5.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img6:
                    img6.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img7:
                    img7.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img8:
                    img8.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
                case R.id.img9:
                    img9.setImageResource(photos[(int) Math.floor(Math.random() * 9)]);
                    break;
            }
        }
    };

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img1.setOnClickListener(clickListener);
        img2.setOnClickListener(clickListener);
        img3.setOnClickListener(clickListener);
        img4.setOnClickListener(clickListener);
        img5.setOnClickListener(clickListener);
        img6.setOnClickListener(clickListener);
        img7.setOnClickListener(clickListener);
        img8.setOnClickListener(clickListener);
        img9.setOnClickListener(clickListener);
    }



}

