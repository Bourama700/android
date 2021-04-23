package com.example.admin.appqcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page1 extends AppCompatActivity {
    final String Ville="ville";
    String t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        Intent intent = getIntent();
        String maville = intent.getStringExtra(Ville);
        if (maville.equals("Rabat"))
        { t = "Bravo "  +maville+   " est la capital du Maroc";
        }
        else
        {   t = "Mauvaise reponse " +maville+ " n'est pas la Capital du Maroc";
        }
        TextView aff = (TextView) findViewById(R.id.t3);

        if (aff != null)
            aff.setText(t);
    }
    public void goB4(View v){
        Intent intent=new Intent(page1.this,page2.class);
        startActivity(intent);
    }
}
