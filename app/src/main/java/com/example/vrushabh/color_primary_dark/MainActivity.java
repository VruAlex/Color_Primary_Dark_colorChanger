package com.example.vrushabh.color_primary_dark;

import android.content.Intent;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //This Codes Over Ride the colorPrimaryDark color for best Color combination in activity
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.One));
        }

    }


    public  void SecondActivity (View view){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
        Toast.makeText(this, "Welcome to Second Activity", Toast.LENGTH_SHORT).show();
    }
    public  void ThirdActivity (View view){
        Intent i = new Intent(this, ThirdActivity.class);
        startActivity(i);
        Toast.makeText(this, "Welcome to Third Activity", Toast.LENGTH_SHORT).show();
    }

}
