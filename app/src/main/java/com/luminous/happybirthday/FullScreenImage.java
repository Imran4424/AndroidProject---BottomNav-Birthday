package com.luminous.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenImage extends AppCompatActivity {
    public static final String IMAGE_POSITION = "com.luminous.happybirthday.IMAGE_POSITION";
    private Integer[] imageResArray = new Integer[] {R.drawable.shai_1,
            R.drawable.shai_2,
            R.drawable.shai_3,
            R.drawable.shai_4,
            R.drawable.shai_5,
            R.drawable.shai_6};

    private ImageView zoomImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        zoomImageView = (ImageView) findViewById(R.id.zoomImageView);
    }
}
