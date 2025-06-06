package com.example.ddm_nativo_20242;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;

public class PaginaUser1 extends AppCompatActivity {
    // Declare a variável como campo da classe
    private TextView usernameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.pagina_inicial);

        // Inicializa o TextView
        usernameTextView = findViewById(R.id.textUsername);

        // Obtém o username passado da tela de login
        String username = getIntent().getStringExtra("USERNAME");

        // Define o texto no TextView
        if (username != null) {
            usernameTextView.setText("@" + username); // Adiciona o @ antes do nome
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pagina_inicial_do_user), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}