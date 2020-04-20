package com.luminous.happybirthday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.ViewHolder> {
    private final Context context;
    private final LayoutInflater layoutInflater;
//    private final List<ImageView> imageResources;
    private final List<Integer> imageResources;

    public ImageRecyclerAdapter(Context context, List<Integer> imageResources) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.imageResources = imageResources;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView =layoutInflater.inflate(R.layout.item_preview, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.imageView.setImageDrawable(imageResources.get(position).getDrawable());
        holder.imageView.setImageResource(imageResources.get(position));
        holder.currentPosition = position;
    }

    @Override
    public int getItemCount() {
        return imageResources.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView imageView;
        public int currentPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.itemImage);
        }
    }
}
