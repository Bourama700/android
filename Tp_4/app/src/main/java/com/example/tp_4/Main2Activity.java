package com.example.tp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
EditText nom,prenom,taille,poids,imc,categorie;
TextView text8,text10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom=(EditText)findViewById(R.id.edit1);
        prenom=(EditText)findViewById(R.id.edit2);
        taille=(EditText)findViewById(R.id.edit3);
        poids=(EditText)findViewById(R.id.edit4);
    }

    public void Calculer(View view){
        String nom1=nom.getText().toString();
        String prenom1=prenom.getText().toString();
        float taille1=Float.parseFloat(taille.getText().toString());
        float poids1=Float.parseFloat(poids.getText().toString());

        Imc_Calcul ic=new Imc_Calcul(nom1,prenom1,taille1,poids1);
        Resources res=getResources();
        try {
            ic.CalculIMC();
         text8=(TextView)findViewById(R.id.text8);
         text8.setText(String.valueOf(ic.getImc()));

         text10=(TextView)findViewById(R.id.text10);
         text10.setText(String.valueOf(ic.getImc()));
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(),res.getString(R.string.erreur1), Toast.LENGTH_LONG).show();
        }

        Intent intent=new Intent();

        intent.putExtra("nom",nom1);
        intent.putExtra("prenom",prenom1);
        intent.putExtra("imc",ic.getImc());
        intent.putExtra("categorie",ic.getCategorie());
        startActivity(intent);

    }
    public void acceuil(View view){


    }
}
