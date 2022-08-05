package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CandidatosActivity extends AppCompatActivity {
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidatos_layout);

        bottomAppBar = findViewById(R.id.bottomBarCandidatos);

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.mBottomAlterar:
                        Toast.makeText(getApplicationContext(), "Cliquei em Alterar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomDeletar:
                        Toast.makeText(getApplicationContext(), "Cliquei em Deletar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomPesquisar:
                        Toast.makeText(getApplicationContext(), "Cliquei em Pesquisar", Toast.LENGTH_SHORT).show();
                        break;

                }

                return true;
            }
        });

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), R.string.msgNavBottomIcon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}