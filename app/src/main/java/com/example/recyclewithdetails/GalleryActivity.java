package com.example.recyclewithdetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getIncomingIntent();


    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_det")
                && getIntent().hasExtra("image_desc") && getIntent().hasExtra("posisi")
                && getIntent().hasExtra("tempat")&& getIntent().hasExtra("nomor")){

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDet = getIntent().getStringExtra("image_det");
            String imageDesc = getIntent().getStringExtra("image_desc");
            String posisi = getIntent().getStringExtra("posisi");
            String tempat = getIntent().getStringExtra("tempat");
            String nomor = getIntent().getStringExtra("nomor");

            setImage(imageUrl,imageName,imageDet,imageDesc,posisi,tempat,nomor);
        }

    }

    private void setImage( String imageUrl, String imageName, String imageDesc,String imageDet, String posisi, String tempat, String nomor){
        TextView name = findViewById(R.id.img_desc);
        name.setText(imageName);
        TextView det = findViewById(R.id.img_det);
        det.setText(imageDesc);
        TextView num = findViewById(R.id.nomor);
        num.setText(nomor);
        TextView tmp = findViewById(R.id.tempat);
        tmp.setText(tempat);
        TextView pos = findViewById(R.id.posisi);
        pos.setText(posisi);
        TextView desc = findViewById(R.id.klub);
        desc.setText(imageDet);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
