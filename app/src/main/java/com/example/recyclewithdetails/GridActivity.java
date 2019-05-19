package com.example.recyclewithdetails;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class GridActivity extends RecyclerView.Adapter<GridActivity.GridViewHolder> {

    private static final String TAG = "ListView";
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<Integer> mImagesUrl1 = new ArrayList<>();

    private Context context;

    public GridActivity(Context mContext, ArrayList<Integer> mImageUrls1, ArrayList<String> mImages) {
        this.context = mContext;
        this.mImages = mImages;
        this.mImagesUrl1 = mImageUrls1;

    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .load(mImagesUrl1.get(position))
                .into(holder.imgPhoto);
        holder.test.setText(mImages.get(position));
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if(position==0){
                    intent = new Intent(context,Denpasar.class);
                }else if (position==1){
                    intent = new Intent(context,Badung.class);
                }else if (position==2){
                    intent = new Intent(context,Gianyar.class);
                }else if (position==3){
                    intent = new Intent(context,Jembrana.class);
                }else if (position==4){
                    intent = new Intent(context,Karangasem.class);
                }else if (position==5){
                    intent = new Intent(context,Singaraja.class);
                }else if (position==6){
                    intent = new Intent(context,Tabanan.class);
                }else if (position==7){
                    intent = new Intent(context,Bangli.class);
                }
            context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView test;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            test = itemView.findViewById(R.id.keterangan);
        }
    }
}

