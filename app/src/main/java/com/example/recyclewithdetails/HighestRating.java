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

public class HighestRating extends AppCompatActivity {
    String tittle = "Highest Rating";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();

    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_rating);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setGambar();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        mImageUrls1.add("https://cdn.water-sport-bali.com/wp-content/uploads/2012/11/menu-ibu-oka-ubud.jpg");
        mNames1.add("Babi Guling Bu Oka");
        mDesc1.add("Ubud");
        mImageDet1.add("24 Juni 1987");

        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-babi-guling-candra1-1170x780.jpg");
        mNames1.add("Babi Guling Candra");
        mDesc1.add("Denpasar");
        mImageDet1.add("24 Juni 1987");

        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://cdn.idntimes.com/content-images/post/20151223/slingsing-2da33ed8de1acce828ed43803489133e.PNG");
        mNames1.add("Babi Guling Slingsing");
        mDesc1.add("Tabanan");
        mImageDet1.add("24 Juni 1987");

        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://cdn.idntimes.com/content-images/post/20151223/slingsing-2da33ed8de1acce828ed43803489133e.PNG");
        mNames1.add("Babi Guling Slingsing");
        mDesc1.add("Tabanan");
        mImageDet1.add("24 Juni 1987");

        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://cdn.idntimes.com/content-images/post/20151223/slingsing-2da33ed8de1acce828ed43803489133e.PNG");
        mNames1.add("Babi Guling Slingsing");
        mDesc1.add("Tabanan");
        mImageDet1.add("24 Juni 1987");

        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.highest);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }



}
