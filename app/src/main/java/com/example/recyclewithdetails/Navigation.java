package com.example.recyclewithdetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private String title = "Pakar Makanan";
    final String STATE_TITLE = "state_string";
    final String STATE_MODE = "state_mode";
    int mode;

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();
    private ArrayList<String> posisi = new ArrayList<>();
    private ArrayList<String> tempat = new ArrayList<>();
    private ArrayList<String> nomor = new ArrayList<>();
    private ArrayList<Float> rating = new ArrayList<>();

    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    private ArrayList<Float> rating1 = new ArrayList<>();

    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mDesc2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mImageDet2 = new ArrayList<>();
    private ArrayList<String> posisi2 = new ArrayList<>();
    private ArrayList<String> tempat2 = new ArrayList<>();
    private ArrayList<String> nomor2 = new ArrayList<>();
    private ArrayList<Float> rating2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        initImageBitmaps();

        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        setActionBarTittle(title);
    }





    private void initImageBitmaps() {
        mImageUrls.add("https://media.travelingyuk.com/wp-content/uploads/2018/07/Nasi-Ayam-Kedewatan-Ibu-Mangku-di-Bali-Kenikmatan-Melegenda-Sejak-1960-an-1.jpg");
        mNames.add("Nasi Ayam Kedewatan Ibu Mangku");
        mDesc.add("Ubud");
        mImageDet.add("Nasi campur Warung ibu Mangku yaitu terdiri dari ayam betutu suir, sambal matah, jukut sayuran / urapan, sambal cabe goreng dicampur dengan minyak kelapa, telor pindang Bali juga dilengkapi dengan sate lilit");
        tempat.add("Jl. Kayu Jati no.12 Ubud");
        nomor.add("Rp. 25.000,-");
        rating.add((float)4.2);

        mImageUrls.add("https://4.bp.blogspot.com/-Avs1pdyc3eM/VT78mHiWy1I/AAAAAAAAE5I/4BrHlLWsxtw/s1600/20150220_133220.jpg");
        mNames.add("Siobak Khe Lok");
        mDesc.add("Singaraja");
        mImageDet.add("Dalam proses pembuatannya, daging babi diolah dengan cara direbus dan dicampur dengan kecap manis serta kecap asin. Tidak ketinggalan, juga perlu menambahkan beragam jenis rempah-rempah. ");
        tempat.add("Jalan Surapati No.66, Buleleng");
        nomor.add("Rp. 35.000,-");
        rating.add((float)4);

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/bf/1e/6e/babi-guling-slingsing.jpg");
        mNames.add("Babi Guling Slingsing Bu Suci");
        mDesc.add("Tabanan");
        mImageDet.add("Babi Guling Slingsing memiliki pelanggan bukan hanya warga lokal saja, bahkan wisatawan luar daerah dan mancanegara sering makan di warung ini");
        tempat.add("Jl. Desa Cepaka No.33, Cepaka, Kediri, Kabupaten Tabanan, ");
        nomor.add("Rp 25.000,-");
        rating.add((float)3.5);

        mImageUrls.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames.add("Ayam Betutu Men Tempeh");
        mDesc.add("Jembrana");
        mImageDet.add("Untuk paket seharga Rp 60.000 anda akan mendapatkan seperempat ayam betutu, 1 bakul nasi, 1 porsi sayur, sambal dan kacang. Sedangkan jika memilih paket seharga Rp 114.000 anda akan mendaptakan 1 ayam betutu, 1 bakul nasi, 1 porsi sayur, sambal dan kacang.");
        tempat.add("Jl. Raya Gilimanuk, Melaya, Jembrana ");
        nomor.add("Rp 60.000,-");
        rating.add((float)5);

        mImageUrls1.add("https://balikami.com/wp-content/uploads/2017/10/Betutu-Men-Tempeh.jpg");
        mNames1.add("Babi Guling Surya Agung");
        mDesc1.add("Jembrana");
        mImageDet1.add("Warung Surya Agung Babi Guling menyediakan menu babi guling dengan cita rasa yang berbeda dari cita rasa babi guling yang lain.");
        tempat1.add("Jl. Yudistira Jembrana ");
        nomor1.add("Rp 30.000,-");
        rating1.add((float)4.5);

        mImageUrls1.add("https://www.tripsavvy.com/thmb/_pbV3fLDF_ZJiTyNf5EUFUu9nG4=/960x0/filters:no_upscale():max_bytes(150000):strip_icc()/babi-guling_ibu-oka-58351a243df78c6f6acce39c.jpg");
        mNames1.add("Babi Guling Ibu Oka");
        mDesc1.add("Gianyar");
        mImageDet1.add("Babi Guling terkenal dari Ubud Gianyar ini berhasil menjadi ikon kuliner di Ubud. Pengunjung Babi Guling kebanyakan wisatawan-wisatawan asing yang sedang berada di Ubud.");
        tempat1.add("Jalan Tegal Sari No. 2, Ubud Tengah, Ubud, Kabupaten Gianyar ");
        nomor1.add("Rp 50.000,-");
        rating1.add((float)4);

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-babi-guling-candra1-1170x780.jpg");
        mNames1.add("Babi Guling Candra");
        mDesc1.add("Denpasar");
        mImageDet1.add("Untuk seporsi nasi babi guling special, terdiri dari sepiring nasi putih, semangkuk sup dan sepiring penuh hasil olahan babi. Ada sate babi yang rasanya manis, daging babi yang disuwir, paru, usus, kerupuk kulit, kulit babi yang kres kres dan sayuran yang dimasak dengan bumbu Bali..");
        tempat1.add("Jalan Teuku Umar no 140");
        nomor1.add("Rp. 30.000,-");
        rating1.add((float)5);

        mImageUrls2.add("https://b.zmtcdn.com/data/pictures/6/1704596/91dc322cd871009a998eda10606a4477_featured_v2.jpg");
        mNames2.add("Sate Babi Bawah Pohon");
        mDesc2.add("Badung");
        mImageDet2.add("Sate Babi Bawah Pohon menyediakan menu utama yaitu sate babi dan sate lilit. Selain itu juga menyediakan siobak babi, soto babi dan juga pepes. ");
        tempat2.add("Jl. Campuhan I - Dewi Sri No.IV, Legian, Kuta");
        nomor2.add("Rp. 25.000,-");
        rating2.add((float)4.7);

        mImageUrls2.add("https://media.travelingyuk.com/wp-content/uploads/2018/05/Sate-Bik-Ngah.jpg");
        mNames2.add("Sate Bik Ngah");
        mDesc2.add("Singaraja");
        mImageDet2.add("Sate bik ngah sudah terkenal sejak tahun 1960. Jenis sate yang ditawarkan juga banyak, diantaranya adalah sate sapi, sate sapi manis, sate kakul dan sate serapah.");
        tempat2.add("Jalan Surapati, Singaraja");
        nomor2.add("Rp. 15.000,-");
        rating2.add((float)4);

        mImageUrls2.add("https://gungrangga.files.wordpress.com/2017/07/sate-ikan-pantai-lebih.jpg");
        mNames2.add("Sate Lebih Gianyar ");
        mDesc2.add("Gianyar");
        mImageDet2.add("Sate di pantai lebih merupakan salah satu sate ikan legendaris Bali.");
        tempat2.add("Jl. Prof. Dr. Ida Bagus Mantra, Gianyar, Bali");
        nomor2.add("Rp 20.000,-");
        rating2.add((float)3.5);

        initRecyclerView();

    }

    public void next(View view){
        Intent log = new Intent(this,HighestRating.class);
        startActivity(log);
    }

    public void babi(View view){
        Intent log = new Intent(this,KategoriSatu.class);
        startActivity(log);
    }

    public void sate(View view){
        Intent log = new Intent(this,SateDetail.class);
        startActivity(log);
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerv_view1);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerv_view2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView1.setNestedScrollingEnabled(false);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        CardActivity adapter1 = new CardActivity(this, mNames, mImageUrls, mDesc, mImageDet, posisi, tempat, nomor, rating);
        Card1Activity adapter = new Card1Activity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, tempat1, nomor1, rating1);
        Card2Activity adapter2 = new Card2Activity(this, mNames2, mImageUrls2, mDesc2, mImageDet2, tempat2, nomor2, rating2);
        recyclerView.setAdapter(adapter1);
        recyclerView1.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void setActionBarTittle(String tittle){
        getSupportActionBar().setTitle(tittle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action

        } else if (id == R.id.nav_slideshow){
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {
            Intent i = new Intent(this, About.class);
            startActivity(i);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}