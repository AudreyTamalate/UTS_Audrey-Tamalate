package com.example.duaduasi.uts_audrey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Profil_Mahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_mahasiswa);

        Button buttonSubmit = findViewById(R.id.button);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextStudentID = findViewById(R.id.editTextText);
                EditText editTextName = findViewById(R.id.editTextText2);
                EditText editTextMajor = findViewById(R.id.editTextText3);
                EditText editTextYear = findViewById(R.id.editTextText4);
                EditText editTextStatus = findViewById(R.id.editTextText5);
                EditText editTextCampus = findViewById(R.id.editTextText7);

                String studentID = editTextStudentID.getText().toString();
                String name = editTextName.getText().toString();
                String major = editTextMajor.getText().toString();
                String year = editTextYear.getText().toString();
                String status = editTextStatus.getText().toString();
                String campus = editTextCampus.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("studentID", studentID);
                intent.putExtra("name", name);
                intent.putExtra("major", major);
                intent.putExtra("year", year);
                intent.putExtra("status", status);
                intent.putExtra("campus", campus);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
