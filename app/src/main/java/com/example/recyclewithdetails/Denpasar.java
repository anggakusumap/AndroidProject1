package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Denpasar extends AppCompatActivity {

    String tittle = "Denpasar";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    private ArrayList<Float> rating1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denpasar);
        setActionBarTitle(tittle);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setGambar();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


    private void setGambar(){
        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/05/Nasi-campur-Men-Lotri.jpg");
        mNames1.add("Nasi Men Lotri");
        mDesc1.add("Denpasar");
        mImageDet1.add("Warung nasi men lotri adalah salah satu penjual nasi campur yang buka mulai tengah malam, menu andalan nya yaitu nasi campur ayam ataupun babi  dan juga menjual gorengan yang banyak diminati pengunjung");
        tempat1.add("Jalan Noja I No.24-16");
        nomor1.add("Rp. 15.000,-");
        rating1.add((float)4.5);

        mImageUrls1.add("https://denpasarkota.go.id/assets/CKImages/images/WhatsApp%20Image%202019-02-25%20at%2009_56_46.jpeg");
        mNames1.add("Tipat Tahu Gerenceng");
        mDesc1.add("Denpasar");
        mImageDet1.add("Di tempat makan ini bumbu adonan menjadi alas untuk tipat dan tahunya, kemudian ditambah kecambah segar, bawang goreng dan kerupuk udang diatasnya.");
        tempat1.add("Jalan Dr. Sutomo no 16");
        nomor1.add("Rp. 12.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-babi-guling-candra1-1170x780.jpg");
        mNames1.add("Babi Guling Candra");
        mDesc1.add("Denpasar");
        mImageDet1.add("Untuk seporsi nasi babi guling special, terdiri dari sepiring nasi putih, semangkuk sup dan sepiring penuh hasil olahan babi. Ada sate babi yang rasanya manis, daging babi yang disuwir, paru, usus, kerupuk kulit, kulit babi yang kres kres dan sayuran yang dimasak dengan bumbu Bali..");
        tempat1.add("Jalan Teuku Umar no 140");
        nomor1.add("Rp. 30.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-sate-plecing-arjuna1-1170x780.jpg");
        mNames1.add("Sate Plecing Arjuna");
        mDesc1.add("Denpasar");
        mImageDet1.add("Menu utama yang disajikan disini adalah babi, namun ada juga sate ayam. Bumbu sate ini menggunakan sambal plecing yang terbuat dari racikan bawang putih, kemiri dan terasi.");
        tempat1.add("Jalan Teuku Umar no 140");
        nomor1.add("Rp. 24.000,-");
        rating1.add((float)4.5);

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/0d/e1/24/e7/be-sanur.jpg");
        mNames1.add("Warung Be Sanur");
        mDesc1.add("Denpasar");
        mImageDet1.add("Satu paket berisi nasi putih, ikan goreng dan juga sup kepala ikan, lengkap dengan sambalnya yang pedas.");
        tempat1.add("Jalan Tantular no 99");
        nomor1.add("Rp. 32.000,-");
        rating1.add((float)4.8);


        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_denpasar);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
