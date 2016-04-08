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

public class NewInvension extends AppCompatActivity implements View.OnClickListener{
    Button back;
    TextView tvmore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_invension);
        tvmore = (TextView) findViewById(R.id.tvmore);
       back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);
        tvmore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch(v.getId()){
            case R.id.back:
                startActivity(new Intent(this,manu.class));
                break;
            case R.id.tvmore:
                startActivity(new Intent(this,tructor.class));
                break;
        }
    }

}
