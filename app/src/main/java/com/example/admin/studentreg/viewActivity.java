package com.example.admin.studentreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class viewActivity extends AppCompatActivity {
ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        lv1=(ListView)findViewById(R.id.lv);
        String[] students={"reni","arya","anu"};
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.activity_list_item,students);
        lv1.setAdapter(adapter);
    }
}
