package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Gianyar extends AppCompatActivity {
    String tittle = "Gianyar";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();

    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gianyar);
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
        mImageUrls1.add("https://www.tripsavvy.com/thmb/_pbV3fLDF_ZJiTyNf5EUFUu9nG4=/960x0/filters:no_upscale():max_bytes(150000):strip_icc()/babi-guling_ibu-oka-58351a243df78c6f6acce39c.jpg ");
        mNames1.add("Babi Guling Ibu Oka");
        mDesc1.add("Gianyar");
        mImageDet1.add("Babi Guling terkenal dari Ubud Gianyar ini berhasil menjadi ikon kuliner di Ubud. Pengunjung Babi Guling kebanyakan wisatawan-wisatawan asing yang sedang berada di Ubud.");
                tempat1.add("Jalan Tegal Sari No. 2, Ubud Tengah, Ubud, Kabupaten Gianyar ");
        nomor1.add("Rp 50.000,-");

        mImageUrls1.add("https://www.gotravelly.com/blog/wp-content/uploads/2019/03/nasi-jinggo-sambal-ijo-1024x768.jpg");
        mNames1.add("Nasi Jinggo Gorong");
        mDesc1.add("Gianyar");
        mImageDet1.add("Warga Gianyar menyebutnya warung Gorong, yang dijual disini mulai dari nasi jinggo, sampai jajan jajanan dijual disini. Harganya juga murah banget!.");
                tempat1.add("Jalan Raya Dharmagiri, Gianyar");
        nomor1.add("Rp 5.000,-");

        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/07/Nasi-Ayam-Kedewatan-Ibu-Mangku-di-Bali-Kenikmatan-Melegenda-Sejak-1960-an-1.jpg");
        mNames1.add("Nasi Ayam Ibu Kadewatan");
        mDesc1.add("Gianyar");
        mImageDet1.add("Nasi Ayam Ibu Mangku merupakan salah satu makanan legendaris di Bali yang menawarkan nasi campur ayam komplit..");
        tempat1.add("Jl. Raya Kedewatan No.18, Kedewatan, Ubud, Kabupaten Gianyar");
        nomor1.add("Rp 25.000,-");

        mImageUrls1.add("https://gungrangga.files.wordpress.com/2017/07/sate-ikan-pantai-lebih.jpg");
        mNames1.add("Sate Lebih Gianyar ");
        mDesc1.add("Gianyar");
        mImageDet1.add("Sate di pantai lebih merupakan salah satu sate ikan legendaris Bali.");
        tempat1.add("Jl. Prof. Dr. Ida Bagus Mantra, Gianyar, Bali");
        nomor1.add("Rp 20.000,-");

        mImageUrls1.add("https://1.bp.blogspot.com/-ZDKZHvY-YaE/Wn66coKjHCI/AAAAAAAACss/Kw1YnN_hIw0_6P4Z07uGgd64x6FNI0m3gCLcBGAs/s640/20180118_091442.jpg");
        mNames1.add("Nasi Ayam Pasar Senggol Gianyar");
                mDesc1.add("Gianyar");
        mImageDet1.add("Nasi Ayam di Pasar Senggol Gianyar sangat terkenal di Gianyar porsi dan isiannya yang banyak membuatnya menjadi primadona");
        tempat1.add("Jl. Ngurah Rai, Gianyar, Bali");
        nomor1.add("Rp 25.000,-");



        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_gianyar);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1);
        recyclerView.setAdapter(adapter);

    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}
