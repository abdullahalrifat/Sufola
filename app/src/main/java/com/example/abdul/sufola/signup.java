package com.example.abdul.sufola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity implements View.OnClickListener {

    Button btnsignup;
    EditText etname,etphnnumber,etusername,etpassword,etrepassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        etname=(EditText) findViewById(R.id.etname);
        etphnnumber=(EditText) findViewById(R.id.etphnnumber);
        etusername=(EditText) findViewById(R.id.etusername);
        etpassword=(EditText) findViewById(R.id.etpassword);
        etrepassword=(EditText) findViewById(R.id.etrepassword);
        btnsignup=(Button)findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(this);

    }


    @Override
    public void onClick(View v){

        switch(v.getId()){
            case R.id.btnsignup:
                startActivity(new Intent(this,MainActivity.class));
                break;

        }
    }
}
