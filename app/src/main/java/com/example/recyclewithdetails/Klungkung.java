package com.example.recyclewithdetails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Klungkung extends AppCompatActivity {

    String tittle = "Klungkung";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klungkung);
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
        mImageUrls1.add("https://cfcdn2.azsg.opensnap.com/azsg/snapphoto/photo/LL/H29C/3DC2JM828791F5982043E5lv.jpg");
        mNames1.add("Warung Lesehan Mertha Sari");
        mDesc1.add("Klungkung");
        mImageDet1.add("Untuk satu paket makanan yang disajikan meliputi semangkuk sup ikan bumbu rempah, sepiring sayur yang dimasak ala Bali, sepiring sambal matah, sepiring kacang tanah sangrai dan yang lauk utamanya sepaket masakan hasil olahan dari ikan laut. Ada sate lilit, sate ikan bumbu dan pepes atau tum ikan yang masing-masing berjumlah 2 buah. ");
        tempat1.add("Jl. Kresna, Pesinggahan, Dawan");
        nomor1.add("Rp. 30.000,-");

        mImageUrls1.add("https://cfcdn2.azsg.opensnap.com/azsg/snapphoto/photo/LB/GUIO/3BT0WI18D4BD2ECF8C9B9Elv.jpg");
        mNames1.add("Warung Serombotan Bu Awi");
        mDesc1.add("Klungkung");
        mImageDet1.add("Warung serombotan nek rauh menyediakan makanan khas klungkung yaitu serombotan. Selain itu warung ini juga menyediakan menu lain seperti tipat cantok, tipat kuah dan plecing kangkung.");
        tempat1.add("Jalan Sampalan Tengah");
        nomor1.add("Rp. 20.000,-");
        mImageUrls1.add("http://2.bp.blogspot.com/-ngYDWs8duVA/VRa3a6DjeII/AAAAAAAAGQY/myNTGN6TmmU/s1600/15.jpg");
        mNames1.add("Warung Jumpung");
        mDesc1.add("Klungkung");
        mImageDet1.add("Menu yang disediakan kebanyakan adalah menu ikan yang ikan nya mereka budi dayakan sendiri. Ada 2 jenis ikan, yaitu Nila dan Gurami. Ikan yang ingin dipesan bisa dipilih mau di goreng, di bakar, atau di nyat-nyat (dimasak dengan bumbu khas Bali). Selain menu ikan, ada juga menu Srosob Ceker. ");
        tempat1.add("Jalan Rama no 104, Semarapura");
        nomor1.add("Rp. 40.000,-");

        mImageUrls1.add("https://scontent-sea1-1.cdninstagram.com/vp/b3889c16dab0df7d636b7920fce81093/5D1BC929/t51.2885-15/sh0.08/e35/s750x750/51747511_243866226519267_5651804566406822285_n.jpg?_nc_ht=scontent-sea1-1.cdninstagram.com&ig_cache_key=MTk4MjQ5OTM3NjM3MjA4MzUwNQ%3D%3D.2");
        mNames1.add("Ayam Goreng Pademangan");
        mDesc1.add("Klungkung");
        mImageDet1.add("Menu yang disajikan adalah Ayam Goreng Pademangan dan juga Tempe Penyet nya dengan bumbu sambal pedasnya");
        tempat1.add("Jalan Flamboyan, Semarapura");
        nomor1.add("Rp. 20.000,-");

        mImageUrls1.add("https://www.kulkulbali.co/pics/298/IMG_20150419_173245.jpg");
        mNames1.add("Warung Mie Koples");
        mDesc1.add("Klungkung");
        mImageDet1.add("Mie Koples memiliki rasa yang gurih dan pedas. Mie koples bahan utamanya menggunakan bihun serta disiram dengan kuah koples. Bumbu atau kuah koplesnya terbuat dari kacang tanah yang dihaluskan lalu dicampurkan dengan terasi panggang, sedikit minyak kelapa, jeruk limo dan gula merah.");
        tempat1.add("Jalan Anggrek no 22, Semarapura");
        nomor1.add("Rp. 5.000,-");



        showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.lokasi_klungkung);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,tempat1, nomor1);
        recyclerView.setAdapter(adapter);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
