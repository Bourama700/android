package com.example.admin.appqcm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page4 extends Activity {
    final String temp1="nom";
    Button Button9=null;
    Button Button10=null;
    Button Button11=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        Button9=(Button) findViewById(R.id.Boutton9);
        Button10=(Button) findViewById(R.id.Boutton10);
        Button11=(Button) findViewById(R.id.Boutton11);
    }
    public void goB9(View v){
        Intent intent=new Intent(page4.this,page5.class);
        intent.putExtra(temp1,Button9.getText().toString());
        startActivity(intent);}
    public void goB10(View v){
        Intent intent=new Intent(page4.this,page5.class);
        intent.putExtra(temp1,Button10.getText().toString());
        startActivity(intent);
    }
    public void goB11(View v){
        Intent intent=new Intent(page4.this,page5.class);
        intent.putExtra(temp1,Button11.getText().toString());
        startActivity(intent);

    }
}
