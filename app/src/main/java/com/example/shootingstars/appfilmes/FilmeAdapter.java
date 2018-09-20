package com.example.shootingstars.appfilmes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FilmeAdapter extends ArrayAdapter<Filme> {

    private int rId;

    public FilmeAdapter(Context context, int resource, List<Filme> objects){
        super(context,resource,objects);
        this.rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){
        View mView = currentView;

        if (mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId, null);
        }

        Filme filme = getItem(position);

        TextView txtNome = mView.findViewById(R.id.txtNome);
        TextView txtNota = mView.findViewById(R.id.txtNota);
        TextView txtGenero = mView.findViewById(R.id.txtGenero);

        txtNome.setText(filme.getNome());
        txtNota.setText(String.valueOf(filme.getNota()));
        txtGenero.setText(filme.getGenero());

        return  mView;
    }
}
