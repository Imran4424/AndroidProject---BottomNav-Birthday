package com.luminous.happybirthday.ui.home;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.luminous.happybirthday.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public static MediaPlayer happyBirthdaySong;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //Without ViewModelFactory
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // creating media player in a fragment
        happyBirthdaySong = MediaPlayer.create(getActivity(), R.raw.happy_birthday_female);
        happyBirthdaySong.setLooping(true);
        happyBirthdaySong.start();

        return root;
    }
}
