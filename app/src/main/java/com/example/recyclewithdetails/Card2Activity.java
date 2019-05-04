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
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Card2Activity extends RecyclerView.Adapter<Card2Activity.ViewHolder> {

    private static final String TAG = "RecycleViewAdapter";

    private ArrayList<String> mImageNames2 = new ArrayList<>();
    private ArrayList<String> mImages2 = new ArrayList<>();
    private ArrayList<String> mImageDesc2 = new ArrayList<>();
    private ArrayList<String> mImageDet2 = new ArrayList<>();
    private ArrayList<String> posisi2 = new ArrayList<>();
    private ArrayList<String> tempat2 = new ArrayList<>();
    private ArrayList<String> nomor2 = new ArrayList<>();

    private Context mContext2;

    public Card2Activity(Context mContext2, ArrayList<String> mImageNames2,
                         ArrayList<String> mImages2, ArrayList<String> mImageDesc2 ,
                         ArrayList<String> mImageDet2, ArrayList<String> posisi2,
                         ArrayList<String> tempat2, ArrayList<String> nomor2) {
        this.mImageNames2 = mImageNames2;
        this.mImages2 = mImages2;
        this.mImageDesc2 = mImageDesc2;
        this.mImageDet2 = mImageDet2;
        this.posisi2 = posisi2;
        this.tempat2 = tempat2;
        this.nomor2 = nomor2;
        this.mContext2 = mContext2;
    }

    @NonNull
    @Override
    public Card2Activity.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(mContext2)
                .asBitmap()
                .load(mImages2.get(i))
                .into(holder.image);
        holder.imageName.setText(mImageNames2.get(i));
        holder.imageDesc.setText(mImageDesc2.get(i));
//        holder.nomor.setText(nomor.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ mImageNames2.get(i));
                Toast.makeText(mContext2, mImageNames2.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext2, GalleryActivity.class);
                intent.putExtra("image_url",mImages2.get(i));
                intent.putExtra("image_desc",mImageDesc2.get(i));
                intent.putExtra("image_name",mImageNames2.get(i));
                intent.putExtra("image_det",mImageDet2.get(i));
                intent.putExtra("posisi",posisi2.get(i));
                intent.putExtra("tempat",tempat2.get(i));
                intent.putExtra("nomor",nomor2.get(i));
                mContext2.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mImageNames2.size();
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
        CardView parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageDesc = itemView.findViewById(R.id.image_desc);
            posisi = itemView.findViewById(R.id.posisi);
            tempat = itemView.findViewById(R.id.tempat);
            nomor = itemView.findViewById(R.id.nomor);
            parentLayout = itemView.findViewById(R.id.cardview);
        }
    }
}
