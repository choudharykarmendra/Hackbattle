package com.example.karmendra.hackbattle;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText userPassword;
    private TextView info;
    private Button login;
    private int counter=5;
    private TextView userSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.etname);
        userPassword=(EditText)findViewById(R.id.etpassword);
        info=(TextView)findViewById(R.id.tvinfo);
        login=(Button)findViewById(R.id.btnLogin);
        userSignUp=(TextView) findViewById(R.id.tvregister);


        info.setText("No. of Attempts left= 5");







        userSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,SignUp.class));
            }
        });


    }

}
