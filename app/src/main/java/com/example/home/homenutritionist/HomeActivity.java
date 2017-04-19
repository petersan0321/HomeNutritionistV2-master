package com.example.home.homenutritionist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    Button myButton3;
    Button myButton4;
    Button myButton5;
    Button myButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        //menu
        myButton3 = (Button) findViewById(R.id.btnMenu);

        myButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, MenuActivity.class));
            }
        });

        //caltor
        myButton4 = (Button) findViewById(R.id.btnCaltor);

        myButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, Menu_Calculator_Fragment.class));
            }
        });

        //blog
        myButton5 = (Button) findViewById(R.id.btnBlog);

        myButton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, NutritionistBlogActivity.class));
            }
        });

        //quiz
        myButton6 = (Button) findViewById(R.id.btnQuiz);

        myButton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, NutritionQuizActivity.class));
            }
        });
    }


}