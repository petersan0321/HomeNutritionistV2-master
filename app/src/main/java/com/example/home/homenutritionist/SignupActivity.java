package com.example.home.homenutritionist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SignupActivity extends AppCompatActivity {

    Button myButton1;
    Button myButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        // setSignupButton();
        myButton1 = (Button) findViewById(R.id.btnSignup2);

        myButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SignupActivity.this, HomeActivity.class));
                Toast.makeText(SignupActivity.this,
                        "Welcome", Toast.LENGTH_SHORT).show();
            }
        });
        // setCancelButton();
        myButton2 = (Button) findViewById(R.id.btnCancel);

        myButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SignupActivity.this, MainActivity.class));
            }
        });
    }


}