package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_point;
    Button btn_AC,btn_DEL,btn_percentage,btn_division,btn_substraction,btn_multiplication,btn_addition,btn_equal;
    TextView TV_ResultField,TV_InputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initailizer();
        handleNumBtns();
        handleOpBtns();
        handleEqualBtn();

    }

    public void initailizer(){
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_point = findViewById(R.id.btn_point);

        btn_AC = findViewById(R.id.btn_AC);
        btn_DEL = findViewById(R.id.btn_DEL);
        btn_percentage = findViewById(R.id.btn_percentage);
        btn_division = findViewById(R.id.btn_division);
        btn_substraction = findViewById(R.id.btn_substraction);
        btn_multiplication = findViewById(R.id.btn_multiplication);
        btn_addition = findViewById(R.id.btn_addition);
        btn_equal = findViewById(R.id.btn_equal);

        TV_ResultField = findViewById(R.id.TV_ResultField);
        TV_InputField = findViewById(R.id.TV_InputField);


    }
    public void handleNumBtns(){

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_0.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_1.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_2.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_3.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_4.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_5.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_6.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_7.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_8.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_9.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });
    }
    public void handleOpBtns(){

        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_addition.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_substraction.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_multiplication.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_division.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String one = btn_percentage.getText().toString();
                TV_InputField.setText(temp+one);
            }
        });

        btn_DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_InputField.getText().toString();
                String tempx = temp.substring(0,temp.length()-1);
                TV_InputField.setText(tempx);
            }
        });

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ALL CLEARED", Toast.LENGTH_SHORT).show();
                TV_InputField.setText("");
                TV_ResultField.setText("");
            }
        });
    }

    public void handleEqualBtn(){
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exp = TV_InputField.getText().toString();
                String res = eval(exp);
                TV_ResultField.setText(res);
//                Toast.makeText(MainActivity.this, exp, Toast.LENGTH_SHORT).show();

            }
        });
    }

    public String eval(String str){
        try {
            Context rHino = Context.enter();
            rHino.setOptimizationLevel(-1);
            Scriptable scope = rHino.initStandardObjects();
            String tempRes = rHino.evaluateString(scope,str,"javascript",1,null).toString();
            return tempRes;
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
            Context.exit();
        }
        return "Error";
    }


}