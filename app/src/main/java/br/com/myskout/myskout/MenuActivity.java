package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardPerfil, cardVagas, cardRecrutadores, cardCandidatos, cardParcerias, cardTalentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        cardPerfil = findViewById(R.id.cardPerfil);
        cardVagas = findViewById(R.id.cardVagas);
        cardRecrutadores = findViewById(R.id.cardRecrutadores);
        cardCandidatos = findViewById(R.id.cardCandidatos);
        cardParcerias = findViewById(R.id.cardParcerias);
        cardTalentos = findViewById(R.id.cardTalentos);

        cardPerfil.setOnClickListener(this);
        cardTalentos.setOnClickListener(this);
        cardParcerias.setOnClickListener(this);
        cardCandidatos.setOnClickListener(this);
        cardRecrutadores.setOnClickListener(this);
        cardVagas.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cardPerfil:
                startActivity(new Intent(getApplicationContext(),PerfilActivity.class));
                finish();
                break;
            case R.id.cardVagas:
                startActivity(new Intent(getApplicationContext(),VagasActivity.class));
                finish();
                break;
            case R.id.cardRecrutadores:
                startActivity(new Intent(getApplicationContext(),RecrutadoresActivity.class));
                finish();
            break;
            case R.id.cardCandidatos:
                startActivity(new Intent(getApplicationContext(),CandidatosActivity.class));
                finish();
                break;
            case R.id.cardParcerias:
                startActivity(new Intent(getApplicationContext(),ParceriasActivity.class));
                finish();
                break;
            case R.id.cardTalentos:
                startActivity(new Intent(getApplicationContext(),TalentosActivity.class));
                finish();
                break;
            default:
                break;
        }
    }
}