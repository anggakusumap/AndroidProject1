package com.example.recyclewithdetails;

import android.media.Rating;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        getIncomingIntent();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_det")
                && getIntent().hasExtra("image_desc")
                && getIntent().hasExtra("tempat")&& getIntent().hasExtra("nomor") && getIntent().hasExtra("rating")){

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDet = getIntent().getStringExtra("image_det");
            String imageDesc = getIntent().getStringExtra("image_desc");
            String tempat = getIntent().getStringExtra("tempat");
            String nomor = getIntent().getStringExtra("nomor");
            Float rating = getIntent().getFloatExtra("rating",0);

            setImage(imageUrl,imageName,imageDet,imageDesc,tempat,nomor,rating);
        }

    }

    private void setImage( String imageUrl, String imageName, String imageDesc,String imageDet, String tempat, String nomor, Float rating){
        TextView name = findViewById(R.id.img_desc);
        name.setText(imageName);
        TextView det = findViewById(R.id.img_det);
        det.setText(imageDesc);
        TextView num = findViewById(R.id.nomor);
        num.setText(nomor);
        TextView tmp = findViewById(R.id.tempat);
        tmp.setText(tempat);

        RatingBar rtg = findViewById(R.id.ratingBar);
        rtg.setRating(rating);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
