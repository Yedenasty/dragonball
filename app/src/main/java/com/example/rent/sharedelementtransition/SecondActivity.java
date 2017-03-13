package com.example.rent.sharedelementtransition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoView;

/**
 * Created by RENT on 2017-03-02.
 */

public class SecondActivity extends AppCompatActivity {

    public static final String klucz = "klucz";
    public static final String kluczOpis = "kluczopis";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drugi_layout);
        PhotoView photoView = (PhotoView) findViewById(R.id.blisko);
        photoView.setImageResource(getIntent().getIntExtra(klucz, R.drawable.songoblisko));
        TextView textView = (TextView) findViewById(R.id.info);
        textView.setText(getIntent().getIntExtra(kluczOpis, R.string.app_name));
    }
}
