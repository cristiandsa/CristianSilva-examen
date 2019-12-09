package com.example.cristiansilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import static android.widget.Toast.*;


public class MainActivity extends AppCompatActivity {

    EditText usu, pass;
    String us, contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu = findViewById(R.id.txt_usuario);
        pass = findViewById(R.id.txt_pswd);
        us = "estudiante2019";
        contra = "uisrael2019";
    }

    public void login(View V) {

        if (usu.getText().toString().equals(us) && pass.getText().toString().equals(contra)) {
            Intent iniciarRegistro = new Intent(MainActivity.this, registro.class);
            iniciarRegistro.putExtra("usuario", usu.getText().toString());
            startActivity(iniciarRegistro);
        } else {
            Toast.makeText(getApplicationContext(), "Datos errados", LENGTH_LONG).show();
        }

    }
}
