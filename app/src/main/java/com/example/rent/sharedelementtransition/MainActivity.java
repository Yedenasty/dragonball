package com.example.rent.sharedelementtransition;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView dalekoView = (ImageView) findViewById(R.id.songo_maly);

        dalekoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, dalekoView, "animacja_songo");
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                intent1.putExtra(SecondActivity.klucz, R.drawable.songoblisko);
                intent1.putExtra(SecondActivity.kluczOpis, R.string.songo);
                startActivity(intent1, options.toBundle());
            }
        });

        final ImageView vegetaView = (ImageView) findViewById(R.id.vegeta_maly);

        vegetaView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options2 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, vegetaView, "animacja_songo");
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                intent2.putExtra(SecondActivity.klucz, R.drawable.vegeta);
                intent2.putExtra(SecondActivity.kluczOpis, R.string.vegeta);
                startActivity(intent2, options2.toBundle());
            }
        });

        final ImageView krilanView = (ImageView) findViewById(R.id.krilan_maly);

        krilanView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options3 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, krilanView, "animacja_songo");
                Intent intent3 = new Intent(MainActivity.this, SecondActivity.class);
                intent3.putExtra(SecondActivity.klucz, R.drawable.krilan);
                intent3.putExtra(SecondActivity.kluczOpis, R.string.krilan);
                startActivity(intent3, options3.toBundle());
            }
        });

        final ImageView gohanView = (ImageView) findViewById(R.id.gohan_maly);

        gohanView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options4 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, gohanView, "animacja_songo");
                Intent intent4 = new Intent(MainActivity.this, SecondActivity.class);
                intent4.putExtra(SecondActivity.klucz, R.drawable.songohanek);
                intent4.putExtra(SecondActivity.kluczOpis, R.string.gohan);
                startActivity(intent4, options4.toBundle());
            }
        });

        final ImageView puarView = (ImageView) findViewById(R.id.puar_maly);

        puarView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options5 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, puarView, "animacja_songo");
                Intent intent5 = new Intent(MainActivity.this, SecondActivity.class);
                intent5.putExtra(SecondActivity.klucz, R.drawable.puar);
                intent5.putExtra(SecondActivity.kluczOpis, R.string.puar);
                startActivity(intent5, options5.toBundle());
            }
        });

        final ImageView dragonView = (ImageView) findViewById(R.id.dragon_maly);

        dragonView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options6 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, dragonView, "animacja_songo");
                Intent intent6 = new Intent(MainActivity.this, SecondActivity.class);
                intent6.putExtra(SecondActivity.klucz, R.drawable.dragon);
                intent6.putExtra(SecondActivity.kluczOpis, R.string.dragon);
                startActivity(intent6, options6.toBundle());
            }
        });

        final ImageView zolwView = (ImageView) findViewById(R.id.zolw_maly);

        zolwView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options7 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, zolwView, "animacja_songo");
                Intent intent7 = new Intent(MainActivity.this, SecondActivity.class);
                intent7.putExtra(SecondActivity.klucz, R.drawable.zolw);
                intent7.putExtra(SecondActivity.kluczOpis, R.string.zolw);
                startActivity(intent7, options7.toBundle());
            }
        });

        final ImageView yamchaView = (ImageView) findViewById(R.id.yamcha_maly);

        yamchaView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options8 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, yamchaView, "animacja_songo");
                Intent intent8 = new Intent(MainActivity.this, SecondActivity.class);
                intent8.putExtra(SecondActivity.klucz, R.drawable.yamcha);
                intent8.putExtra(SecondActivity.kluczOpis, R.string.yamcha);
                startActivity(intent8, options8.toBundle());
            }
        });

        final ImageView tenshinView = (ImageView) findViewById(R.id.tenshin_maly);

        tenshinView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityOptionsCompat options9 = ActivityOptionsCompat.makeSceneTransitionAnimation
                        (MainActivity.this, tenshinView, "animacja_songo");
                Intent intent9 = new Intent(MainActivity.this, SecondActivity.class);
                intent9.putExtra(SecondActivity.klucz, R.drawable.tenshinhan);
                intent9.putExtra(SecondActivity.kluczOpis, R.string.tenshin);
                startActivity(intent9, options9.toBundle());
            }
        });

    }

}
