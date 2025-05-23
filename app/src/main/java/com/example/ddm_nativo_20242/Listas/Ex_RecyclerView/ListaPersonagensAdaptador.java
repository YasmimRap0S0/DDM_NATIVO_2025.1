package com.example.ddm_nativo_20242.Listas.Ex_RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ddm_nativo_20242.R;

import java.util.List;
public class ListaPersonagensAdaptador extends RecyclerView.Adapter<SuporteView> {
    List<Personagem> dados;
    public ListaPersonagensAdaptador(List<Personagem> dados){
        this.dados = dados;
    }
    public SuporteView onCreateViewHolder(ViewGroup p, int viewType) {
        return new SuporteView(
                LayoutInflater.from(p.getContext())
                        .inflate(R.layout.item_adaptador_lista, p, false));
    }
    @Override
    public void onBindViewHolder(SuporteView h, int p) {
        h.tv.setText(this.dados.get(p).getNome());
    }
    public int getItemCount() {
        return this.dados.size();
    }
}