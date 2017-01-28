package com.example.yassarchohan.smart_parking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Admin_view extends AppCompatActivity {

    Button btn,btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view);



        btn = (Button) findViewById(R.id.forparking);
        btn1 = (Button) findViewById(R.id.seeslots);
        btn2 = (Button) findViewById(R.id.feedback);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,new feedback_view()).commit();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,new slots()).commit();


            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,new parking_database()).commit();

            }
        });

    }
}
