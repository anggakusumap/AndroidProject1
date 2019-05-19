package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Singaraja extends AppCompatActivity {
    String tittle = "Singaraja";
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
        setContentView(R.layout.activity_singaraja);
        setActionBarTitle(tittle);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setGambar();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
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
        mImageUrls1.add("https://4.bp.blogspot.com/-Avs1pdyc3eM/VT78mHiWy1I/AAAAAAAAE5I/4BrHlLWsxtw/s1600/20150220_133220.jpg");
        mNames1.add("Siobak Khe Lok");
        mDesc1.add("Singaraja");
        mImageDet1.add("Dalam proses pembuatannya, daging babi diolah dengan cara direbus dan dicampur dengan kecap manis serta kecap asin. Tidak ketinggalan, juga perlu menambahkan beragam jenis rempah-rempah. ");
        tempat1.add("Jalan Surapati No.66, Buleleng");
        nomor1.add("Rp. 35.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://3.bp.blogspot.com/-GlOQ0XPR79Y/WIWI7WXP4rI/AAAAAAAAPho/h5XSarYZDeUWY5pxNJTNG-lmZqC1DRDLACLcB/s1600/blayag.jpg");
        mNames1.add("Blayag Buleleng");
        mDesc1.add("Singaraja");
        mImageDet1.add("Blayag Buleleng memiliki cita rasa yang berbeda karena kuliner ini tidak menggunakan bumbu kacang melainkan kuah kuning yang sering disebut kuah ayam nyat-nyat.");
        tempat1.add("Jalan Surapati No.124, Buleleng");
        nomor1.add("Rp. 20.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://4.bp.blogspot.com/-8CezMtfjuqg/W0Yj8dKm2KI/AAAAAAAAA7I/GVpFR9ym0YMaJ-NUcm6znCa8mPUE-jzlACLcBGAs/s1600/warung%2Bbik%2BJUK%2Bsingaraja.jpg");
        mNames1.add("Warung Bi’ Juk");
        mDesc1.add("Singaraja");
        mImageDet1.add("Di warung ini disajikan menu seperti  nasi dengan lauk rawon, daging ayam sisit, paru goreng dan lainnya, tidak lupa juga minuman khasnya yaitu  Es Bir.");
        tempat1.add("Jalan Salak, Buleleng");
        nomor1.add("Rp. 15.000,-");
        rating1.add((float)4.3);



        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/05/Sate-Bik-Ngah.jpg");
        mNames1.add("Sate Bik Ngah");
        mDesc1.add("Singaraja");
        mImageDet1.add("Sate bik ngah sudah terkenal sejak tahun 1960. Jenis sate yang ditawarkan juga banyak, diantaranya adalah sate sapi, sate sapi manis, sate kakul dan sate serapah.");
        tempat1.add("Jalan Surapati, Singaraja");
        nomor1.add("Rp. 15.000,-");
        rating1.add((float)3.5);

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/04/79/ca/fe/warung-bambu-pemaron.jpg");
        mNames1.add("Warung Bambu Pemaron");
        mDesc1.add("Singaraja");
        mImageDet1.add("Warung Bambu Pemaron adalah restaurant terkenal yang ada di Singaraja yang menawarkan makanan khas Bali dengan sentuhan kelas atas");
        tempat1.add("Jl. Hotel Puri Bagus Pemaron, Pemaron, Kec. Buleleng, ");
        nomor1.add("Rp 55.000,-");
        rating1.add((float)4);



        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_singaraja);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}
