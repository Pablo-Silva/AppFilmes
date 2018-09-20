package com.example.shootingstars.appfilmes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends Activity {

    private List<Filme> filmes;
    private EditText nomeFilme, notafilme;
    private Spinner genero;
    private ListView listFilme;
    private ArrayAdapter<Filme> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmes = new ArrayList<>();
        nomeFilme = findViewById(R.id.nomeFilme);
        notafilme = findViewById(R.id.notaFilme);
        genero = findViewById(R.id.genero);
        listFilme = findViewById(R.id.listFilme);
        adapter = new FilmeAdapter(getApplicationContext(), R.layout.filme_item, filmes);
        listFilme.setAdapter(adapter);
    }

    public void save(View view){
        String nome = nomeFilme.getText().toString();
        int nota = Integer.parseInt(notafilme.getText().toString());
        String gender = genero.getSelectedItem().toString();
        Filme filme = new Filme();

        filme.setNome(nome);
        filme.setNota(nota);
        filme.setGenero(gender);

        filmes.add(filme);

        adapter.sort(new Comparator<Filme>() {
            @Override
            public int compare(Filme o1, Filme o2) {
                return o2.getNota().compareTo(o1.getNota());
            }
        });

        adapter.notifyDataSetChanged();

    }
}
