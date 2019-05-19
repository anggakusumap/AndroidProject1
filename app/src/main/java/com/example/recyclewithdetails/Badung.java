package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Badung extends AppCompatActivity {
    String tittle = "Badung";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<Float> rating1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badung);
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
        mImageUrls1.add("https://1.bp.blogspot.com/-T7Urbd60iHA/W2FamJ2DFQI/AAAAAAAAASI/-5118Fxu3aMyBYOAD35b2v2lYAuptZKYgCLcBGAs/s1600/Sate-Bledor-1-860x484.jpg");
        mNames1.add("Sate Bledor");
        mDesc1.add("Badung");
        mImageDet1.add("Sate babi yang sudah dilumuri bumbu kacang disuguhkan dalam piring plastik berukuran kecil ini memiliki rasa yang cukup unik dengan bumbu kacangnya. Sambal bejek yang terdiri dari bawang, lombok, dan bongkot juga membawa pengalaman rasa baru bagi kalian yang pertama kali mencicipi kuliner khas Bali.");
        tempat1.add("Jalan Raya Sangeh, Sangeh, Abiansemal");
        nomor1.add("Rp. 10.000,-");
        rating1.add((float)4.6);

        mImageUrls1.add("https://cdn02.tiket.photos/img/business/i/h/business-ihsiafaf.l.jpg");
        mNames1.add("Nasi Pedas Ibu Andika");
        mDesc1.add("Badung");
        mImageDet1.add("Di warung nasi ini pengunjung akan mendapati berjejer lauk pauk khas Indonesia yang menggoda selera. Misalnya ayam suir, ayam goreng, ikan goreng garing, lawar (sayuran khas Bali), sayur singkong, sayur labu, dan lainnya. ");
        tempat1.add("Jalan Blambangan no 55");
        nomor1.add("Rp. 30.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://cdn.water-sport-bali.com/wp-content/uploads/2017/09/Nasi-Campur-Warung-Wardani-Tuban-Kuta.jpg");
        mNames1.add("Warung Wardani Tuban");
        mDesc1.add("Badung");
        mImageDet1.add("Warung Wardani Tuban menyediakan sate lilit dan sambal matah yang pedas. Selain itu, warung ini juga menyediakan soto ayam dang ado-gado. ");
        tempat1.add("Jalan Waringin no 3, Tuban");
        nomor1.add("Rp. 37.500,-");
        rating1.add((float)3);

        mImageUrls1.add("https://b.zmtcdn.com/data/pictures/6/1704596/91dc322cd871009a998eda10606a4477_featured_v2.jpg");
        mNames1.add("Sate Babi Bawah Pohon");
        mDesc1.add("Badung");
        mImageDet1.add("Sate Babi Bawah Pohon menyediakan menu utama yaitu sate babi dan sate lilit. Selain itu juga menyediakan siobak babi, soto babi dan juga pepes. ");
        tempat1.add("Jl. Campuhan I - Dewi Sri No.IV, Legian, Kuta");
        nomor1.add("Rp. 25.000,-");
        rating1.add((float)4.7);

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/11/66/96/05/warung-nasi-ayam-bu-oki.jpg");
        mNames1.add("Nasi Ayam Bu Oki");
        mDesc1.add("Badung");
        mImageDet1.add("Di sini kamu bisa memilih langsung ingin isian yang seperti apa. Bisa yang sedikit, sedang hingga melimpah ruah. Paduan ayam kampung yang dimasak dengan base genep (racikan rempah khas Bali), sambal matah yang wangi, renyahnya kacang dan sate lilit yang dibakar. ");
        tempat1.add("Jl. Celagi Basur No.3Y, Jimbaran");
        nomor1.add("Rp. 25.000,-");
        rating1.add((float)4);

        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_badung);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}
