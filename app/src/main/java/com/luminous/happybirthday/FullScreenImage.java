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
            R.drawable.shai_6};

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
        MenuItem item = menu.findItem(R.id.actionNext);
        int lastNoteIndex = imageResArray.length - 1;
        item.setEnabled(imagePosition < lastNoteIndex);

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.actionNext) {
            moveNext();
        }

        return super.onOptionsItemSelected(item);
    }

    private void moveNext() {
        imagePosition++;

        setImageViewResource();

        // to search for invalid options menu
        invalidateOptionsMenu();
    }
}
