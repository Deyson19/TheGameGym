package com.jd.thegamegym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class WeekDays extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> list;
    AdapterList adapterList;


    String ejerciciosLunes [] = {"PRESS DE BANCA", "REMO CON BARRA", "PRESS MILITAR", "DOMINADAS", "PARALELAS (FONDOS)", "CURL CON BARRA", "PRESS FRANCES"};
    String ejerciciosViernes [] = {
            "PRESS CON MANCUERNAS",
            "PRESS DECLINADO",
            "PRESS INCLINADO",
            "APERTURAS EN MAQUINA",
            "CURL CON MANCUERNA",
            "PRESS FRANCES",
            "CURL ARAÑA CON BARRA",
            "EXTENSION DE TRICEPS LASO"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_days);

        Toast.makeText(getApplicationContext(),"Welcome to the WeekDays", Toast.LENGTH_LONG).show();

        listView = findViewById(R.id.list_view);
        listShow();

        adapterList = new AdapterList(this,list);
        listView.setAdapter(adapterList);
    }

    private void listShow() {
        list = new ArrayList<DataModel>();
        String series,reps;
        int pesoE = R.string.lunes;
        int seriesTotal =0;
        int repeticionesTotal =0;
        int imagenDia =0;
        series = "Series: ".toUpperCase();
        reps = "Repeticiones: ".toUpperCase();
        int dia = R.string.lunes;
        for (int i=0;i<ejerciciosLunes.length;i++){
            if (i<=4){
                seriesTotal = 3;
            }else{
                seriesTotal = 4;
            }
            switch (i){
                case 0:
                    repeticionesTotal = 5;
                    pesoE = R.string.lunes1;
                    imagenDia = R.drawable.pressbanca;
                    break;
                case 1:
                    repeticionesTotal = 5;
                    pesoE = R.string.lunes2;
                    imagenDia = R.drawable.lunes;
                    break;
                case 2:
                    repeticionesTotal = 10;
                    pesoE = R.string.lunes3;
                    imagenDia = R.drawable.pressmilitar;
                    break;
                case 3:
                    repeticionesTotal = 5;
                    pesoE = R.string.lunes4;
                    imagenDia = R.drawable.dominadas;
                    break;
                case 4:
                    repeticionesTotal = 15;
                    pesoE = R.string.lunes5;
                    imagenDia = R.drawable.fondos;
                    break;
                case 5:
                    repeticionesTotal = 10;
                    pesoE = R.string.lunes6;
                    imagenDia = R.drawable.curlbarra;
                    break;
                case 6:
                    repeticionesTotal = 10;
                    pesoE = R.string.lunes7;
                    imagenDia = R.drawable.pressfrances;
                    break;
            }
            list.add(new DataModel(ejerciciosLunes[i],pesoE, series +Integer.toString(seriesTotal),reps+Integer.toString(repeticionesTotal), imagenDia));
        }




    }
}