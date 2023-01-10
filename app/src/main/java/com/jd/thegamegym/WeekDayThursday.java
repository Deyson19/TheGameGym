package com.jd.thegamegym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeekDayThursday extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> list;
    AdapterList adapterList;

    String[] ejerciciosJueves = {
            "PESO MUERTO",
            "SENTADILLA",
            "PRENSA",
            "CURL FEMORAL",
            "SENTADILLA BULGARA",
            "ELEVACION DE TALON"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_thursday);

        listView = findViewById(R.id.list_view_thursday);
        listView.setBackgroundResource(R.drawable.jueves);
        listShow();

        adapterList = new AdapterList(this,list);
        listView.setAdapter(adapterList);

    }

    private void listShow() {
        list = new ArrayList<>();
        String series,reps;
        int pesoE = R.string.lunes;
        int seriesTotal;
        int repeticionesTotal =0;
        int imagenDia =0;
        series = "Series: ".toUpperCase();
        reps = "Repeticiones: ".toUpperCase();


        for (int i=0;i<ejerciciosJueves.length;i++){
            if (i<=3){
                seriesTotal = 3;
            }else{
                seriesTotal = 4;
            }
            switch (i){
                case 0:
                    repeticionesTotal = 5;
                    pesoE = R.string.jueves1;
                    imagenDia = R.drawable.pesomuerto;
                    break;
                case 1:
                    repeticionesTotal = 10;
                    pesoE = R.string.jueves2;
                    imagenDia = R.drawable.sentadilla;
                    break;
                case 2:
                    repeticionesTotal = 12;
                    pesoE = R.string.jueves3;
                    imagenDia = R.drawable.prensapiernas;
                    break;
                case 3:
                    repeticionesTotal = 10;
                    pesoE = R.string.jueves4;
                    imagenDia = R.drawable.curlfemoral;
                    break;
                case 4:
                    repeticionesTotal = 10;
                    pesoE = R.string.jueves5;
                    imagenDia = R.drawable.sentadillabulgara;
                    break;
                case 5:
                    repeticionesTotal = 10;
                    pesoE = R.string.jueves6;
                    imagenDia = R.drawable.elevacionestalon;
                    break;
            }
            list.add(new DataModel(ejerciciosJueves[i],pesoE, series + seriesTotal,reps+ repeticionesTotal, imagenDia));
        }
    }
}