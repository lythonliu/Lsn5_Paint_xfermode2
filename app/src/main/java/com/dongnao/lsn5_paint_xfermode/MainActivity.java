package com.dongnao.lsn5_paint_xfermode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //RoundImageView iv = new RoundImageView(this);
        HeartMapView iv = new HeartMapView(this);
        setContentView(iv);
    }
}
