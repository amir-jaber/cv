package com.entage.amirj.cv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FibonacciActivity extends AppCompatActivity {

    int funk_number;
    Spinner spinner;
    Button solve;
    Button show;
    TextView textView;
    TextView textView2;
    EditText editTextA;
    EditText editTextB;
    EditText editTextE;
    ImageView flower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golden_section);


        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        editTextA = findViewById(R.id.editText);
        editTextB = findViewById(R.id.editText2);
        editTextE = findViewById(R.id.editText3);
        solve = findViewById(R.id.button);
        show = findViewById(R.id.show1);
        flower = findViewById(R.id.imageView2);
        spinner = findViewById(R.id.spinner);

        textView.setBackgroundColor(0);
        textView2.setBackgroundColor(0);
        textView.setTextColor(Color.GRAY);
        textView2.setTextColor(Color.GRAY);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.functions_fibonacci, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:

                        funk_number = position;
                        flower.setImageResource(R.drawable.graph1fibonacci);
                        break;
                    case 1:

                        funk_number = position;
                        flower.setImageResource(R.drawable.graph2fibonacci);
                        break;
                    case 2:

                        funk_number = position;
                        flower.setImageResource(R.drawable.graph3fibonacci);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FibonacciAlgorithm.class));
            }
        });

        solve.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setBackgroundColor(Color.BLUE);
                textView2.setBackgroundColor(Color.BLUE);
                textView.setTextColor(Color.WHITE);
                textView2.setTextColor(Color.WHITE);

                String ed_text = editTextA.getText().toString().trim();
                String ed_text2 = editTextB.getText().toString().trim();
                String ed_text3 = editTextE.getText().toString().trim();
                if (ed_text.isEmpty() || ed_text2.isEmpty() || ed_text3.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill all text fields", Toast.LENGTH_SHORT).show();
                }else {
                    Double a = Double.parseDouble(editTextA.getText().toString());
                    Double b = Double.parseDouble(editTextB.getText().toString());
                    Double e = Double.parseDouble(editTextE.getText().toString());

                    Fibonacci fibonacci = new Fibonacci();
                    double i = fibonacci.findMin(a, b, e, funk_number);
                    double k = fibonacci.findMax(a, b, e, funk_number);
                    textView.setText("Min = " + Double.toString(i));
                    textView2.setText("Max = " + Double.toString(k));

                }

            }
        });
    }

}
