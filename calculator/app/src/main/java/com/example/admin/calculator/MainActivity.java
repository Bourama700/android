package com.example.admin.calculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text1;
LinearLayout linear;
TextView  text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.page1_1);
        text1.setText(getResources().getText(R.string.histo));


    }
    public  void Gotoacceuil(View view){


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
    public  void Gotoformulaire(View view){


        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        startActivity(intent);

    }
}
