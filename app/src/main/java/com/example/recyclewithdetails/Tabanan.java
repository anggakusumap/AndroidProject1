package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Tabanan extends AppCompatActivity {
    String tittle = "Tabanan";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();

    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabanan);
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
        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/11/Sekian-Tempat-Kuliner-Legendaris-di-Tabanan-Bali-Ada-yang-Sejak-1938-Lho-4.jpg");
        mNames1.add("Nasi Lawar Asri Jambe");
        mDesc1.add("Tabanan");
        mImageDet1.add("Nasi lawar di sini disajikan komplit bersama dengan be manis atau olahan daging babi seperti rendang, daging cincang babi, tum, daging suwir, sate lilit, kerupuk babi, dan semangkuk kuah kaldu. ");
        tempat1.add("Jl. Jalak Putih No. 1, Tabanan");
        nomor1.add("Rp 30.000,-");

        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/11/Sekian-Tempat-Kuliner-Legendaris-di-Tabanan-Bali-Ada-yang-Sejak-1938-Lho-3.jpg");
        mNames1.add("Laklak Biu Men Bayu");
        mDesc1.add("Tabanan");
        mImageDet1.add("Laklak Biu ini merupakan kuliner berbahan dasar kelapa parut, tepung terigu, tepung beras, tepung kanji dan juga pisang yang dipotong tipis-tipis.");
        tempat1.add("Jl. Raya Babahan Sengaan No. 13, Penebel, Tabanan");
        nomor1.add("Rp 10.000,-");

        mImageUrls1.add("https://paonwimas.files.wordpress.com/2018/03/img_5537.jpg?w=696");
        mNames1.add("Sate Babi Cengolo");
        mDesc1.add("Tabanan");
        mImageDet1.add("Sate Babi Cengolo ini cenderung manis rasanya. Karena dicampur bumbu kacang dan kecap. Potongan dagingnya juga tidak terlalu besar jadi empuk banget pas digigit gak alot sama sekali");
        tempat1.add("Jl. Yeh Gangga, Sudimara, Tabanan, Bali. ");
        nomor1.add("Rp 20.000,-");



        mImageUrls1.add("https://3.bp.blogspot.com/-47ZQrI_FcDw/V_zt8PrHAKI/AAAAAAAAAYs/xPIVgfqJIq81QbiReeMleiPRs4-yYLpKwCLcB/s1600/sate-soto-babat-warung-sepek-tabanan-1.jpg");
        mNames1.add("Soto Babad Warung Eri");
        mDesc1.add("Tabanan");
        mImageDet1.add(" Soto Babad Warung Eri menyuguhkan olahan soto babad yang dibuat dari resep turun temurun. Ciri khasnya terletak pada kuah kaldunya yang guring, dan tekstur daging yang tidak alot");
        tempat1.add("Jl. Kaswari, Dauh Peken, Kec. Tabanan, Kabupaten Tabanan");
        nomor1.add("Rp 20.000,-");

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/bf/1e/6e/babi-guling-slingsing.jpg");
        mNames1.add("Babi Guling Slingsing Bu Suci");
        mDesc1.add("Tabanan");
        mImageDet1.add("Babi Guling Slingsing memiliki pelanggan bukan hanya warga lokal saja, bahkan wisatawan luar daerah dan mancanegara sering makan di warung ini");
        tempat1.add("Jl. Desa Cepaka No.33, Cepaka, Kediri, Kabupaten Tabanan, ");
        nomor1.add("Rp 25.000,-");


        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_tabanan);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
