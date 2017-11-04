package com.entage.amirj.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonFibonacci, buttonGolden, buttonBisection;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        buttonFibonacci = findViewById(R.id.button1);
        buttonGolden = findViewById(R.id.button2);
        buttonBisection = findViewById(R.id.button3);


        buttonFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), FibonacciActivity.class);
                startActivity(intent);
            }
        });

        buttonGolden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), GoldenSectionActivity.class);
                startActivity(intent);
            }
        });

        buttonBisection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), BisectionActivity.class);
                startActivity(intent);
            }
        });
    }



}
