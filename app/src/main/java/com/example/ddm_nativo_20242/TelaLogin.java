package com.example.ddm_nativo_20242;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Handler;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        EditText emailInput = findViewById(R.id.emailInput);
        EditText senhaInput = findViewById(R.id.senhaInput);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonRegister = findViewById(R.id.buttonRegister);



        buttonLogin.setOnClickListener(new View.OnClickListener() { //Evento no botão
            @Override
            public void onClick(View v) {

                String email = emailInput.getText().toString(); //pega o email e senha digitado
                String senha = senhaInput.getText().toString();

                // Verificação se o campo foi preenchido
                if (email.isEmpty()) {
                    emailInput.setError("Por favor, insira seu e-mail.");
                    return;
                }
                if (senha.isEmpty()) {
                    senhaInput.setError("Por favor, insira sua senha.");
                    return;
                }

                // Extrai o nome de usuário (parte antes do @)
                String username = email.split("@")[0];

                piscarBotao(buttonLogin, username); // Passa o username tambem
            }
        });

    //  listener para o botão de registro
        buttonRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(TelaLogin.this, TelaCadastro.class);
            startActivity(intent);
        }
    });
}
    private void piscarBotao(Button button, String username) { // método
        // A ideia é que ao clicar no botão, ele fica numa cor laranja
        button.setBackgroundColor(Color.parseColor("#FFA500"));

        // Definimos um espaço de tempo para mudar de cor
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setBackgroundColor(Color.parseColor("#008000")); // mudando para cor verde

                // Exibir uma mensagem
                Toast.makeText(TelaLogin.this, "Usuário autenticado com sucesso!", Toast.LENGTH_SHORT).show();

                // Aproveita o metodo para migrar para outra tela
                Intent intent = new Intent(TelaLogin.this, PaginaUser1.class);
                intent.putExtra("USERNAME", username); // Adiciona o username ao Intent
                startActivity(intent);

            }
        }, 580);
    }
}