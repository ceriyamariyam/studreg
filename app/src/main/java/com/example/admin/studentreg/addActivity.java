package com.example.admin.studentreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addActivity extends AppCompatActivity {
EditText e1,e2,e3,e4;
    Button b1,b2;
String s1,s2,s3,s4;
    int a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        e1=(EditText)findViewById(R.id.a1);
        e2=(EditText)findViewById(R.id.a2);
        e3=(EditText)findViewById(R.id.a3);
        e4=(EditText)findViewById(R.id.re);

        b1=(Button)findViewById(R.id.add1);
        b2=(Button)findViewById(R.id.bk1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                a=Integer.parseInt(s1);
                b=Integer.parseInt(s2);
                c=Integer.parseInt(s3);
                d=a+b+c;
                s4=String.valueOf(d);
                e4.setVisibility(view.VISIBLE);
                e4.setText(s4);
//                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),StudActivity.class);
                startActivity(e);
            }
        });

    }
}


