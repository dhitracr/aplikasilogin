package com.example.dhitra.aplikasilogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dhitra on 1/6/2017.
 */
public class Input extends Activity {

String var_nama, var_namapang, var_alamat, var_agama, var_hobi;
    EditText nama, namapang, alamat, agama, hobi;

    public void onCreate(Bundle savedInstancedState){
    super.onCreate(savedInstancedState);
        setContentView(R.layout.main);

        nama = (EditText) findViewById(R.id.nama_editText);
        namapang = (EditText) findViewById(R.id.namapang_editText);
        alamat = (EditText) findViewById(R.id.alamat_editText);
        agama = (EditText) findViewById(R.id.agama_editText);
        hobi = (EditText) findViewById(R.id.hobi_editText);

        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var_nama = nama.getText().toString();
                var_namapang = namapang.getText().toString();
                var_alamat = alamat.getText().toString();
                var_agama = agama.getText().toString();
                var_hobi = hobi.getText().toString();
                Intent i = null;
                i = new Intent(Input.this, tampil.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", var_nama);
                b.putString("parse_namapang", var_namapang);
                b.putString("parse_alamat", var_alamat);
                b.putString("parse_agama", var_agama);
                b.putString("parse_hobi", var_hobi);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
