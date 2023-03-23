package com.example.datamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.datamahasiswa.database.AppDatabase;
import com.example.datamahasiswa.database.entitas.User;

public class TambahActivity extends AppCompatActivity {
    private EditText editName, editEmail;
    private Button btnSave;
    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah2);
        editName = findViewById(R.id.full_name);
        editEmail = findViewById(R.id.email);
        btnSave = findViewById(R.id.btn_save);

        database = AppDatabase.getInstance(getApplicationContext());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database.userDao().insertAll(editName.getText().toString(), editEmail.getText().toString());
                finish();
            }
        });
    }
}