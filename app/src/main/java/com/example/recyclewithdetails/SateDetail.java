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

public class SateDetail extends AppCompatActivity {
    String tittle = "Sate";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> posisi1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sate_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setGambar();
        setActionBarTittle(tittle);
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

    private void setActionBarTittle(String tittle){
        getSupportActionBar().setTitle(tittle);
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
        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/editors-note-sate-babi-bawah-pohon-1170x780.jpg");
        mNames1.add("Sate Babi Bawah Pohon");
        mDesc1.add("Kuta");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("http://nomnombali.com/wp-content/uploads/2019/03/0000_0000_00000000351-02-01-e1552286091372-1170x827.jpeg");
        mNames1.add("Sate Plecing Mak Lukluk");
        mDesc1.add("Dalung");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://lh3.googleusercontent.com/1jk_nwpU1yQnjBhA-D8uaHiHElRGX5PYz9s5ULE32DW8JL8Pt_-cbXNPoreVGIgcCSkcdlqG=w1080-h608-p-no-v0");
        mNames1.add("Sate Ayam Babi Oka");
        mDesc1.add("Denpasar");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.sate);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1);
        recyclerView.setAdapter(adapter);

    }

}
