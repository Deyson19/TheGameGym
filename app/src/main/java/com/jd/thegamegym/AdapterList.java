package com.jd.thegamegym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterList extends BaseAdapter {
    Context context;
    ArrayList<DataModel> listPojos;

    public AdapterList(Context context, ArrayList<DataModel> listPojos){
        this.context = context;
        this.listPojos = listPojos;
    }
    @Override
    public int getCount() {
        return listPojos.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(context).inflate(R.layout.cards_layout,parent,false);

        TextView ejercicio = view.findViewById(R.id.titleEjercicio);
        TextView series = view.findViewById(R.id.seriesEjercicio);
        TextView repeticiones = view.findViewById(R.id.repeEjercicio);
        TextView peso = view.findViewById(R.id.pesoEjercicio);
        ImageView image = view.findViewById(R.id.imageRutina);

        ejercicio.setText(listPojos.get(position).getTitle());
        series.setText(listPojos.get(position).getDescription());
        repeticiones.setText(listPojos.get(position).getReps());
        peso.setText(listPojos.get(position).getValue());
        image.setImageResource(listPojos.get(position).getImages());

        view.setOnClickListener(view1 -> Toast.makeText(context,"Ejercicio: "+position,Toast.LENGTH_LONG).show());
        return view;
    }
}
