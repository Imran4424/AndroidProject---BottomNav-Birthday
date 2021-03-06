package com.luminous.happybirthday;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;

public class FullScreenImage extends AppCompatActivity {
    public static final String IMAGE_POSITION = "com.luminous.happybirthday.IMAGE_POSITION";
    public static final int POSITION_NOT_SET = -1;

    private int imagePosition;
    private Integer[] imageResArray = new Integer[] {R.drawable.shai_1,
            R.drawable.shai_2,
            R.drawable.shai_3,
            R.drawable.shai_4,
            R.drawable.shai_5,
            R.drawable.shai_6,
            R.drawable.shai_7,
            R.drawable.shai_8,
            R.drawable.shai_9,
            R.drawable.shai_10,
            R.drawable.shai_11,
            R.drawable.shai_12,
            R.drawable.shai_13,
            R.drawable.shai_14,
            R.drawable.us_1,
            R.drawable.us_2,
            R.drawable.us_3,
            R.drawable.us_4,
            R.drawable.us_5,
            R.drawable.us_6,
            R.drawable.us_7,
            R.drawable.us_8,
            R.drawable.us_9,
            R.drawable.us_10,
            R.drawable.us_11,
            R.drawable.us_12,
            R.drawable.us_13,
            R.drawable.us_14,
            R.drawable.us_15,
            R.drawable.us_16,
            R.drawable.us_17,
            R.drawable.us_18,
            R.drawable.us_19,
            R.drawable.us_20,
            R.drawable.us_21,
            R.drawable.us_22,
            R.drawable.us_23,
            R.drawable.us_24,
            R.drawable.us_25};

    private ZoomageView zoomImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        zoomImageView = (ZoomageView) findViewById(R.id.zoomImageView);

        // set bouncing false
        zoomImageView.setRestrictBounds(true);

        Intent fullScreenIntent = getIntent();
        imagePosition = fullScreenIntent.getIntExtra(IMAGE_POSITION, POSITION_NOT_SET);

        setImageViewResource();
    }

    private void setImageViewResource() {
        zoomImageView.setImageResource(imageResArray[imagePosition]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fullscreen, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem previous = menu.findItem(R.id.actionPrev);
        MenuItem next = menu.findItem(R.id.actionNext);
        int firstImageIndex = 0;
        int lastImageIndex = imageResArray.length - 1;
        previous.setEnabled(imagePosition > firstImageIndex);
        next.setEnabled(imagePosition < lastImageIndex);

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.actionNext) {
            moveNext();
        } else if(id == R.id.actionPrev) {
            movePrevious();
        }

        return super.onOptionsItemSelected(item);
    }

    private void movePrevious() {
        imagePosition--;

        setImageViewResource();

        // to search for invalid options menu
        invalidateOptionsMenu();
    }

    private void moveNext() {
        imagePosition++;

        setImageViewResource();

        // to search for invalid options menu
        invalidateOptionsMenu();
    }
}
