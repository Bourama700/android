package com.example.admin.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    imcAdapteur adapteur;
    addpersonne mylist;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list=(ListView)findViewById(R.id.textview);

        mylist =((Myapplication)this.getApplication()).getMylist();
        adapteur=new imcAdapteur(Main3Activity.this,mylist);
        list.setAdapter(adapteur);

        Bundle message=getIntent().getExtras();


        String nom =message.getString("nom2");
        String prenom =message.getString("prenom2");
        float  imc=message.getFloat("imc2");
        String categore=message.getString("categegorie2");

        Imc_calcul p=new Imc_calcul(nom,prenom,imc,categore);
        mylist.getMylist().add(p);
        adapteur.notifyDataSetChanged();

    }


    }

