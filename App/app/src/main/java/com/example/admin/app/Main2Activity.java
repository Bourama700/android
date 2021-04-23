package com.example.admin.app;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText nom,prenom,taille,poids;
    TextView text8,text10;
    private String tet;
    private float cal;
    private Integer config=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom=(EditText)findViewById(R.id.edit1);
        prenom=(EditText)findViewById(R.id.edit2);
        taille=(EditText)findViewById(R.id.edit3);
        poids=(EditText)findViewById(R.id.edit4);
        text8=(TextView)findViewById(R.id.text8);
        text10=(TextView)findViewById(R.id.text10);


    if(savedInstanceState !=null) {
        tet = savedInstanceState.getString("val2");
        cal = savedInstanceState.getFloat("val1");
        text8.setText(String.valueOf(cal));
        text10.setText(tet);


    }
    }
    public void Calculer(View view){
        if(verify()==0 ){
            Toast.makeText(getApplicationContext(),"nom est vide", Toast.LENGTH_LONG).show();
        }else if(verify()==1) {
            Toast.makeText(getApplicationContext(),"prenom est vide", Toast.LENGTH_LONG).show();

        }else{
        String nom1=nom.getText().toString();
        String prenom1=prenom.getText().toString();
        float taille1=Float.parseFloat(taille.getText().toString());
        float poids1=Float.parseFloat(poids.getText().toString());




        Imc_calcul ic=new Imc_calcul(nom1,prenom1,taille1,poids1);
        Resources res=getResources();
        try {
            ic.imc_calcul();

            text8.setText(String.valueOf(ic.getImc()));


            text10.setText(ic.getCategorie());
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(),res.getString(R.string.erreur), Toast.LENGTH_LONG).show();
        }
        }

    }

    public void acceuil(View view){

        if(verify()==0 ){
            Toast.makeText(getApplicationContext(),"nom est vide", Toast.LENGTH_LONG).show();
        }else if(verify()==1) {
            Toast.makeText(getApplicationContext(),"prenom est vide", Toast.LENGTH_LONG).show();
        }
        else{
            String nom1=nom.getText().toString().trim();
            String prenom1=prenom.getText().toString().trim();
            float taille1=Float.parseFloat(taille.getText().toString());
            float poids1=Float.parseFloat(poids.getText().toString());
            Imc_calcul ic=new Imc_calcul(nom1,prenom1,taille1,poids1);

            String categorie1=text10.getText().toString();
            float  imc1=Float.parseFloat(text8.getText().toString());

            Intent intent =new Intent(Main2Activity.this,MainActivity.class);
            intent.putExtra("nom",nom1);
            intent.putExtra("prenom",prenom1);
            intent.putExtra("catego",categorie1);
            intent.putExtra("imc",imc1);


            startActivity(intent);

        }

    }
    public  int verify(){

        String text=nom.getText().toString();
        String text1=prenom.getText().toString();

        if(text.length()==0){
            return 0;
        }
        else if(prenom.length()==0){
            return  1;
        }else{
            return 2;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        String categorie1=text10.getText().toString();
        float  imc1=Float.parseFloat(text8.getText().toString());
        super.onSaveInstanceState(outState);
        outState.putFloat("val",imc1);
        outState.putString("val2",categorie1);
    }


}
