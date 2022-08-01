package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {

    //declarando as váriáveis que suportam as views do xml
    EditText edtUsuario,edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inner_layout);

        //apontando as variáveis às views do xml pelo id
        edtSenha = findViewById(R.id.edtSenha);
        edtUsuario = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);

        //setando o evento de clique no botão
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user,passwd;
                passwd=edtSenha.getText().toString();
                user=edtUsuario.getText().toString();
                if(user.equals("rcarrenhot@gmail.com") && passwd.equals("senac")){

                    //Abrindo outra janela -
                    //desta forma não dá para mandar nada para a outra janela
                    startActivity(new Intent(getApplicationContext(),MenuActivity.class));
                    finish();

                }else{
                    //Mensagem para o usuário
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha incorretos.", Toast.LENGTH_SHORT).show();
                    limparJanela();
                }
            }
        });
    }
    public void limparJanela(){
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }
    public void sairSistema(View view) {
        finish();
    }
}