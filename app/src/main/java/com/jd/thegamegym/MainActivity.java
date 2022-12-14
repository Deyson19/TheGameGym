package com.jd.thegamegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String dias[] ={"Lunes","Martes","Miercoles","Jueves","Viernes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String dias[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };

            Button btnLunes, btnMartes, btnMiercoles, btnJueves, btnViernes;
            // Lunes
            btnLunes = findViewById(R.id.btnLunes);
            btnLunes.setText(dias[0].toString());
            btnLunes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    entradaAlSitema();
                }
            });
            // Martes
            btnMartes = findViewById(R.id.btnMartes);
            btnMartes.setText(dias[1].toString());
            btnMartes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    entradaAlSitema();
                }
            });
            // Miercoles
            btnMiercoles = findViewById(R.id.btnMiercoles);
            btnMiercoles.setText(dias[2].toString());
            btnMiercoles.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    entradaAlSitema();

                }
            });
            // Jueves
            btnJueves = findViewById(R.id.btnJueves);
            btnJueves.setText(dias[3].toString());
            btnJueves.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    entradaAlSitema();

                }
            });
            // Viernes
            btnViernes = findViewById(R.id.btnViernes);
            btnViernes.setText(dias[4].toString());
            btnViernes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    entradaAlSitema();
                }
            });
            }

    private void entradaAlSitema() {
        Toast.makeText(getApplicationContext(),"Dias de la semana: "+dias.length,Toast.LENGTH_LONG).show();
        Intent i = new Intent(getApplicationContext(),WeekDays.class);
        startActivity(i);
    }
}