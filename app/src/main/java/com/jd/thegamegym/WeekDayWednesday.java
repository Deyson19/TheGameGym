package com.jd.thegamegym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeekDayWednesday extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> list;
    AdapterList adapterList;

    String[] ejerciciosMiercoles = {
            "PRESS MILITAR",
            "REMO CON MANCUERNA",
            "DOMINADAS",
            "REMO POLEA MAQUINA",
            "JALON PRONO",
            "PRESS MILITAR CON MANCUERNAS",
            "ELEVACIONES LATERALES POLEA",
            "ELEVACIONES FRONTALES POLEA"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_day_wednesday);

        listView = findViewById(R.id.list_view_wednesday);
        listView.setBackgroundResource(R.drawable.miercoles);
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

        for (int i=0;i<ejerciciosMiercoles.length;i++){
            if (i<=5){
                seriesTotal = 3;
            }else{
                seriesTotal = 4;
            }
            switch (i){
                case 0:
                    repeticionesTotal = 5;
                    pesoE = R.string.miercoles1;
                    imagenDia = R.drawable.pressmilitar;
                    break;
                case 1:
                    repeticionesTotal = 10;
                    pesoE = R.string.miercoles2;
                    imagenDia = R.drawable.remomancuerna;
                    break;
                case 2:
                    repeticionesTotal = 10;
                    pesoE = R.string.miercoles3;
                    imagenDia = R.drawable.dominadas;
                    break;
                case 3:
                    repeticionesTotal = 10;
                    pesoE = R.string.miercoles4;
                    imagenDia = R.drawable.remopolea;
                    break;
                case 4:
                    repeticionesTotal = 15;
                    pesoE = R.string.miercoles5;
                    imagenDia = R.drawable.jalonprono;
                    break;
                case 5:
                    repeticionesTotal = 12;
                    pesoE = R.string.miercoles6;
                    imagenDia = R.drawable.pressmilitarmancuerna;
                    break;
                case 6:
                    repeticionesTotal = 12;
                    pesoE = R.string.miercoles7;
                    imagenDia = R.drawable.elevacioneslaterales;
                    break;
                    case 7:
                    repeticionesTotal = 12;
                    pesoE = R.string.miercoles8;
                    imagenDia = R.drawable.elevacionesfrontales;
                    break;
            }
            list.add(new DataModel(ejerciciosMiercoles[i],pesoE, series +Integer.toString(seriesTotal),reps+Integer.toString(repeticionesTotal), imagenDia));
        }
    }
}