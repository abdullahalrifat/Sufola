package com.example.abdul.sufola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnlogin;
    EditText editpassword,editusername;
    TextView tvregisterlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editusername = (EditText) findViewById(R.id.editusername);
        editpassword = (EditText) findViewById(R.id.editpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        tvregisterlink = (TextView) findViewById(R.id.tvregisterlink);
        btnlogin.setOnClickListener(this);
        tvregisterlink.setOnClickListener(this);
    }
        @Override
        public void onClick(View v){

            switch(v.getId()){
                case R.id.btnlogin:
                    startActivity(new Intent(this,manu.class));
                        break;

                case R.id.tvregisterlink:
                    startActivity(new Intent(this,signup.class));
                    break;
            }
        }


}
