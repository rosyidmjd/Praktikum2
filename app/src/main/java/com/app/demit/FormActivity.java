package com.app.demit;

import android.content.DialogInterface;
import android.graphics.BlurMaskFilter;
import android.support.v4.content.pm.PermissionInfoCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    //Deklarasi variable
    Button btnSimpan, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        //Menampilkan Toast Button Simpan
        btnSimpan = findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormActivity.this, "Data Disimpan", Toast.LENGTH_SHORT).show();
            }
        });

        btnHapus = findViewById(R.id.btnHapus);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FormActivity.this);
                //Membuat Judul Alert Dialog
                alertDialogBuilder.setTitle("Peringatan!");
                //Membuat Pesan Alert Dialog
                alertDialogBuilder.setMessage("Apakan Anda Yakin akan menghapus Data?")
                        .setIcon(R.drawable.ic_avatar)
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Data Dihapus", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                //Membuat Dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                //Menampilkan Dialog
                alertDialog.show();




            }
        });
    }


}