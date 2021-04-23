package com.example.admin.appqcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class page5 extends AppCompatActivity {
    final String temp1 = "nom";
    String t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        Intent intent = getIntent();
        String mon = intent.getStringExtra(temp1);
        Log.e("helloooo",mon);
        if (mon.equals("M.MOHAMED ABDELFATTAH CHARIF CHEFCHAOUNI"))
            t = "Bravo " + mon + " est le premier directeur de l'INPT à l'ère digital";
        else
            t = "Mauvaise reponse " + mon + " n'est pas le premier directeur de l'INPT à l'ère digital";


        TextView aff = (TextView) findViewById(R.id.t5);
        TextView res = (TextView) findViewById(R.id.t6);

        if (aff != null)
            aff.setText(t);
        String m = "fin ";
        res.setText(m);
    }
}