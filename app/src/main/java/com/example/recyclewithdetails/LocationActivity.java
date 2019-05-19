package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity  {
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<Integer> mImageUrls1 = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        setGambar();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
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

//    public void denpasar(View view){
//        Intent i = new Intent(this, Denpasar.class);
//        startActivity(i);
//    }
//
//    public void badung(View view){
//        Intent i = new Intent(this, Badung.class);
//        startActivity(i);
//    }
//
//    public void tabanan(View view){
//        Intent i = new Intent(this, Tabanan.class);
//        startActivity(i);
//    }
//
//    public void singaraja(View view){
//        Intent i = new Intent(this, Singaraja.class);
//        startActivity(i);
//    }
//
//    public void jembrana(View view){
//        Intent i = new Intent(this, Jembrana.class);
//        startActivity(i);
//    }
//
//    public void bangli(View view){
//        Intent i = new Intent(this, Bangli.class);
//        startActivity(i);
//    }

//    public void karangasem(View view){
//        Intent i = new Intent(this, Karangasem.class);
//        startActivity(i);
//    }
//
//    public void gianyar(View view){
//        Intent i = new Intent(this, Gianyar.class);
//        startActivity(i);
//    }

    private void setGambar() {
        mImageUrls1.add(R.drawable.denpasar);
        mDesc1.add("Denpasar");

        mImageUrls1.add(R.drawable.badung);
        mDesc1.add("Badung");

        mImageUrls1.add(R.drawable.gianyar);
        mDesc1.add("Gianyar");

        mImageUrls1.add(R.drawable.jembrana);
        mDesc1.add("Jembrana");

        mImageUrls1.add(R.drawable.karangasem);
        mDesc1.add("Karangasem");

        mImageUrls1.add(R.drawable.singaraja);
        mDesc1.add("Singaraja");

        mImageUrls1.add(R.drawable.tabanan);
        mDesc1.add("Tabanan");

        mImageUrls1.add(R.drawable.bangli);
        mDesc1.add("Bangli");

        mImageUrls1.add(R.drawable.klungkung1);
        mDesc1.add("Klungkung");

        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        GridActivity adapter = new GridActivity(this, mImageUrls1, mDesc1);
        recyclerView.setAdapter(adapter);

    }
}
