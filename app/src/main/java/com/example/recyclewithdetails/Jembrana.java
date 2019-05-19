package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Jembrana extends AppCompatActivity {

    String tittle = "Jembrana";
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
        setContentView(R.layout.activity_jembrana);
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
        mImageUrls1.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames1.add("Ayam Betutu Men Tempeh");
                mDesc1.add("Jembrana");
        mImageDet1.add("Untuk paket seharga Rp 60.000 anda akan mendapatkan seperempat ayam betutu, 1 bakul nasi, 1 porsi sayur, sambal dan kacang. Sedangkan jika memilih paket seharga Rp 114.000 anda akan mendaptakan 1 ayam betutu, 1 bakul nasi, 1 porsi sayur, sambal dan kacang.");
        tempat1.add("Jl. Raya Gilimanuk, Melaya, Jembrana ");
        nomor1.add("Rp 60.000,-");
        rating1.add((float)4.7);

        mImageUrls1.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames1.add("Surya Agung Babi Guling");
                mDesc1.add("Jembrana");
        mImageDet1.add("Warung Surya Agung Babi Guling menyediakan menu babi guling dengan cita rasa yang berbeda dari cita rasa babi guling yang lain.");
        tempat1.add("Jl. Yudistira Jembrana ");
        nomor1.add("Rp 30.000,-");
        rating1.add((float)4);


        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_jembrana);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
