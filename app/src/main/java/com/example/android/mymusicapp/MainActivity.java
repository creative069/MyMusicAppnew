package com.example.android.robmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnhome = (Button)findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inthome = new Intent(MainActivity.this,MyMusicActivity.class);
                startActivity(inthome);
            }
        });
        Button btndscvr = (Button)findViewById(R.id.discover);
        btndscvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inthome = new Intent(MainActivity.this,DiscoverMusic.class);
                startActivity(inthome);
            }
        });
        Button btncharts = (Button)findViewById(R.id.charts);
        btncharts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inthome = new Intent(MainActivity.this,TrendingCharts.class);
                startActivity(inthome);
            }
        });

    }
}
