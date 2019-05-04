package com.example.recyclewithdetails;

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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


//        ImageView mimageView = (ImageView) findViewById(R.id.imageView);
//
//        Bitmap mbitmap = ((BitmapDrawable) getResources().getDrawable(R.drawable.denpasar)).getBitmap();
//        Bitmap imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
//        Canvas canvas = new Canvas(imageRounded);
//        Paint mpaint = new Paint();
//        mpaint.setAntiAlias(true);
//        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
//        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 100, 100, mpaint);// Round Image Corner 100 100 100 100
//        mimageView.setImageBitmap(imageRounded);
    }
//
//    public static class ImageHelper {
//        public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int pixels) {
//            Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap
//                    .getHeight(), Config.ARGB_8888);
//            Canvas canvas = new Canvas(output);
//
//            final int color = 0xff424242;
//            final Paint paint = new Paint();
//            final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
//            final RectF rectF = new RectF(rect);
//            final float roundPx = pixels;
//
//            paint.setAntiAlias(true);
//            canvas.drawARGB(0, 0, 0, 0);
//            paint.setColor(color);
//            canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
//
//            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
//            canvas.drawBitmap(bitmap, rect, rect, paint);
//
//            return output;
//        }
//    }
}
