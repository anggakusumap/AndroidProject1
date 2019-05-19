package com.example.recyclewithdetails;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



public class CardActivity extends RecyclerView.Adapter<CardActivity.ViewHolder> {

    private static final String TAG = "RecycleViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImageDesc = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();
    private ArrayList<String> posisi = new ArrayList<>();
    private ArrayList<String> tempat = new ArrayList<>();
    private ArrayList<String> nomor = new ArrayList<>();
    private ArrayList<Float> rating = new ArrayList<>();

    private Context mContext;

    public CardActivity(Context mContext,ArrayList<String> mImageNames,
                              ArrayList<String> mImages, ArrayList<String> mImageDesc ,
                              ArrayList<String> mImageDet, ArrayList<String> posisi,
                              ArrayList<String> tempat, ArrayList<String> nomor,
                        ArrayList<Float> rating) {
        this.mImageNames = mImageNames;
        this.mImages = mImages;
        this.mImageDesc = mImageDesc;
        this.mImageDet = mImageDet;
        this.posisi = posisi;
        this.tempat = tempat;
        this.nomor = nomor;
        this.rating = rating;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CardActivity.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card1,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(i))
                .into(holder.image);
        holder.imageName.setText(mImageNames.get(i));
        holder.imageDesc.setText(mImageDesc.get(i));
//        holder.nomor.setText(nomor.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ mImageNames.get(i));
                Toast.makeText(mContext, mImageNames.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, GalleryActivity.class);
                intent.putExtra("image_url",mImages.get(i));
                intent.putExtra("image_desc",mImageDesc.get(i));
                intent.putExtra("image_name",mImageNames.get(i));
                intent.putExtra("image_det",mImageDet.get(i));
                intent.putExtra("tempat",tempat.get(i));
                intent.putExtra("nomor",nomor.get(i));
                intent.putExtra("rating",rating.get(i));
                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        TextView imageDesc;
        TextView posisi;
        TextView tempat;
        TextView nomor;
        RatingBar rating;
        CardView parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageDesc = itemView.findViewById(R.id.image_desc);
            tempat = itemView.findViewById(R.id.tempat);
            nomor = itemView.findViewById(R.id.nomor);
            rating= itemView.findViewById(R.id.ratingBar);
            parentLayout = itemView.findViewById(R.id.cardview1);
        }
    }
}
