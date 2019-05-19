package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Bangli extends AppCompatActivity {
    String tittle = "Bangli";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangli);
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

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/06/be/fe/65/midori-warung.jpg");
        mNames1.add("Warung Midori");
                mDesc1.add("Bangli");
        mImageDet1.add("Warung Midori adalah salah satu warung makan yang menawarkan menu andalannya yaitu Mujair Nyat-Nyat.");
        tempat1.add("Jl. Merdeka no. 108B, Bangli ");
        nomor1.add("Rp 43.000,-");

        mImageUrls1.add("https://www.kintamani.id/wp-content/uploads/Rumah-Makan-Pak-Bagung-Bali-1-1024x683.jpg");
        mNames1.add("Warung Pak Bagong");
                mDesc1.add("Bangli");
        mImageDet1.add("Sajian nila yang diberikan di tempat ini juga disertai dengan bumbu-bumbu yang membuatnya terasa begitu lezat. Secara khusus, nyatnyat merupakan cara memasak ikan nila dan mujair yang digoreng kering.");
        tempat1.add("Jl. LC Subak Aya, Bebalang, Bangli ");
        nomor1.add("Rp 40.000,-");


        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_bangli);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}
