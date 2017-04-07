package com.example.sadaurin.iot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailSalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_salle);
        Intent intent = getIntent();
        String sal = intent.getStringExtra("salle");
        String bat= intent.getStringExtra("bat");

        TextView batiment = (TextView)findViewById(R.id.textView3);
        batiment.setText(bat);

        TextView salle = (TextView)findViewById(R.id.textView6);
        salle.setText("Salle " + sal);
        /*Toast toast = Toast.makeText(DetailSalle.this, bat, Toast.LENGTH_SHORT);
        toast.show();*/
    }
}
