package com.example.dhitra.aplikasilogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Dhitra on 1/7/2017.
 */
public class tampil extends Activity {

    TextView nama, namapang, alamat, agama, hobi;
    String get_nama, get_namapang, get_alamat, get_agama, get_hobi;
    public void OnCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil);

       nama = (TextView) findViewById(R.id.nama_textView);
       namapang = (TextView) findViewById(R.id.namapang_textView);
        alamat = (TextView) findViewById(R.id.alamat_textView);
        agama =  (TextView) findViewById(R.id.agama_textView);
        hobi = (TextView) findViewById(R.id.hobi_textView);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");
        get_namapang = b.getString("parse_namapang");
        get_alamat = b.getString("parse_alamat");
        get_agama = b.getString("parse_agama");
        get_hobi = b.getString("parse_hobi");

        nama.setText("Full Name : "+get_nama);
        namapang.setText("Nick Name : "+get_namapang);
        alamat.setText("Address : "+get_alamat);
        agama.setText("Religion :"+get_agama);
        hobi.setText("Hobby :"+get_hobi);

        Button reset1 = (Button)findViewById(R.id.kembali);
        reset1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=null;
                i=new Intent(tampil.this,Input().class);
                startActivity(i);
                // TODO Auto-generated method stub

            }
        });

    }
}
