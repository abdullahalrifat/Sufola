package com.example.abdul.sufola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FeedBack extends AppCompatActivity implements View.OnClickListener{
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){

        switch(v.getId()){
            case R.id.send:
                startActivity(new Intent(this,manu.class));
                break;


        }
    }
}
