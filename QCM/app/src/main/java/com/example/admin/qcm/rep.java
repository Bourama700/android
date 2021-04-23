package com.example.admin.qcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class rep extends AppCompatActivity {
   final String Ville="ville";
   String t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rep);
        Intent intent = getIntent();
        String maville = intent.getStringExtra(Ville);
        if (maville.toLowerCase().equals("Rabat"))
            t = "Bravo "+maville+"est la capital du Maroc";
        else
            t = "Mauvaise reponse"+maville+"n'est pas la Capital du Maroc";
        TextView aff = (TextView) findViewById(R.id.t3);

        if (aff != null)
            aff.setText(t);

    }
}
