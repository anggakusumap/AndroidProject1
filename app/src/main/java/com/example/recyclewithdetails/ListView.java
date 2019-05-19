package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {

    private String title = "Mode List";
    final String STATE_TITLE = "state_string";
    final String STATE_MODE = "state_mode";
    int mode;

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();
    private ArrayList<String> tempat = new ArrayList<>();
    private ArrayList<String> nomor = new ArrayList<>();
    private ArrayList<Float> rating = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initImageBitmaps();

    }

    private void initImageBitmaps() {
        mImageUrls.add("https://media.travelingyuk.com/wp-content/uploads/2018/07/Nasi-Ayam-Kedewatan-Ibu-Mangku-di-Bali-Kenikmatan-Melegenda-Sejak-1960-an-1.jpg");
        mNames.add("Nasi Ayam Kedewatan Ibu Mangku");
        mDesc.add("Ubud");
        mImageDet.add("24 Juni 1987");
        tempat.add("Rosario,Argentina");
        nomor.add("10");
        rating.add((float)5);

        mImageUrls.add("http://bali.panduanwisata.id/files/2012/03/warung-bu-komang-bali.jpg");
        mNames.add("Warung Bu Komang");
        mDesc.add("Singaraja");
        mImageDet.add("Februari");
        tempat.add("Portugal");
        nomor.add("7");
        rating.add((float)5);

        mImageUrls.add("https://www.piesusubliman.com/wp-content/uploads/2018/08/Warung-Nasi-Bali-Ibu-Sayu.jpg");
        mNames.add("Warung Nasi Bali Ibu Sayu");
        mDesc.add("Tabanan");
        mImageDet.add("Februari");
        tempat.add("Mesir");
        nomor.add("10");
        rating.add((float)5);

        mImageUrls.add("http://isrilcaniago.weebly.com/uploads/1/0/6/1/106122351/ayam-betutu-men-tempeh-3_orig.png");
        mNames.add("Ayam Betutu Men Tempeh");
        mDesc.add("Jembrana");
        mImageDet.add("Februari");
        tempat.add("Brazil");
        nomor.add("10");
        rating.add((float)5);

        mImageUrls.add("https://cdn.qubicle.id/images/2018/10/03/604cbcdd-982d-4675-b89f-016590f7ba4c.jpg");
        mNames.add("Warung Lesehan Merta Sari");
        mDesc.add("Klungkung");
        mImageDet.add("Februari");
        tempat.add("Perancis");
        nomor.add("7");
        rating.add((float)5);

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/73/f5/28/fb-img-1496380561303.jpg");
        mNames.add("Nasi Ayam Bu Oki");
        mDesc.add("Badung");
        mImageDet.add("Februari");
        tempat.add("Belgia");
        nomor.add("10");
        rating.add((float)5);
    showRecyleList();
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view4);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet, tempat, nomor, rating);
        recyclerView.setAdapter(adapter);

    }

}


