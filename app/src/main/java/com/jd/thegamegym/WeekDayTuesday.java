package com.jd.thegamegym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class WeekDayTuesday extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> list;
    AdapterList adapterList;

    String[] ejerciciosMartes = {
            "SENTADILLA",
            "HIP TRUST",
            "PESO MUERTO",
            "ZANCADAS",
            "EXTENSION CUADRICEPS",
            "ELEVACION DE TALON"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_day_tuesday);

        Toast.makeText(getApplicationContext(),"Welcome to the LegsDay", Toast.LENGTH_LONG).show();

        listView = findViewById(R.id.list_view_tuesday);
        listView.setBackgroundResource(R.drawable.martes);
        listShow();

        adapterList = new AdapterList(this,list);
        listView.setAdapter(adapterList);
    }

    private void listShow() {
        list = new ArrayList<>();
        String series,reps;
        int pesoE = R.string.lunes;
        int seriesTotal =0;
        int repeticionesTotal =0;
        int imagenDia =0;
        series = "Series: ".toUpperCase();
        reps = "Repeticiones: ".toUpperCase();
        for (int i=0;i<ejerciciosMartes.length;i++){
            switch (i){
                case 0:
                    seriesTotal = 3;
                    repeticionesTotal = 5;
                    pesoE = R.string.martes1;
                    imagenDia = R.drawable.sentadilla;
                    break;
                case 1:
                    seriesTotal = 4;
                    repeticionesTotal = 12;
                    pesoE = R.string.martes2;
                    imagenDia = R.drawable.hiptrust;
                    break;
                case 2:
                    seriesTotal = 3;
                    repeticionesTotal = 10;
                    pesoE = R.string.martes3;
                    imagenDia = R.drawable.pesomuerto;
                    break;
                case 3:
                    seriesTotal = 3;
                    repeticionesTotal = 20;
                    pesoE = R.string.martes4;
                    imagenDia = R.drawable.zancada;
                    break;
                case 4:
                    seriesTotal = 4;
                    repeticionesTotal = 12;
                    pesoE = R.string.martes5;
                    imagenDia = R.drawable.extenxionescuadriceps;
                    break;
                case 5:
                    seriesTotal = 3;
                    repeticionesTotal = 10;
                    pesoE = R.string.martes6;
                    imagenDia = R.drawable.elevacionestalon;
                    break;
            }
            list.add(new DataModel(ejerciciosMartes[i],pesoE, series + seriesTotal,reps+ repeticionesTotal, imagenDia));
        }

    }
}