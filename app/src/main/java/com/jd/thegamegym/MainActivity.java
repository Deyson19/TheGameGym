package com.jd.thegamegym;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] dias ={"Lunes","Martes","Miercoles","Jueves","Viernes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button btnLunes, btnMartes, btnMiercoles, btnJueves, btnViernes;
            // Lunes
            btnLunes = findViewById(R.id.btnLunes);
            btnLunes.setText(dias[0]);
            btnLunes.setOnClickListener(v -> entradaAlSitema(getApplicationContext(),WeekDays.class));
            // Martes
            btnMartes = findViewById(R.id.btnMartes);
            btnMartes.setText(dias[1]);
            btnMartes.setOnClickListener(v -> entradaAlSitema(getApplicationContext(),WeekDayTuesday.class));
            // Miercoles
            btnMiercoles = findViewById(R.id.btnMiercoles);
            btnMiercoles.setText(dias[2]);
            btnMiercoles.setOnClickListener(v -> entradaAlSitema(getApplicationContext(),WeekDayWednesday.class));
            // Jueves
            btnJueves = findViewById(R.id.btnJueves);
            btnJueves.setText(dias[3]);
            btnJueves.setOnClickListener(v -> entradaAlSitema(getApplicationContext(),WeekDayThursday.class));
            // Viernes
            btnViernes = findViewById(R.id.btnViernes);
            btnViernes.setText(dias[4]);
            btnViernes.setOnClickListener(v -> entradaAlSitema(getApplicationContext(),WeekDayFriday.class));
            }

    private void entradaAlSitema(Context from, Class to) {
        Intent intentDynamic = new Intent(from,to);
        startActivity(intentDynamic);
    }

}