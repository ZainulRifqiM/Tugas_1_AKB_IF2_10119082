package com.zae.tugas_1_akb_if2_10119082;

//  Tanggal Pengerjaan  : 23 April 2022
//  Nim                 : 10119082
//  Nama                : Zainul Rifqi Muwaffaq
//  Kelas               : IF2

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {

    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initView();
        setData();
    }

    public void initView() {
        btnDaftar = findViewById(R.id.btn_daftar);

    }

    public void setData() {


        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // action
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}