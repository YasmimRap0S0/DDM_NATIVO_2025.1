package com.example.ddm_nativo_20242.Listas.Ex_RecyclerView;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ddm_nativo_20242.R;
public class SuporteView extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView tv;
    public SuporteView(View v) {
        super(v);
        v.setOnClickListener(this);
        tv = v.findViewById(R.id.tv);
    }
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Posicao: "+getLayoutPosition(), Toast.LENGTH_LONG).show();
    }
}