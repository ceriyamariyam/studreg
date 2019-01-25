package com.example.admin.studentreg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
String usr,pass;
    String getuser,getpass;
    Button b,b1;
    ImageView im1,im2,im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b=(Button)findViewById(R.id.logout);
        im1=(ImageView)findViewById(R.id.i1);
        im2=(ImageView)findViewById(R.id.i2);
        im3=(ImageView)findViewById(R.id.i3);
        im4=(ImageView)findViewById(R.id.i4);
        b1=(Button)findViewById(R.id.bv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i=new Intent(getApplicationContext(),viewActivity.class);
                startActivity(i);


            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         Intent i=new Intent(getApplicationContext(),addActivity.class);
                startActivity(i);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),subActivity.class);
                startActivity(i);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),divActivity.class);
                startActivity(i);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),mulActivity.class);
                startActivity(i);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(),StudActivity.class);
                startActivity(i);
            }
        });
        SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        getuser=sharedPreferences.getString("sid",null);
        getpass=sharedPreferences.getString("pswd",null);
        Toast.makeText(getApplicationContext(),getuser,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),getpass,Toast.LENGTH_LONG).show();


//        Intent e=getIntent();
//        usr=e.getExtras().getString("sid");
//        pass=e.getStringExtra("pswd");
//        Toast.makeText(getApplicationContext(),usr,Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();

    }
}
