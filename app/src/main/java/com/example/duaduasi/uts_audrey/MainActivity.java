package com.example.duaduasi.uts_audrey;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 1;

    TextView textview16;
    TextView textview17;
    TextView textview18;
    TextView textview19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview16 = findViewById(R.id.textView16);
        textview17 = findViewById(R.id.textView17);
        textview18 = findViewById(R.id.textView18);
        textview19 = findViewById(R.id.textView19);

        textview16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Riwayat_SEP.class);
                startActivity(intent);
            }
        });

        textview17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Riwayat_SEP.class);
                startActivity(intent);
            }
        });

        textview18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profil_Mahasiswa.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        textview19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profil_Mahasiswa.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            String studentID = data.getStringExtra("studentID");
            String name = data.getStringExtra("name");
            String major = data.getStringExtra("major");
            String year = data.getStringExtra("year");
            String status = data.getStringExtra("status");
            String campus = data.getStringExtra("campus");

            String message = "Student ID: " + studentID + "\n" +
                    "Name: " + name + "\n" +
                    "Major: " + major + "\n" +
                    "Year: " + year + "\n" +
                    "Status: " + status + "\n" +
                    "Campus: " + campus;

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        SharedPreferences sharedPreferences = PreferenceManager. getDefaultSharedPreferences(getApplicationContext());
        sharedPreferences
    }
}
