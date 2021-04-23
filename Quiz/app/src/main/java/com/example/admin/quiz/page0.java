package com.example.admin.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page0 extends AppCompatActivity {
    Button boutton12=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boutton12=(Button)findViewById(R.id.Boutton12) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page0);
    }
}
    public void goB12(View v){
        Intent intent=new Intent(page0.this,page1.class);
        startActivity(intent);
    }