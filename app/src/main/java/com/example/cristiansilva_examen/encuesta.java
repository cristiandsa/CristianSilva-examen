package com.example.cristiansilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class encuesta extends AppCompatActivity {

    CheckBox chb1, chb2, chb3;
    RadioButton rad1, rad2;
    EditText pregun1;
    String us, nom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        pregun1 = findViewById(R.id.txt_pre1);
        chb1 = findViewById(R.id.cb1);
        chb2 = findViewById(R.id.cb2);
        chb3 = findViewById(R.id.cb3);
        rad1 = findViewById(R.id.rb1);
        rad2 = findViewById(R.id.rb2);
        Bundle recibir;
        recibir = getIntent().getExtras();

        us = recibir.getString("nombre");
        nom = recibir.getString("usuario");
    }

    public void envio(View v){
        Intent inicioresumen = new Intent(this, resumen.class);
        inicioresumen.putExtra("nombre",nom);
        inicioresumen.putExtra("usuario",us);
        inicioresumen.putExtra("res1",pregun1.getText().toString() );
        if (chb1.isChecked()){
            inicioresumen.putExtra("res2_1",chb1.getText().toString() );
        }
        if (chb2.isChecked()){
            inicioresumen.putExtra("res2_2",chb2.getText().toString() );
        }
        if (chb3.isChecked()){
            inicioresumen.putExtra("res2_3",chb3.getText().toString() );
        }
        if (rad1.isChecked()){
            inicioresumen.putExtra("res3",rad1.getText().toString() );
        }
        if (rad2.isChecked()){
            inicioresumen.putExtra("res3",rad2.getText().toString() );
        }
        startActivity(inicioresumen);
    }
}
