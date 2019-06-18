package com.example.masterdex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class TelaLogin extends AppCompatActivity {

    private TextInputEditText emailEditText;
    private TextInputEditText senhaEditText;
    private Button entrarButton;
    private Button cadastroButton;
    private TextView esqueciMinhaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.login_email_edit_text);
        senhaEditText = findViewById(R.id.login_senha_edit_text);
        entrarButton = findViewById(R.id.login_entrar_button);
        cadastroButton = findViewById(R.id.login_cadastro_Button);
        esqueciMinhaSenha = findViewById(R.id.Login_esqueci_minha_senha);

        entrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logar();
            }
        });

        cadastroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaCadastro();
            }
        });

        esqueciMinhaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaEsqueciMinhaSenha();
            }
        });

    }

    private void irParaEsqueciMinhaSenha() {
        Intent intent = new Intent(this, TesteActivity.class);
        startActivity(intent);
    }

    private void irParaCadastro() {
        Intent intent = new Intent(this, TesteActivity.class);
        startActivity(intent);
    }

    private void logar() {
        String emailDigitado = emailEditText.getEditableText().toString();
        String senhaDigitada = senhaEditText.getEditableText().toString();

        emailEditText.setError(null);
        senhaEditText.setError(null);

        if(emailDigitado.equals("Eduardo") && senhaDigitada.equals("123")){
            Intent intent = new Intent(this, TesteActivity.class);

            Bundle bundle = new Bundle();

            bundle.putString("EMAIL", emailDigitado);

            intent.putExtras(bundle);

            startActivity(intent);
        }   else {
            emailEditText.setError("Usuário e/ou senha incorreto(s)");
            senhaEditText.setError("Usuário e/ou senha incorreto(s)");
        }
    }


}
