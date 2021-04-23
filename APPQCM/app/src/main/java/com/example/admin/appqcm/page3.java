package com.example.admin.appqcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    final String temp="000";
    String t;
    String nbre1,nbre2;
    int occ=0;
    int lol=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Intent intent = getIntent();
        String an = intent.getStringExtra(temp);
        Intent intent1 = getIntent();
        int occ1 = intent1.getIntExtra(nbre1,occ);
        int lol1=intent1.getIntExtra(nbre2,lol);
        if (an.toLowerCase().equals("1961"))
        { t = "Bravo " +an+ " est la date de création de l'INPT";
            occ1++;
            Intent intent2=new Intent(page3.this,page5.class);
            intent1.putExtra(nbre1,occ1);}
        else
        {   t = "Mauvaise reponse " +an+ " n'est pas la date de création de l'INPT";
            lol1++;
            Intent intent2=new Intent(page3.this,page5.class);
            intent2.putExtra(nbre2,lol1);}
        TextView aff = (TextView) findViewById(R.id.t4);

        if (aff != null)
            aff.setText(t);
    }
    public void goB8(View v){
        Intent intent=new Intent(page3.this,page4.class);
        startActivity(intent);
    }

}
