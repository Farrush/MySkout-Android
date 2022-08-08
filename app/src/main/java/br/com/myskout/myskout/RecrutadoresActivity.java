package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecrutadoresActivity extends AppCompatActivity {
    ListView lstRecrutadores;

    int imageRec[] = {
            R.drawable.walt,
            R.drawable.john,
            R.drawable.astrid,
            R.drawable.anne,
            R.drawable.arthur,
            R.drawable.james,
            R.drawable.kodlak,
            R.drawable.elisa,
            R.drawable.nami,
            R.drawable.margaret
    };
    String nomeRec[] = {
            "Walter White","John Smith","Astrid","Anne Park","Arthur Thunder",
            "James Hetfield","Kodlak Whitemane","Elisa Johnson","Nami Miyamoto","Margaret Sledge"

    };
    String cargoRec[] = {
            "Químico","Gerente de RH","Líder da Dark Brotherhood",
            "CEO da Fundação Speedwagon","Gerente de RH","Guitarrista",
            "Líder dos Companheiros","Especialista em Professional Development","Gerente de RH","CEO da ACME corporation"

    };
    String descRec[] = {
            "Anos de experência como professor de química.",
            "Mais de 10 anos de experiência recrutando profissionais.","Comanda a irmãdade e faz o possível para mantê-la.",
            "CEO na Fundação Speedwagon há 5 anos.","Anos de experência como professor de química.",
            "Guitarrista e vocalista da banda Metallica.",
            "É o membro mais respeitado entre os guerreiros da guilda, conhecida como \"Companheiros\".",
            "Mais de 10 anos de experiência recrutando profissionais. e alavancando carreiras.","Mais de 10 anos de experiência recrutando profissionais.",
            "CEO da corporação ACME há 11 anos."

    };
    String ratingRec[] = {
            "4.2","4.5","2","5","4","4.7","5","4.6","4.2","4.9"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recrutadores_layout);

        lstRecrutadores = findViewById(R.id.lstRecrutadores);

        AdapterRecr adaptador = new AdapterRecr();
        lstRecrutadores.setAdapter(adaptador);
    }

    public class AdapterRecr extends BaseAdapter {

        @Override
        public int getCount() {
            return imageRec.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View v, ViewGroup viewGroup) {
            TextView txtNome,txtDesc,txtCargo,txtRating;
            ImageView imgRec;
            View view = getLayoutInflater().inflate(R.layout.modelo_recrutadores,null);
            txtNome = view.findViewById(R.id.txtModTitulo);
            txtCargo = view.findViewById(R.id.txtModSubtitulo);
            txtDesc = view.findViewById(R.id.txtModDesc);
            txtRating = view.findViewById(R.id.txtModRating);
            imgRec = view.findViewById(R.id.imgModRec);

            txtNome.setText(nomeRec[i]);
            txtCargo.setText(cargoRec[i]);
            txtDesc.setText(descRec[i]);
            txtRating.setText(ratingRec[i]);
            imgRec.setImageResource(imageRec[i]);
            return view;
        }
    }
}