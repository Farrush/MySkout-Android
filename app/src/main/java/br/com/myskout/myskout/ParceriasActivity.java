package br.com.myskout.myskout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ParceriasActivity extends AppCompatActivity {
    FloatingActionButton fabParcCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parcerias_layout);

        fabParcCadastrar = findViewById(R.id.fabParcCadastrar);
        fabParcCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em cadastrar", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_parcerias, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mParceriaAlterar:
                Toast.makeText(getApplicationContext(), "Cliquei em alterar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParceriaDeletar:
                Toast.makeText(getApplicationContext(), "Cliquei em deletar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParceriaPesquisar:
                Toast.makeText(getApplicationContext(), "Cliquei em pesquisar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParceriaSair:
                Toast.makeText(getApplicationContext(), "Cliquei em sair", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}