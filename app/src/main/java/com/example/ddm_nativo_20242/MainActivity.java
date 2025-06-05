package com.example.ddm_nativo_20242;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_main);

        View mainLayout = findViewById(R.id.mainLayout);

        // Evento de clique otimizado com Lambda
        mainLayout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TelaLogin.class);
            startActivity(intent);
        });
    }
}
