package com.example.student.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int count,dot=1;
    public double num1 =0.0,tem,num2=0;;
    public void RemoveZero(){
        EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
        String tem = InputEditText.getText().toString();
        if (tem.length() ==1 && tem.equals("0")) {
            InputEditText.setText("");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnEight = (Button) findViewById(R.id.btnEight);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnDot = (Button) findViewById(R.id.btnDecimal);
        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnZero =(Button) findViewById(R.id.btnZero);
        final EditText InputEditText = (EditText) findViewById(R.id.InputEditText);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                RemoveZero();
                InputEditText.setText(InputEditText.getText().toString()+"9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot==3){
                    InputEditText.setText("");
                    dot=1;
                }
                String tem = InputEditText.getText().toString();
                if (tem.equals("0")) {
                    InputEditText.setText("0");
                }
                else
                InputEditText.setText(InputEditText.getText().toString()+"0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tem = InputEditText.getText().toString();
                if(dot==3){
                    InputEditText.setText("");
                    InputEditText.setText(InputEditText.getText().toString()+"0.");
                    dot=2;
                }
                else if (dot==1 && tem.equals("")) {
                    InputEditText.setText(InputEditText.getText().toString()+"0.");
                    dot=2;
                }
                else if(dot==1 && !tem.equals("")){
                    InputEditText.setText(InputEditText.getText().toString()+".");
                    dot=2;
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tem = InputEditText.getText().toString();
                char[] ch=tem.toCharArray();
                TextView textview = (TextView) findViewById(R.id.textView);
                String op = textview.getText().toString();
                if(!op.equals("") && num2 !=0) {
                    count=0;
                    textview.setText("");
                    dot=2;
                }
                if (tem.length() >1 ) {
                    tem = tem.substring(0, tem.length() - 1);
                    InputEditText.setText(tem);
                    if((tem.length()==1) || (ch[tem.length()]=='.')) dot = 1;
                }
                else if (tem.length() <=1 ) {
                    InputEditText.setText("");
                    dot=1;
                }

            }
        });

        Button AddButton = (Button) findViewById(R.id.AddButton);
        Button SubButton = (Button) findViewById(R.id.SubButton);
        Button MulButton = (Button) findViewById(R.id.MulButton);
        Button DivButton = (Button) findViewById(R.id.DivButton);
        Button EqualButton = (Button) findViewById(R.id.EqualButton);
        Button btnC = (Button) findViewById(R.id.btnC);

        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
                TextView textView = (TextView) findViewById(R.id.textView);
                String test = InputEditText.getText().toString();
                String op = textView.getText().toString();
                if(!op.equals("")) {
                    textView.setText(num1 + "+");
                    count = 1;
                }
                if (test.equals("")) {
                    InputEditText.setText("");
                }
                else if(test.equals("-")) InputEditText.setText("");
                else {
                    num1 = Double.parseDouble(test);
                    InputEditText.setText("");
                    textView.setText(num1 +"+");
                    count = 1;
                }
                num2=0;
                dot=1;
            }
        });
        SubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
                String test = InputEditText.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);
                if (test.equals("") || test.equals("-")) {
                    InputEditText.setText("-");
                }

                else {
                    num1 = Double.parseDouble(test);
                    InputEditText.setText("");
                    textView.setText(num1 +"-");
                    count = 2;
                }
                num2=0;
                dot=1;
            }
        });
        MulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
                String test = InputEditText.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);
                String op = textView.getText().toString();
                if(!op.equals("")) {
                    textView.setText(num1 + "*");
                    count = 3;
                }
                if (test.equals("")) {
                   InputEditText.setText("");
                }

                else if(test.equals("-")) InputEditText.setText("");
                else {
                    num1 = Double.parseDouble(test);
                    InputEditText.setText("");
                    textView.setText(num1 +"*");
                    count = 3;
                }
                num2=0;
                dot=1;
            }
        });
        DivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
                String test = InputEditText.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);
                String op = textView.getText().toString();
                if(!op.equals("")) {
                    textView.setText(num1 + "/");
                    count = 4;
                }
                if (test.equals("")) {
                    InputEditText.setText("");
                }
                else if(test.equals("-")) InputEditText.setText("");
                else {
                    num1 = Double.parseDouble(test);
                    InputEditText.setText("");
                    textView.setText(num1 +"/");
                    count = 4;
                }

                num2=0;
                dot=1;
            }
        });

        EqualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
                String test = InputEditText.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);

                if (test.equals("") || test.equals("-")) {
                    Toast.makeText(MainActivity.this, "No Inputs!", Toast.LENGTH_SHORT).show();
                }
                else if(count==1){
                    if(num2 == 0){
                        num2 = Double.parseDouble(test);
                    }
                    tem = num1 +num2;
                    InputEditText.setText(tem+"");
                    textView.setText(num1 +"+"+num2);
                    num1 =tem;
                    dot=3;
                }
                else if(count==2){
                    if(num2 == 0){
                        num2 = Double.parseDouble(test);
                    }
                    tem = num1 - num2;
                    InputEditText.setText(tem+"");
                    textView.setText(num1 +"-"+num2);
                    num1 =tem;
                    dot=3;
                }
                else if(count==3){
                    if(num2 == 0){
                        num2 = Double.parseDouble(test);
                    }
                    tem = num1 *num2;
                    InputEditText.setText(tem+"");
                    textView.setText(num1 +"*"+num2);
                    num1 =tem;
                    dot=3;
                }
                else if(count==4){
                    if(num2 == 0){
                        num2 = Double.parseDouble(test);
                    }
                    tem = num1 /num2;
                    InputEditText.setText(tem+"");
                    textView.setText(num1 +"/"+num2);
                    num1 =tem;
                    dot=3;
                }
                else{
                    num1 = Double.parseDouble(test);
                    InputEditText.setText(num1+"");
                    textView.setText("");
                    dot=2;
                }

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                EditText InputEditText = (EditText) findViewById(R.id.InputEditText);
                InputEditText.setText("");
                num1 =0;
                num2=0;
                tem=0;
                count=0;
                dot=1;
                textView.setText("");
            }
        });
    }
}