package com.example.sadaurin.iot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import static android.view.View.VISIBLE;

public class PageSalle extends AppCompatActivity {
    ArrayAdapter<String> adapter;

    ListView mListeView;

    String[] values1 = {
            "101", "102", "103", "1024"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_page_salle);




        mListeView = (ListView) findViewById(R.id.lst3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(PageSalle.this,android.R.layout.simple_expandable_list_item_1,values1);
        mListeView.setAdapter(adapter);







    }








}
