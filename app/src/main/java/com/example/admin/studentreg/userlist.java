package com.example.admin.studentreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class userlist extends AppCompatActivity {
    TextView t;
    String getname,getusername,getemail,getstreet,getcity,getzipcode,getsuite,finaldata="";
String url="https://jsonplaceholder.typicode.com/users";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        t=(TextView)findViewById(R.id.tv);
        FetchData();

    }

    private void FetchData() {
        Log.d("test","working");
//        Toast.makeText(getApplicationContext(),"function call",Toast.LENGTH_LONG).show();

        StringRequest stringrequest=new StringRequest(Request.Method.GET, url,

                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                       Log.d("response",response);
                        try
                        {
                            JSONArray jsonarray=new JSONArray(response);
                            for (int i=0;i<jsonarray.length();i++)
                            {
                                JSONObject jsonobject=jsonarray.getJSONObject(i);
                                getname=jsonobject.getString("name");
                                Log.d("name",getname);

                                getusername=jsonobject.getString("username");
                                Log.d("username",getusername);

                                getemail=jsonobject.getString("email");
                                Log.d("email",getemail);
                                JSONObject ob1=new JSONObject(jsonobject.getString("address"));
                                getstreet=ob1.getString("street");
                                getcity=ob1.getString("city");
                                getzipcode=ob1.getString("zipcode");
                                getsuite=ob1.getString("suite");

                                finaldata +="Name :" + getname + "\n";

                                finaldata +="Email :" + getemail + "\n";

                                finaldata +="username :" + getusername + "\n";
                                finaldata +="address :-\n" +
                                        "Street:" + getstreet + "\n"+
                                "City : "+ getcity + "\n"+
                                "Zipcode :" + getzipcode +"\n"+
                                "Suite :" + getsuite +"\n";


                                finaldata +=" \n";

                            }
                      t.setText(finaldata);
                        }
                        catch(JSONException ob)
                        {
                         Log.d("Exception",ob.toString());
                    }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        RequestQueue resquestQueue= Volley.newRequestQueue(getApplicationContext());
        resquestQueue.add(stringrequest);

    }
}
