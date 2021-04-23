package com.example.admin.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void Gotop(View view){


        Bundle message=getIntent().getExtras();

        String nom3 = message.getString("nom");
        String prenom3= message.getString("prenom");
        float imc3 = message.getFloat("imc");
        String categorie3 = message.getString("catego");

        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        intent.putExtra("nom2", nom3);
        intent.putExtra("prenom2", prenom3);
        intent.putExtra("categegorie2",categorie3);
        intent.putExtra("imc2", imc3);
        startActivity(intent);

    }
    public  void Gotom(View view){


            Intent intent = new Intent(MainActivity.this, Main2Activity.class);

            startActivity(intent);

    }
}
