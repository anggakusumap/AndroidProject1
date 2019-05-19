package com.example.recyclewithdetails;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class KategoriSatu extends AppCompatActivity {
    String tittle = "Babi Guling";
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
        setContentView(R.layout.activity_kategori_satu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setActionBarTitle(tittle);
        setGambar();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
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
        mImageUrls1.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames1.add("Surya Agung Babi Guling");
                mDesc1.add("Jembrana");
        mImageDet1.add("Warung Surya Agung Babi Guling menyediakan menu babi guling dengan cita rasa yang berbeda dari cita rasa babi guling yang lain.");
        tempat1.add("Jl. Yudistira Jembrana ");
        nomor1.add("Rp 30.000,-");
        rating1.add((float)4.5);

        mImageUrls1.add("https://www.tripsavvy.com/thmb/_pbV3fLDF_ZJiTyNf5EUFUu9nG4=/960x0/filters:no_upscale():max_bytes(150000):strip_icc()/babi-guling_ibu-oka-58351a243df78c6f6acce39c.jpg");
        mNames1.add("Babi Guling Ibu Oka");
        mDesc1.add("Gianyar");
        mImageDet1.add("Babi Guling terkenal dari Ubud Gianyar ini berhasil menjadi ikon kuliner di Ubud. Pengunjung Babi Guling kebanyakan wisatawan-wisatawan asing yang sedang berada di Ubud.");
        tempat1.add("Jalan Tegal Sari No. 2, Ubud Tengah, Ubud, Kabupaten Gianyar ");
        nomor1.add("Rp 50.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-babi-guling-candra1-1170x780.jpg");
        mNames1.add("Babi Guling Candra");
        mDesc1.add("Denpasar");
        mImageDet1.add("Untuk seporsi nasi babi guling special, terdiri dari sepiring nasi putih, semangkuk sup dan sepiring penuh hasil olahan babi. Ada sate babi yang rasanya manis, daging babi yang disuwir, paru, usus, kerupuk kulit, kulit babi yang kres kres dan sayuran yang dimasak dengan bumbu Bali..");
        tempat1.add("Jalan Teuku Umar no 140");
        nomor1.add("Rp. 30.000,-");
        rating1.add((float)5);


        mImageUrls1.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames1.add("Surya Agung Babi Guling");
        mDesc1.add("Jembrana");
        mImageDet1.add("Warung Surya Agung Babi Guling menyediakan menu babi guling dengan cita rasa yang berbeda dari cita rasa babi guling yang lain.");
        tempat1.add("Jl. Yudistira Jembrana ");
        nomor1.add("Rp 30.000,-");
        rating1.add((float)5);

        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.pork);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);

    }

}
