package com.example.karmendra.hackbattle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.karmendra.hackbattle.data.signupdata;


import com.firebase.client.Firebase;


public class SignUp extends AppCompatActivity {


    final static String DB_URL="https://hackbattle-b007c.firebaseio.com/";
    EditText user_name;
    EditText user_username;
    EditText user_Phone;
    EditText user_password;
    Button buttonsignup;
    signupdata s;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //INITILIZE
        intilizrfirebase();

user_username= findViewById(R.id.textusername);
user_Phone= findViewById(R.id.textphone);
buttonsignup= findViewById(R.id.buttonsignup);
user_name= findViewById(R.id.textname);


        final Firebase fire=new Firebase(DB_URL);

        buttonsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupdata s= new signupdata();
                s.setUser_name(user_name.getText().toString());
                s.setUser_username(user_username.getText().toString());
                s.setUser_password(user_password.getText().toString());
                s.setUser_phone(user_Phone.getText().toString());

                //PERSIST

                fire.child("signupdata").setValue(s);
                user_name.setText("");
                user_username.setText("");
                user_Phone.setText("");
                user_password.setText("");

            }
        });



    }

    //INITILIZE OUR FIREBASE
    private void intilizrfirebase(){

        Firebase.setAndroidContext(this);

    }


}

