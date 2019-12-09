package com.example.cristiansilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class registro extends AppCompatActivity {

    TextView user;
    EditText nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        user = findViewById(R.id.txt_rec_us);
        nom = findViewById(R.id.txt_nom);
        Bundle recibe;

        recibe = getIntent().getExtras();

        user.setText(recibe.getString("usuario"));

    }

    public void guardar(View V){
        Intent register = new Intent(registro.this, encuesta.class);
        register.putExtra("nombre", nom.getText().toString());
        register.putExtra("usuario",user.getText().toString());

        Toast.makeText(getApplicationContext(), "Elemento Guardado con éxito", LENGTH_LONG).show();
        startActivity(register);

    }
}
