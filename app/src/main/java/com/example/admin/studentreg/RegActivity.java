package com.example.admin.studentreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    Button b1,b2;
    String r1,r2,r3,r4,r5,r6,r7,r8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.adno);
        ed3=(EditText)findViewById(R.id.rno);
        ed4=(EditText)findViewById(R.id.clg);
        ed5=(EditText)findViewById(R.id.plc);
        ed6=(EditText)findViewById(R.id.studid);
        ed7=(EditText)findViewById(R.id.pass);
        ed8=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.rstr);
        b2=(Button)findViewById(R.id.arstr);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1 = ed1.getText().toString();
                r2 = ed2.getText().toString();
                r3 = ed3.getText().toString();
                r4 = ed4.getText().toString();
                r5 = ed5.getText().toString();
                r6 = ed6.getText().toString();
                r7 = ed7.getText().toString();
                r8 = ed8.getText().toString();
                if (r7.equals(r8)) {
                    Toast.makeText(getApplicationContext(), r1, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r2, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r3, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r4, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r5, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r6, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r7, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r8, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "password and confirm password doesn't match", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),StudActivity.class);
                startActivity(i);
            }
        });


    }
}
