
package com.example.admin.calculator;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText nom,prenom,taille,poids;
    TextView imc_text8,categorie_text10,info_text1,nom_text2,prenom_text3,taille_text4,poids_text5;
    Button calculer,acceuil;
    private String tet;
    private float cal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom=(EditText)findViewById(R.id.nom_edit1);
        prenom=(EditText)findViewById(R.id.prenom_edit2);
        taille=(EditText)findViewById(R.id.taille_edit3);
        poids=(EditText)findViewById(R.id.poids_edit4);
        imc_text8=(TextView)findViewById(R.id.imc_1);
        categorie_text10=(TextView)findViewById(R.id.categorie);
        info_text1=(TextView)findViewById(R.id.information);
        nom_text2=(TextView)findViewById(R.id.nom);
        prenom_text3=(TextView)findViewById(R.id.prenom);
        taille_text4=(TextView)findViewById(R.id.taille);
        poids_text5=(TextView)findViewById(R.id.poids);
        calculer=(Button)findViewById(R.id.calculer) ;
        acceuil=(Button)findViewById(R.id.acceuil) ;
        info_text1.setText(getResources().getText(R.string.info));
        nom_text2.setText(getResources().getText(R.string.name));
        prenom_text3.setText(getResources().getText(R.string.first));
        taille_text4.setText(getResources().getText(R.string.taill));
        poids_text5.setText(getResources().getText(R.string.polo));
        calculer.setText(getResources().getText(R.string.calcul));
       acceuil.setText(getResources().getText(R.string.acceuil));



        if(savedInstanceState !=null) {
            tet = savedInstanceState.getString("val2");
            cal = savedInstanceState.getFloat("val");
            imc_text8.setText(String.valueOf(cal));
           categorie_text10.setText(tet);


        }
    }
    public void Calculer(View view){
        Resources res=getResources();
        if(verify()==0 ){
            Toast.makeText(getApplicationContext(),res.getString(R.string.vide5), Toast.LENGTH_LONG).show();
        }else if(verify()==1) {
            Toast.makeText(getApplicationContext(),res.getString(R.string.vide2), Toast.LENGTH_LONG).show();

        }else{
            String nom1=nom.getText().toString();
            String prenom1=prenom.getText().toString();
            float taille1=Float.parseFloat(taille.getText().toString());
            float poids1=Float.parseFloat(poids.getText().toString());

            Imc_calcul ic=new Imc_calcul(nom1,prenom1,taille1,poids1);

            try {
                ic.imc_calcul();
                imc_text8=(TextView)findViewById(R.id.imc_1);
                categorie_text10=(TextView)findViewById(R.id.categorie);
               imc_text8.setText(String.valueOf(ic.getImc()));

                 String pt=translation(ic.getCategorie());
                categorie_text10.setText(pt);
            }catch (Exception ex){
                Toast.makeText(getApplicationContext(),res.getString(R.string.erreur), Toast.LENGTH_LONG).show();
            }
        }

    }

    public void acceuil(View view){
        Resources res=getResources();

        if(verify()==0 ){
            Toast.makeText(getApplicationContext(),res.getString(R.string.vide5), Toast.LENGTH_LONG).show();
        }else if(verify()==1) {
            Toast.makeText(getApplicationContext(),res.getString(R.string.vide2), Toast.LENGTH_LONG).show();
        }
        else{
            String nom1=nom.getText().toString().trim();
            String prenom1=prenom.getText().toString().trim();
            float taille1=Float.parseFloat(taille.getText().toString());
            float poids1=Float.parseFloat(poids.getText().toString());
            Imc_calcul ic=new Imc_calcul(nom1,prenom1,taille1,poids1);
           imc_text8=(TextView)findViewById(R.id.imc_1);
            categorie_text10=(TextView)findViewById(R.id.categorie);
            String categorie1=categorie_text10.getText().toString();
            float  imc1=Float.parseFloat(imc_text8.getText().toString());

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

        String categorie1=categorie_text10.getText().toString();
        float  imc1=Float.parseFloat(imc_text8.getText().toString());
        super.onSaveInstanceState(outState);
        outState.putFloat("val",imc1);
        outState.putString("val2",categorie1);
    }

    public String translation(String cat) {
        Resources res = getResources();
        if (cat == "dénutrition") {
            cat = res.getString(R.string.cat2);
        }
        if (cat == "surpoids") {
            cat = res.getString(R.string.cat1);
        }
        if (cat == "maigreur") {
            cat = res.getString(R.string.cat3);
        }
        if (cat == "corpulence normale") {
            cat = res.getString(R.string.cat4);
        }
        if (cat == "obesité modérer") {
            cat = res.getString(R.string.cat5);
        }
        if (cat == "obesité sévère") {
            cat = res.getString(R.string.cat6);
        }
        if (cat == "obesité morbide ou massive") {
            cat = res.getString(R.string.cat7);

        }
    return cat;
    }

}
