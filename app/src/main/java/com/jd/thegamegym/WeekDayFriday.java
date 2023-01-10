package com.jd.thegamegym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeekDayFriday extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> list;
    AdapterList adapterList;

    String[] ejerciciosViernes = {
            "PRESS CON MANCUERNAS",
            "PRESS DECLINADO",
            "PRESS INCLINADO",
            "APERTURAS EN MAQUINA",
            "CURL CON MANCUERNA",
            "PRESS FRANCES",
            "CURL ARAÑA CON BARRA",
            "EXTENSION DE TRICEPS LASO"
    };
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_friday);

        listView = findViewById(R.id.list_view_friday);
        listView.setBackgroundResource(R.drawable.viernes);
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

        for (int i=0;i<ejerciciosViernes.length;i++){
            if (i<=3){
                seriesTotal = 3;
            }else{
                seriesTotal = 4;
            }
            switch (i){
                case 0:
                    repeticionesTotal = 12;
                    pesoE = R.string.viernes1;
                    imagenDia = R.drawable.pressmancuerna;
                    break;
                case 1:
                    repeticionesTotal = 12;
                    pesoE = R.string.viernes2;
                    imagenDia = R.drawable.pressdeclinado;
                    break;
                case 2:
                    repeticionesTotal = 10;
                    pesoE = R.string.viernes3;
                    imagenDia = R.drawable.pressinclinado;
                    break;
                case 3:
                    repeticionesTotal = 10;
                    pesoE = R.string.viernes4;
                    imagenDia = R.drawable.aperturasmaquina;
                    break;
                case 4:
                    repeticionesTotal = 10;
                    pesoE = R.string.viernes5;
                    imagenDia = R.drawable.curlmancuerna;
                    break;
                case 5:
                    repeticionesTotal = 10;
                    pesoE = R.string.viernes6;
                    imagenDia = R.drawable.pressfrances;
                    break;
                case 6:
                    repeticionesTotal = 15;
                    pesoE = R.string.viernes7;
                    imagenDia = R.drawable.curlaraspider;
                    break;
                case 7:
                    repeticionesTotal = 12;
                    pesoE = R.string.viernes8;
                    imagenDia = R.drawable.extecionestriceps;
                    break;
            }
            list.add(new DataModel(ejerciciosViernes[i],pesoE, series + seriesTotal,reps+Integer.toString(repeticionesTotal), imagenDia));
        }
    }
}