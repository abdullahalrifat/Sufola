package com.example.abdul.sufola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class manu extends AppCompatActivity implements View.OnClickListener  {
    Button logout,info,myarea,feedback,ninvension;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu);

        logout = (Button) findViewById(R.id.logout);
        info = (Button) findViewById(R.id.info);
        myarea = (Button) findViewById(R.id.myarea);
        feedback = (Button) findViewById(R.id.feedback);
        ninvension = (Button) findViewById(R.id.ninvension);

        logout.setOnClickListener(this);
        info.setOnClickListener(this);
        myarea.setOnClickListener(this);
        feedback.setOnClickListener(this);
        ninvension.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.logout:
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.info:
                startActivity(new Intent(this, Info.class));
                break;
            case R.id.myarea:
                startActivity(new Intent(this, MyArea.class));
                break;

            case R.id.ninvension:
                startActivity(new Intent(this, NewInvension.class));
                break;

            case R.id.feedback:
                startActivity(new Intent(this,FeedBack.class));
                break;
        }
    }
}
