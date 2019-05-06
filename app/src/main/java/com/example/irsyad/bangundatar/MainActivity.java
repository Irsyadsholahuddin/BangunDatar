package com.example.irsyad.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Alas, Tinggi;
    Button Luas;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Alas = findViewById(R.id.alas);
        Tinggi = findViewById(R.id.tinggi);
        Hasil = findViewById(R.id.hasil);
        Luas = findViewById(R.id.luas);

        Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Alas.getText().toString().isEmpty() || Tinggi.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Isi dulu coy", Toast.LENGTH_SHORT).show();
                } else {
                    luas();
                }
            }
        });

    }

    void luas() {
        int alas = Integer.parseInt(Alas.getText().toString());
        int tinggi =Integer.parseInt(Tinggi.getText().toString());

        int total = alas * tinggi;
        Hasil.setText(String.valueOf(total));

    }
}
