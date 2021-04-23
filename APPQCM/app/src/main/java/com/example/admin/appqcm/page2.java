package com.example.admin.appqcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
    final String temp="000";
    Button Button5=null;
    Button Button6=null;
    Button Button7=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button5=(Button) findViewById(R.id.Boutton5);
        Button6=(Button) findViewById(R.id.Boutton6);
        Button7=(Button) findViewById(R.id.Boutton7);
    }
    public void goB5(View v){
        Intent intent=new Intent(page2.this,page3.class);
        intent.putExtra(temp,Button5.getText().toString());
        startActivity(intent);}
    public void goB6(View v){
        Intent intent=new Intent(page2.this,page3.class);
        intent.putExtra(temp,Button6.getText().toString());
        startActivity(intent);
    }
    public void goB7(View v){
        Intent intent=new Intent(page2.this,page3.class);
        intent.putExtra(temp,Button7.getText().toString());
        startActivity(intent);
    }
}
