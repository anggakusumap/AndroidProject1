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
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    private ArrayList<Float> rating1 = new ArrayList<>();

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
        mImageUrls1.add("https://b.zmtcdn.com/data/pictures/6/1704596/91dc322cd871009a998eda10606a4477_featured_v2.jpg");
        mNames1.add("Sate Babi Bawah Pohon");
        mDesc1.add("Badung");
        mImageDet1.add("Sate Babi Bawah Pohon menyediakan menu utama yaitu sate babi dan sate lilit. Selain itu juga menyediakan siobak babi, soto babi dan juga pepes. ");
        tempat1.add("Jl. Campuhan I - Dewi Sri No.IV, Legian, Kuta");
        nomor1.add("Rp. 25.000,-");
        rating1.add((float)4.7);

        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/05/Sate-Bik-Ngah.jpg");
        mNames1.add("Sate Bik Ngah");
        mDesc1.add("Singaraja");
        mImageDet1.add("Sate bik ngah sudah terkenal sejak tahun 1960. Jenis sate yang ditawarkan juga banyak, diantaranya adalah sate sapi, sate sapi manis, sate kakul dan sate serapah.");
        tempat1.add("Jalan Surapati, Singaraja");
        nomor1.add("Rp. 15.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://gungrangga.files.wordpress.com/2017/07/sate-ikan-pantai-lebih.jpg");
        mNames1.add("Sate Lebih Gianyar ");
        mDesc1.add("Gianyar");
        mImageDet1.add("Sate di pantai lebih merupakan salah satu sate ikan legendaris Bali.");
        tempat1.add("Jl. Prof. Dr. Ida Bagus Mantra, Gianyar, Bali");
        nomor1.add("Rp 20.000,-");
        rating1.add((float)3.5);

        mImageUrls1.add("https://paonwimas.files.wordpress.com/2018/03/img_5537.jpg?w=696");
        mNames1.add("Sate Babi Cengolo");
        mDesc1.add("Tabanan");
        mImageDet1.add("Sate Babi Cengolo ini cenderung manis rasanya. Karena dicampur bumbu kacang dan kecap. Potongan dagingnya juga tidak terlalu besar jadi empuk banget pas digigit gak alot sama sekali");
        tempat1.add("Jl. Yeh Gangga, Sudimara, Tabanan, Bali. ");
        nomor1.add("Rp 20.000,-");
        rating1.add((float)5);


        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-sate-plecing-arjuna1-1170x780.jpg");
        mNames1.add("Sate Plecing Arjuna");
        mDesc1.add("Denpasar");
        mImageDet1.add("Menu utama yang disajikan disini adalah babi, namun ada juga sate ayam. Bumbu sate ini menggunakan sambal plecing yang terbuat dari racikan bawang putih, kemiri dan terasi.");
        tempat1.add("Jalan Teuku Umar no 140");
        nomor1.add("Rp. 24.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://1.bp.blogspot.com/-T7Urbd60iHA/W2FamJ2DFQI/AAAAAAAAASI/-5118Fxu3aMyBYOAD35b2v2lYAuptZKYgCLcBGAs/s1600/Sate-Bledor-1-860x484.jpg");
        mNames1.add("Sate Bledor");
        mDesc1.add("Badung");
        mImageDet1.add("Sate babi yang sudah dilumuri bumbu kacang disuguhkan dalam piring plastik berukuran kecil ini memiliki rasa yang cukup unik dengan bumbu kacangnya. Sambal bejek yang terdiri dari bawang, lombok, dan bongkot juga membawa pengalaman rasa baru bagi kalian yang pertama kali mencicipi kuliner khas Bali.");
        tempat1.add("Jalan Raya Sangeh, Sangeh, Abiansemal");
        nomor1.add("Rp. 10.000,-");
        rating1.add((float)4.6);

        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.sate);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);

    }

}
