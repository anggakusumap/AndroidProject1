package com.example.recyclewithdetails;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class LocationActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
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

    public void denpasar(View view){
        Intent i = new Intent(this, Denpasar.class);
        startActivity(i);
    }

    public void badung(View view){
        Intent i = new Intent(this, Badung.class);
        startActivity(i);
    }

    public void tabanan(View view){
        Intent i = new Intent(this, Tabanan.class);
        startActivity(i);
    }

    public void singaraja(View view){
        Intent i = new Intent(this, Singaraja.class);
        startActivity(i);
    }

    public void jembrana(View view){
        Intent i = new Intent(this, Jembrana.class);
        startActivity(i);
    }

    public void bangli(View view){
        Intent i = new Intent(this, Bangli.class);
        startActivity(i);
    }

    public void karangasem(View view){
        Intent i = new Intent(this, Karangasem.class);
        startActivity(i);
    }

    public void gianyar(View view){
        Intent i = new Intent(this, Gianyar.class);
        startActivity(i);
    }

}