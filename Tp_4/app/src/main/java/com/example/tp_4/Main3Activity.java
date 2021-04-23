package com.example.tp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    ListView list;
    imcAdapteur adapteur;
    addpersonne mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list=(ListView)findViewById(R.id.textview);

        mylist =((MyApplication.Myapplication)this.getApplication()).getMylist();
        adapteur=new imcAdapteur(Main3Activity.this,mylist);
        list.setAdapter(adapteur);

        Bundle message=getIntent().getExtras();

        if(message!=null){
            String nom=message.getString("nom");
            String prenom=message.getString("prenom");
            float  imc=message.getFloat("imc");
            String categorie=message.getString("categorie");


            Imc_Calcul p=new Imc_Calcul(nom,prenom,imc,categorie);
            mylist.getMylist().add(p);
            adapteur.notifyDataSetChanged();
        }


    }
}
