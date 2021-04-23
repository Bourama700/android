package com.example.tp_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void Gotop(View view){

        Intent intent =new Intent(MainActivity.this,Main3Activity.class);

        startActivity(intent);


    }
    public  void Gotom(View view){

        Intent intent =new Intent(MainActivity.this,Main2Activity.class);

        startActivity(intent);

    }

}
