package com.luminous.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenImage extends AppCompatActivity {
    public static final String IMAGE_POSITION = "com.luminous.happybirthday.IMAGE_POSITION";
    public static final int POSITION_NOT_SET = -1;
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

        Intent fullScreenIntent = getIntent();
        zoomImageView.setImageResource(imageResArray[fullScreenIntent.getIntExtra(IMAGE_POSITION, POSITION_NOT_SET)]);
    }
}
