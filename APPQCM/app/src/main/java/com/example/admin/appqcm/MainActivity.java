package com.example.admin.appqcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String Ville="ville";
    Button Button1=null;
    Button Button2=null;
    Button Button3=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1=(Button) findViewById(R.id.Boutton1);
        Button2=(Button) findViewById(R.id.Boutton2);
        Button3=(Button) findViewById(R.id.Boutton3);
    }
    public void goB1(View v){
        Intent intent=new Intent(MainActivity.this,page1.class);
        intent.putExtra(Ville,Button1.getText().toString());
        startActivity(intent);}
    public void goB2(View v){
        Intent intent=new Intent(MainActivity.this,page1.class);
        intent.putExtra(Ville,Button2.getText().toString());
        startActivity(intent);
    }
    public void goB3(View v){
        Intent intent=new Intent(MainActivity.this,page1.class);
        intent.putExtra(Ville,Button3.getText().toString());
        startActivity(intent);
    }

}
