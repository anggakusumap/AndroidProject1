package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
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
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");

        initImageBitmaps();

        if (savedInstanceState == null) {
            setActionBarTitle("Mode List");
            initRecyclerView();
            mode = R.id.action_cardview;
        } else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            setMode(stateMode);
        }

    }

    private void initImageBitmaps() {
        mImageUrls.add("https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/01/22/15481845087218.jpg");
        mNames.add("Lionel Messi");
        mDesc.add("Barcelona");
        mImageDet.add("24 Juni 1987");
        posisi.add("Penyerang");
        tempat.add("Rosario,Argentina");
        nomor.add("10");

        mImageUrls.add("https://sportshub.cbsistatic.com/i/r/2019/02/18/26859afd-b778-4b66-a05f-4935590e1b44/thumbnail/1200x675/3b5a25a26c39a916e83c4eadc2101971/ronaldo.jpg");
        mNames.add("Ronaldo");
        mDesc.add("Juventus");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Portugal");
        nomor.add("7");

        mImageUrls.add("https://cdn1-production-images-kly.akamaized.net/gHnuam4mZDdzT6cNKkfad__XedU=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2011358/original/052107500_1521466561-000_12P7QS.jpg");
        mNames.add("M. Salah");
        mDesc.add("Liverpool");
        mImageDet.add("Februari");
        posisi.add("Penyerang Sayap");
        tempat.add("Mesir");
        nomor.add("10");

        mImageUrls.add("http://bola.rakyatku.com/thumbs/img_660_442_kabar-tawa_1530600074orts.JPG");
        mNames.add("Neymar");
        mDesc.add("Paris Saint Germain");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Brazil");
        nomor.add("10");

        mImageUrls.add("https://imagesvc.timeincapp.com/v3/mm/image?url=https%3A%2F%2Fcdn-s3.si.com%2Fs3fs-public%2Fstyles%2Fmarquee_large_2x%2Fpublic%2F2018%2F10%2F07%2Fkylian-mbappe-four-goals-video.jpg%3Fitok%3DDHsORxqa&w=1000&q=70");
        mNames.add("K.Mbappe");
        mDesc.add("Paris Saint Germain");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Perancis");
        nomor.add("7");

        mImageUrls.add("https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/arsenal-fc-v-chelsea-fc-premier-league-5c444f3edeb6eeba6a000001.jpg");
        mNames.add("Eden Hazard");
        mDesc.add("Chelsea");
        mImageDet.add("Februari");
        posisi.add("Winger");
        tempat.add("Belgia");
        nomor.add("10");


        mImageUrls.add("https://img.maximummedia.ie/joe_co_uk/eyJkYXRhIjoie1widXJsXCI6XCJodHRwOlxcXC9cXFwvbWVkaWEtam9lY291ay5tYXhpbXVtbWVkaWEuaWUuczMuYW1hem9uYXdzLmNvbVxcXC93cC1jb250ZW50XFxcL3VwbG9hZHNcXFwvMjAxOFxcXC8wMVxcXC8xNzEzMjIxNVxcXC9HZXR0eUltYWdlcy04OTg3OTA3MTIuanBnXCIsXCJ3aWR0aFwiOjc2NyxcImhlaWdodFwiOjQzMSxcImRlZmF1bHRcIjpcImh0dHBzOlxcXC9cXFwvd3d3LmpvZS5jby51a1xcXC9hc3NldHNcXFwvaW1hZ2VzXFxcL2pvZWNvdWtcXFwvbm8taW1hZ2UucG5nP3Y9MjJcIixcIm9wdGlvbnNcIjpbXX0iLCJoYXNoIjoiYTI1YTNlYzczYmI2ZmI0MTE3MTY5MTdlYzdmOWExNThmZDJlZTlkMyJ9/gettyimages-898790712.jpg");
        mNames.add("Roberto Firmino");
        mDesc.add("Liverpool");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Brazil");
        nomor.add("9");

        mImageUrls.add("https://i0.wp.com/metro.co.uk/wp-content/uploads/2019/03/GettyImages-1136277683.jpg?quality=90&strip=all&zoom=1&resize=644%2C429&ssl=1");
        mNames.add("Paul Pogba");
        mDesc.add("Manchester United");
        mImageDet.add("Februari");
        posisi.add("Penyerang");
        tempat.add("Perancis");
        nomor.add("6");

        mImageUrls1.add("https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Nasi-Bali-Men-Weti-2.jpg");
        mNames1.add("Nasi Bali Men Weti");
        mDesc1.add("Kuta");
        mImageDet1.add("24 Juni 1987");
        posisi1.add("Penyerang");
        tempat1.add("Rosario,Argentina");
        nomor1.add("10");

        mImageUrls2.add("https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Nasi-Bali-Men-Weti-2.jpg");
        mNames2.add("Nasi Bali Men Weti");
        mDesc2.add("Kuta");
        mImageDet2.add("24 Juni 1987");
        posisi2.add("Penyerang");
        tempat2.add("Rosario,Argentina");
        nomor2.add("10");

        initRecyclerView();

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
    private void initRecyclerView1() {

        RecyclerView recyclerView1 = findViewById(R.id.recyclerv_view1);
        recyclerView1.setNestedScrollingEnabled(false);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        Card1Activity adapter = new Card1Activity(this, mNames, mImageUrls, mDesc, mImageDet, posisi, tempat, nomor);
        recyclerView1.setAdapter(adapter);

    }


    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet,posisi, tempat, nomor);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        String title = null;
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyleList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                initRecyclerView();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putInt(STATE_MODE, mode);
    }
}