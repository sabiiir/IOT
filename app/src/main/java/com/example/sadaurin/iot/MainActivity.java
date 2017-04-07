package com.example.sadaurin.iot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView p =(ImageView) findViewById(R.id.imagevert);

String url ="https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes";

new HttpHandler(url,this.getBaseContext());

    }
    public void batiment(View view) {
        Intent mp = new Intent(MainActivity.this,PageBatiment.class);
        startActivity(mp);
    }
}
