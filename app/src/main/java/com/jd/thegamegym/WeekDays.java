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

public class WeekDays extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> list;
    AdapterList adapterList;

    int value [] = {3500,4000,3500,2500,2000,1500,5500,3500};
    String unityCost = "Por tan solo: \n";
    String coin = " COP";
    //String  aguacate,mango,manzana,papaya,guayaba,banano,sandia,pera;
    String aguacate = unityCost + value[0] +coin;
    String mango = unityCost + value[1] +coin;
    String manzana = unityCost + value[2]+coin;
    String papaya = unityCost + value[3]+coin;
    String guayaba = unityCost + value[4]+coin;
    String banano = unityCost + value[5]+coin;
    String sandia = unityCost + value[6]+coin;
    String pera = unityCost + value[7]+coin;

    String ejerciciosLunes [] = {"PRESS DE BANCA", "REMO CON BARRA", "PRESS MILITAR", "DOMINADAS", "PARALELAS (FONDOS)", "CURL CON BARRA", "PRESS FRANCES"};
    String ejerciciosMartes [] = {"PRESS DE BANCA", "REMO CON BARRA", "PRESS MILITAR", "DOMINADAS", "PARALELAS (FONDOS)", "CURL CON BARRA", "PRESS FRANCES"};
    String ejerciciosMiercoles [] = {"PRESS DE BANCA", "REMO CON BARRA", "PRESS MILITAR", "DOMINADAS", "PARALELAS (FONDOS)", "CURL CON BARRA", "PRESS FRANCES"};
    String ejerciciosJueves [] = {"PRESS DE BANCA", "REMO CON BARRA", "PRESS MILITAR", "DOMINADAS", "PARALELAS (FONDOS)", "CURL CON BARRA", "PRESS FRANCES"};
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
        //DataModel peso = new DataModel();
        String value;

        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        list.add(new DataModel("Aguacate",R.string.aguacate, aguacate, R.drawable.cupcake));
        //list.add(new DataModel(ejerciciosViernes[0],"89", 4,5, R.drawable.viernes));


    }
}