package com.jd.thegamegym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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

        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);
        TextView value = view.findViewById(R.id.value);
        ImageView image = view.findViewById(R.id.image);

        title.setText(listPojos.get(position).getTitle());
        description.setText(listPojos.get(position).getDescription());
        value.setText(listPojos.get(position).getValue());
        image.setImageResource(listPojos.get(position).getImages());


         /*
        TextView ejercicio,series,reps,peso;
        ImageView image = view.findViewById(R.id.idIVCourseImage);

        ejercicio = view.findViewById(R.id.idNombreEjercicio);
        ejercicio.setText(listPojos.get(position).getEjercicio());

        series = view.findViewById(R.id.idSeries);
        series.setText(listPojos.get(position).getSeries());

        reps = view.findViewById(R.id.idReps);
        reps.setText(listPojos.get(position).getResps());

        peso = view.findViewById(R.id.idPeso);
        peso.setText(listPojos.get(position).getPeso().toLowerCase());

        image.setImageResource(listPojos.get(position).getImages());*/

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Position "+position,Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
