package com.example.ddm_nativo_20242;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        EditText userInput = findViewById(R.id.userInput);
        EditText emailInput = findViewById(R.id.emailInput);
        EditText senhaInput = findViewById(R.id.senhaInput);
        Button buttonCadastrar = findViewById(R.id.buttonCadastrar);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = userInput.getText().toString();
                String email = emailInput.getText().toString();
                String senha = senhaInput.getText().toString();

                // Validação dos campos
                if (usuario.isEmpty()) {
                    userInput.setError("Por favor, insira seu nome de usuário.");
                    return;
                }
                if (email.isEmpty()) {
                    emailInput.setError("Por favor, insira seu e-mail.");
                    return;
                }
                if (senha.isEmpty()) {
                    senhaInput.setError("Por favor, insira sua senha.");
                    return;
                }

                // Mostrar mensagem de sucesso
                Toast.makeText(TelaCadastro.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();

                // Voltar para a tela de login
                Intent intent = new Intent(TelaCadastro.this, TelaLogin.class);
                startActivity(intent);
                finish(); // remove a activity da pilha
            }
        });
    }
}