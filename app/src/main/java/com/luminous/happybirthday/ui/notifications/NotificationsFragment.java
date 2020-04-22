package com.luminous.happybirthday.ui.notifications;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.luminous.happybirthday.R;
import com.luminous.happybirthday.ui.home.HomeFragment;


public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        ImageView slideShow = root.findViewById(R.id.slideShow);
        AnimationDrawable animationDrawable = (AnimationDrawable) slideShow.getDrawable();

        animationDrawable.setExitFadeDuration(1250);
        animationDrawable.setEnterFadeDuration(1250);

        animationDrawable.start();

        HomeFragment.happyBirthdaySong.stop();
        return root;
    }
}
