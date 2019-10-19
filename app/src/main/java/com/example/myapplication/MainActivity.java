package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
float a,b,c,d,e;
    float a1, b1, c1, d1, e1,x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    //a denotes marks in applied mechanics out of 30
    //b denotes marks in physics out of 30
    //c denotes marks in electronics out of 30
    //d denotes marks in maths out of 30
    //e denotes marks in computer out of 30

    //a1 denotes pointer in applied mechanics
    //b1 denotes pointer in physics
    //c1 denotes pointer in electronics
    //d1 denotes pointer in maths
    //e1 denotes pointer in computer

    //x denotes your pointer in mid sem examination
    // 4 are credits of applied mechanics,physics,maths
    // 3 are credits of computer,electronics


        public float pointer(float m){
            int a11;
            if (m >= 24 && m <= 30) {
                a11 = 10;
            }
            else if (m >= 21 && m < 24) {
                a11 = 9;
            }
            else if (m >= 18 && m < 21) {
                a11 = 8;
            }
            else if (m >= 15 && m < 18) {
                a11 = 7;
            }
            else if (m >= 13.5 && m < 15) {
                a11 = 6;
            }
            else if (m >= 12 && m < 13.5) {
                a11 = 5;
            }
            else if (m >= 9 && m < 12) {
                a11 = 4;
            }
            else{
                a11 = 0;
            }
            return a11;
        }
        //function to calculate pointer in physics


        //function to calculate the pointer in midsem according the marking scheme of nit hamirpur
        public void pointer1(View view){
            EditText edt = (EditText) findViewById(R.id.editText2);
            a = Float.parseFloat(edt.getText().toString());
            if(a>30)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be greater than 30 ",Toast.LENGTH_LONG).show();
            }
            else if(a<0)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be less than 0 ",Toast.LENGTH_LONG).show();
            }

             else
                a1=pointer(a);

            EditText edt1 = (EditText) findViewById(R.id.editText3);
            b = Float.parseFloat(edt1.getText().toString());
            if(b>30)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be greater than 30 ",Toast.LENGTH_LONG).show();
            }
            else if(b<0)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be less than 0 ",Toast.LENGTH_LONG).show();
            }

            else
                b1=pointer(b);
            EditText edt2 = (EditText) findViewById(R.id.editText4);
            c = Float.parseFloat(edt2.getText().toString());
            EditText dt = (EditText) findViewById(R.id.editText5);
            if(c>30)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be greater than 30 ",Toast.LENGTH_LONG).show();
            }
            else if(c<0)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be less than 0 ",Toast.LENGTH_LONG).show();
            }

            else
                c1=pointer(c);
            d = Float.parseFloat(dt.getText().toString());

            if(d>30)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be greater than 30 ",Toast.LENGTH_LONG).show();
            }
            else if(d<0)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be less than 0 ",Toast.LENGTH_LONG).show();
            }

            else
                d1=pointer(d);
            EditText et = (EditText) findViewById(R.id.editText6);
            e = Float.parseFloat(et.getText().toString());
            if(e>30)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be greater than 30 ",Toast.LENGTH_LONG).show();
            }


            else if(e<0)
            {
                Toast.makeText(getApplicationContext(),"Marks cant be less than 0 ",Toast.LENGTH_LONG).show();
            }

            else
                e1=pointer(e);




            x = (((a1*4)+(b1*4)+(c1*3)+(d1*4)+(e1*3))/18);
            display(x);
        }
        //function to print the pointer
        private void display(float c) {
            TextView t = (TextView) findViewById(R.id.textView9);
            t.setText(" "+String.valueOf(c));
    }

    }
