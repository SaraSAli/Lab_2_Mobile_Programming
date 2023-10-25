package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    public void navigateActivity(View view) {
        Intent i = new Intent(this, ViewActivity.class);
        //if the above syntax gives error then uncomment the below line
//        Intent i = new Intent(MainActivity.this, ViewActivity.class);
        startActivity(i);
    }
}