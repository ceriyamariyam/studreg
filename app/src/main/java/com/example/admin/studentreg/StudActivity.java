package com.example.admin.studentreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudActivity extends AppCompatActivity {
EditText ed1,ed2;
    Button b1,b2;
    String s1,s2;
    String sid="mzc";
    String sp="college";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud);
        ed1=(EditText)findViewById(R.id.sid);
        ed2=(EditText)findViewById(R.id.pswd);
        b1=(Button)findViewById(R.id.ln);
        b2=(Button)findViewById(R.id.reg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                if ((s1.equals(sid)) && (s2.equals(sp))) {
                    Intent e = new Intent(getApplicationContext(), loginActivity.class);
                    startActivity(e);

                    //        Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
                    //         Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_LONG).show();

                }
            else
                {
                    Toast.makeText(getApplicationContext(),"you are not authorized",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),RegActivity.class);
                startActivity(i);
            }
        });
    }
}
