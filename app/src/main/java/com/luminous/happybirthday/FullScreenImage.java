package com.luminous.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FullScreenImage extends AppCompatActivity {
    private Integer[] imageResArray = new Integer[] {R.drawable.shai_1,
            R.drawable.shai_2,
            R.drawable.shai_3,
            R.drawable.shai_4,
            R.drawable.shai_5,
            R.drawable.shai_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);
    }
}
