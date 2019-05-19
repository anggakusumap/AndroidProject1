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
    private ArrayList<Float> rating1 = new ArrayList<>();

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
        mImageUrls1.add("https://media.travelingyuk.com/wp-content/uploads/2018/07/Nasi-Ayam-Kedewatan-Ibu-Mangku-di-Bali-Kenikmatan-Melegenda-Sejak-1960-an-1.jpg");
        mNames1.add("Nasi Ayam Kedewatan Ibu Mangku");
        mDesc1.add("Ubud");
        mImageDet1.add("Nasi campur Warung ibu Mangku yaitu terdiri dari ayam betutu suir, sambal matah, jukut sayuran / urapan, sambal cabe goreng dicampur dengan minyak kelapa, telor pindang Bali juga dilengkapi dengan sate lilit");
        tempat1.add("Jl. Kayu Jati no.12 Ubud");
        nomor1.add("Rp. 25.000,-");
        rating1.add((float)4.2);

        mImageUrls1.add("https://4.bp.blogspot.com/-Avs1pdyc3eM/VT78mHiWy1I/AAAAAAAAE5I/4BrHlLWsxtw/s1600/20150220_133220.jpg");
        mNames1.add("Siobak Khe Lok");
        mDesc1.add("Singaraja");
        mImageDet1.add("Dalam proses pembuatannya, daging babi diolah dengan cara direbus dan dicampur dengan kecap manis serta kecap asin. Tidak ketinggalan, juga perlu menambahkan beragam jenis rempah-rempah. ");
        tempat1.add("Jalan Surapati No.66, Buleleng");
        nomor1.add("Rp. 35.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/bf/1e/6e/babi-guling-slingsing.jpg");
        mNames1.add("Babi Guling Slingsing Bu Suci");
        mDesc1.add("Tabanan");
        mImageDet1.add("Babi Guling Slingsing memiliki pelanggan bukan hanya warga lokal saja, bahkan wisatawan luar daerah dan mancanegara sering makan di warung ini");
        tempat1.add("Jl. Desa Cepaka No.33, Cepaka, Kediri, Kabupaten Tabanan, ");
        nomor1.add("Rp 25.000,-");
        rating1.add((float)3.5);

        mImageUrls1.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames1.add("Ayam Betutu Men Tempeh");
                mDesc1.add("Jembrana");
        mImageDet1.add("Untuk paket seharga Rp 60.000 anda akan mendapatkan seperempat ayam betutu, 1 bakul nasi, 1 porsi sayur, sambal dan kacang. Sedangkan jika memilih paket seharga Rp 114.000 anda akan mendaptakan 1 ayam betutu, 1 bakul nasi, 1 porsi sayur, sambal dan kacang.");
        tempat1.add("Jl. Raya Gilimanuk, Melaya, Jembrana ");
        nomor1.add("Rp 60.000,-");
        rating1.add((float)5);

        mImageUrls1.add("https://cfcdn2.azsg.opensnap.com/azsg/snapphoto/photo/LL/H29C/3DC2JM828791F5982043E5lv.jpg");
        mNames1.add("Warung Lesehan Mertha Sari");
        mDesc1.add("Klungkung");
        mImageDet1.add("Untuk satu paket makanan yang disajikan meliputi semangkuk sup ikan bumbu rempah, sepiring sayur yang dimasak ala Bali, sepiring sambal matah, sepiring kacang tanah sangrai dan yang lauk utamanya sepaket masakan hasil olahan dari ikan laut. Ada sate lilit, sate ikan bumbu dan pepes atau tum ikan yang masing-masing berjumlah 2 buah. ");
        tempat1.add("Jl. Kresna, Pesinggahan, Dawan");
        nomor1.add("Rp. 30.000,-");
        rating1.add((float)4.8);

        mImageUrls1.add("https://media-cdn.tripadvisor.com/media/photo-s/11/66/96/05/warung-nasi-ayam-bu-oki.jpg");
        mNames1.add("Nasi Ayam Bu Oki");
        mDesc1.add("Badung");
        mImageDet1.add("Di sini kamu bisa memilih langsung ingin isian yang seperti apa. Bisa yang sedikit, sedang hingga melimpah ruah. Paduan ayam kampung yang dimasak dengan base genep (racikan rempah khas Bali), sambal matah yang wangi, renyahnya kacang dan sate lilit yang dibakar. ");
        tempat1.add("Jl. Celagi Basur No.3Y, Jimbaran");
        nomor1.add("Rp. 25.000,-");
        rating1.add((float)4.5);
        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.highest);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1, rating1);
        recyclerView.setAdapter(adapter);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}
