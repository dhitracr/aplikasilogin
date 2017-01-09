package com.example.dhitra.aplikasilogin;

/**
 * Created by Dhitra on 1/6/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class HalamanUtama extends Activity {
LinearLayout lin_menu, lin_halaman;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lin_menu = (LinearLayout)findViewById(R.id.lin_menu);
        lin_halaman = (LinearLayout)findViewById(R.id.lin_halaman);
    }

    public void Input(View v) {
        Intent i = new Intent(this, Input.class);
        startActivity(i);
    }
    public void Tampil(View v) {
        Intent i = new Intent(this, tampil.class);
        startActivity(i);
    }
    public void Lokasi(View v) {
        Intent i = new Intent(this, map.class);
        startActivity(i);
    }

}
