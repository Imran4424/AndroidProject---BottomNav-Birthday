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
            R.drawable.shai_6};

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
        return root;
    }
}
