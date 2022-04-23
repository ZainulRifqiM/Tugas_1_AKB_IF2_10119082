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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnLogout, btnProfile;
    private TextView tvUsername;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setData();
    }
    public void initView() {
        tvUsername = findViewById(R.id.txt_username_main);
        btnLogout = findViewById(R.id.btn_logout);
        btnProfile = findViewById(R.id.btn_profile);
    }

    public void setData() {
        Intent intent = getIntent();
        username = intent.getStringExtra("username");


        tvUsername.setText(username);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // action
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // action
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}