package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //instanciando a classe de handlers
        Handler handler = new Handler();

        //usando o método que executa algo após um tempo definido
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),InnerActivity.class));
                finish();
            }
        },3000);
    }


}