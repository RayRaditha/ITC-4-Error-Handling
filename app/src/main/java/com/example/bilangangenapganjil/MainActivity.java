package com.example.bilangangenapganjil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText etBilangan;
    Button btnCek;
    TextView tvHasil;
    int bil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBilangan = findViewById(R.id.et_bil);
        btnCek = findViewById(R.id.btn_cek);
        tvHasil = findViewById(R.id.tv_hasil);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    bil = Integer.parseInt(etBilangan.getText().toString());
                    for (int i = 0; i <= bil; i++) {
                        if (i % 2 == 0) {
                            tvHasil.setText("Bilangan Genap");
                        } else {
                            tvHasil.setText("Bilangan Ganjil");
                        }
                    }
                } catch (NumberFormatException nfe) {
                    tvHasil.setText("Silahkan Masukkan bilangan berupa angka"); //jika yang diinputkan bukan angka
                }
            }
        });
    }
}