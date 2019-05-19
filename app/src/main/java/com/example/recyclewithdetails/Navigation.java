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

    private String title = "Mode List";
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
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> posisi1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mDesc2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mImageDet2 = new ArrayList<>();
    private ArrayList<String> posisi2 = new ArrayList<>();
    private ArrayList<String> tempat2 = new ArrayList<>();
    private ArrayList<String> nomor2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        initImageBitmaps();

        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }


    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putInt(STATE_MODE, mode);
    }


    private void initImageBitmaps() {
        mImageUrls.add("https://media.travelingyuk.com/wp-content/uploads/2018/07/Nasi-Ayam-Kedewatan-Ibu-Mangku-di-Bali-Kenikmatan-Melegenda-Sejak-1960-an-1.jpg");
        mNames.add("Nasi Ayam Kedewatan Ibu Mangku");
        mDesc.add("Ubud");
        mImageDet.add("Nasi campur Warung ibu Mangku yaitu terdiri dari ayam betutu suir, sambal matah, jukut sayuran / urapan, sambal cabe goreng dicampur dengan minyak kelapa, telor pindang Bali juga dilengkapi dengan sate lilit");
        posisi.add("Penyerang");
        tempat.add("Jl. Kayu Jati no.12 Ubud");
        nomor.add("Rp. 25.000,-");

        mImageUrls.add("http://bali.panduanwisata.id/files/2012/03/warung-bu-komang-bali.jpg");
        mNames.add("Warung Bu Komang");
        mDesc.add("Singaraja");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Portugal");
        nomor.add("7");

        mImageUrls.add("https://www.piesusubliman.com/wp-content/uploads/2018/08/Warung-Nasi-Bali-Ibu-Sayu.jpg");
        mNames.add("Warung Nasi Bali Ibu Sayu");
        mDesc.add("Tabanan");
        mImageDet.add("Februari");
        posisi.add("Penyerang Sayap");
        tempat.add("Mesir");
        nomor.add("10");

        mImageUrls.add("http://isrilcaniago.weebly.com/uploads/1/0/6/1/106122351/ayam-betutu-men-tempeh-3_orig.png");
        mNames.add("Ayam Betutu Men Tempeh");
        mDesc.add("Jembrana");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Brazil");
        nomor.add("10");

        mImageUrls.add("https://cdn.qubicle.id/images/2018/10/03/604cbcdd-982d-4675-b89f-016590f7ba4c.jpg");
        mNames.add("Warung Lesehan Merta Sari");
        mDesc.add("Klungkung");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Perancis");
        nomor.add("7");

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/73/f5/28/fb-img-1496380561303.jpg");
        mNames.add("Nasi Ayam Bu Oki");
        mDesc.add("Badung");
        mImageDet.add("Februari");
        posisi.add("Winger");
        tempat.add("Belgia");
        nomor.add("10");

        mImageUrls1.add("https://cdn.water-sport-bali.com/wp-content/uploads/2012/11/menu-ibu-oka-ubud.jpg");
        mNames1.add("Babi Guling Bu Oka");
        mDesc1.add("Ubud");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-babi-guling-candra1-1170x780.jpg");
        mNames1.add("Babi Guling Candra");
        mDesc1.add("Denpasar");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls1.add("https://cdn.idntimes.com/content-images/post/20151223/slingsing-2da33ed8de1acce828ed43803489133e.PNG");
        mNames1.add("Babi Guling Slingsing");
        mDesc1.add("Tabanan");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls2.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/editors-note-sate-babi-bawah-pohon-1170x780.jpg");
        mNames2.add("Sate Babi Bawah Pohon");
        mDesc2.add("Kuta");
        mImageDet2.add("24 Juni 1987");
        posisi2.add("Penyerang");
        tempat2.add("Rosario,Argentina");
        nomor2.add("10");

        mImageUrls2.add("http://nomnombali.com/wp-content/uploads/2019/03/0000_0000_00000000351-02-01-e1552286091372-1170x827.jpeg");
        mNames2.add("Sate Plecing Mak Lukluk");
        mDesc2.add("Dalung");
        mImageDet2.add("24 Juni 1987");
        posisi2.add("Penyerang");
        tempat2.add("Rosario,Argentina");
        nomor2.add("10");

        mImageUrls2.add("https://lh3.googleusercontent.com/1jk_nwpU1yQnjBhA-D8uaHiHElRGX5PYz9s5ULE32DW8JL8Pt_-cbXNPoreVGIgcCSkcdlqG=w1080-h608-p-no-v0");
        mNames2.add("Sate Ayam Babi Oka");
        mDesc2.add("Denpasar");
        mImageDet2.add("24 Juni 1987");
        posisi2.add("Penyerang");
        tempat2.add("Rosario,Argentina");
        nomor2.add("10");
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
        CardActivity adapter1 = new CardActivity(this, mNames, mImageUrls, mDesc, mImageDet, posisi, tempat, nomor);
        Card1Activity adapter = new Card1Activity(this, mNames1, mImageUrls1, mDesc1, mImageDet1, posisi1, tempat1, nomor1);
        Card2Activity adapter2 = new Card2Activity(this, mNames2, mImageUrls2, mDesc2, mImageDet2, posisi2, tempat2, nomor2);
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

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}