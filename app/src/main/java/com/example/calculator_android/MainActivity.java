package com.example.calculator_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1= (EditText) findViewById(R.id.Edit1);
        edit2= (EditText) findViewById(R.id.Edit2);
        btnAdd= (Button) findViewById(R.id.button1);
        btnSub= (Button) findViewById(R.id.button2);
        btnMul= (Button) findViewById(R.id.button3);
        btnDiv= (Button) findViewById(R.id.button4);
        textResult= (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result= Integer.parseInt(num1)+Integer.parseInt(num2);
                textResult.setText("계산 결과 : " +result.toString());
                return false;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result= Integer.parseInt(num1)-Integer.parseInt(num2);
                textResult.setText("계산 결과 : " +result.toString());
                return false;
            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result= Integer.parseInt(num1)*Integer.parseInt(num2);
                textResult.setText("계산 결과 : " +result.toString());
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result= Integer.parseInt(num1)/Integer.parseInt(num2);
                textResult.setText("계산 결과 : " +result.toString());
                return false;
            }
        });
    }
}