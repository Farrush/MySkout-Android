package br.com.myskout.myskout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ConteudoActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    TalentosFragment talentosFragment = new TalentosFragment();
    VagasFragment vagasFragment = new VagasFragment();
    RecrutadoresFragment recrutadoresFragment = new RecrutadoresFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conteudo_layout);

        bottomNavigationView = findViewById(R.id.idBottomNavView);

        //Carregando a janela default no container
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.idContainer, talentosFragment)
                .commit();

        //Inserindo evento no bottomNavView
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mTalentos:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, talentosFragment)
                                .commit();
                        return true;

                    case R.id.mRecrutadores:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, recrutadoresFragment)
                                .commit();
                        return true;

                    case R.id.mVagas:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, vagasFragment)
                                .commit();
                        return true;
                }
                return false;
            }
        });
    }
}