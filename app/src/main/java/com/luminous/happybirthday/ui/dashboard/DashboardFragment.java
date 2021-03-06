package com.luminous.happybirthday.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.luminous.happybirthday.ImageRecyclerAdapter;
import com.luminous.happybirthday.R;
import com.luminous.happybirthday.ui.home.HomeFragment;

import java.util.Arrays;
import java.util.List;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private List<Integer> imageResource;
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

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
//        final TextView textView = root.findViewById(R.id.text_dashboard);
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        imageResource = Arrays.asList(imageResArray);

        final RecyclerView recyclerImages = (RecyclerView) root.findViewById(R.id.listImage);
        final LinearLayoutManager imagesLayoutManager = new LinearLayoutManager(getActivity());
        recyclerImages.setLayoutManager(imagesLayoutManager);

        final ImageRecyclerAdapter imageRecyclerAdapter = new ImageRecyclerAdapter(getActivity(), imageResource);
        recyclerImages.setAdapter(imageRecyclerAdapter);

        HomeFragment.happyBirthdaySong.stop();
        //HomeFragment.isPlaying = false;
        return root;
    }
}
