package com.example.abdul.sufola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tructor extends AppCompatActivity implements View.OnClickListener{
   Button get;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tructor);
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);
        get = (Button) findViewById(R.id.get);
        get.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch(v.getId()){
            case R.id.get:
                startActivity(new Intent(this,getproduct.class));
                break;
            case R.id.back:
                startActivity(new Intent(this,NewInvension.class));
                break;

        }
    }
}
