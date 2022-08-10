package br.com.myskout.myskout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class RecrutadoresFragment extends Fragment {
    Button btnMostrar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recrutadores, container, false);

        btnMostrar = view.findViewById(R.id.btnFragRec);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Recrutadores",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}