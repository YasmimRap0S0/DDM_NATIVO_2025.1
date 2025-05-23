package com.example.ddm_nativo_20242.Listas.Ex_RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.ddm_nativo_20242.R;

import java.util.ArrayList;
import java.util.List;

public class ExRecyclerView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_recycler_view);

        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ListaPersonagensAdaptador(obterListaComponentes()));
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    public List<Personagem> obterListaComponentes(){

        List<Personagem> p = new ArrayList<>();
        //populando lista de personagens
        for (int i = 0; i < 100;i++){
            p.add(new Personagem("Personagem "+i));
        }

        return p;
    }
}