package com.example.cristiansilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resumen extends AppCompatActivity {
    TextView r1,r2,r42,r43,r3,r41,r5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        Bundle recibir;
        r1 = findViewById(R.id.txt_usuario);
        r2 = findViewById(R.id.txt_nombre);
        r3 = findViewById(R.id.resp1);
        r41 = findViewById(R.id.resp2_1);
        r42 = findViewById(R.id.resp2_2);
        r43 = findViewById(R.id.resp2_3);
        r5 = findViewById(R.id.resp3);

        recibir = getIntent().getExtras();

        r1.setText(recibir.getString("usuario"));
        r2.setText(recibir.getString("nombre"));
        r3.setText(recibir.getString("res1"));
        r41.setText(recibir.getString("res2_1"));
        r42.setText(recibir.getString("res2_2"));
        r43.setText(recibir.getString("res2_3"));
        r5.setText(recibir.getString("res3"));
    }
}
