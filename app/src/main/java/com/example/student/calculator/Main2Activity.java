package com.example.student.calculator;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnGeneral = (Button)findViewById(R.id.btnGeneral);
        Button btnScience = (Button)findViewById(R.id.btnScience);

        btnScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, "Not Available", Toast.LENGTH_SHORT).show();
            }
        });
        btnGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent StartIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(StartIntent);
            }
        });


    }
}
