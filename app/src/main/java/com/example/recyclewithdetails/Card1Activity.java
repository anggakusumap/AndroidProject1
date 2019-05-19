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
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Card1Activity extends RecyclerView.Adapter<Card1Activity.ViewHolder> {

    private static final String TAG = "RecycleViewAdapter";

    private ArrayList<String> mImageNames1 = new ArrayList<>();
    private ArrayList<String> mImages1 = new ArrayList<>();
    private ArrayList<String> mImageDesc1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    private ArrayList<Float> rating1 = new ArrayList<>();

    private Context mContext1;

    public Card1Activity(Context mContext1, ArrayList<String> mImageNames1,
                         ArrayList<String> mImages1,
                         ArrayList<String> mImageDesc1 ,
                         ArrayList<String> mImageDet1,
                         ArrayList<String> tempat1,
                         ArrayList<String> nomor1,
                         ArrayList<Float> rating1) {
        this.mImageNames1 = mImageNames1;
        this.mImages1 = mImages1;
        this.mImageDesc1 = mImageDesc1;
        this.mImageDet1 = mImageDet1;
        this.tempat1 = tempat1;
        this.nomor1 = nomor1;
        this.rating1 = rating1;
        this.mContext1 = mContext1;
    }

    @NonNull
    @Override
    public Card1Activity.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(mContext1)
                .asBitmap()
                .load(mImages1.get(i))
                .into(holder.image);
        holder.imageName.setText(mImageNames1.get(i));
        holder.imageDesc.setText(mImageDesc1.get(i));
//        holder.nomor.setText(nomor.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ mImageNames1.get(i));
                Toast.makeText(mContext1, mImageNames1.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext1, GalleryActivity.class);
                intent.putExtra("image_url",mImages1.get(i));
                intent.putExtra("image_desc",mImageDesc1.get(i));
                intent.putExtra("image_name",mImageNames1.get(i));
                intent.putExtra("image_det",mImageDet1.get(i));
                intent.putExtra("tempat",tempat1.get(i));
                intent.putExtra("nomor",nomor1.get(i));
                intent.putExtra("rating",rating1.get(i));
                mContext1.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImageNames1.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        TextView imageDesc;
        RatingBar rating;
        TextView tempat;
        TextView nomor;
        CardView parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageDesc = itemView.findViewById(R.id.image_desc);
            tempat = itemView.findViewById(R.id.tempat);
            nomor = itemView.findViewById(R.id.nomor);
            rating = itemView.findViewById(R.id.ratingBar);
            parentLayout = itemView.findViewById(R.id.cardview);
        }
    }
}
