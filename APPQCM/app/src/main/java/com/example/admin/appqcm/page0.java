package com.example.admin.appqcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page0);
    }
    public void goB12(View v){
        Intent intent=new Intent(page0.this,MainActivity.class);
        startActivity(intent);
    }
}
