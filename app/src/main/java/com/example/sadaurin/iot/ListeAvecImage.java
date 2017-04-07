package com.example.sadaurin.iot;

import android.app.ListActivity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class ListeAvecImage extends ListActivity {
    SimpleAdapter adapter;
    ArrayList<HashMap<String, String>> data =
            new ArrayList<HashMap<String, String>>();

    ImageView p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_page_batiment);
        adapter= new SimpleAdapter(this,data,
                R.layout.layoutimage,new String[]{"name","firstname"},
                new int[] {R.id.textView_firstname,R.id.textView_firstname});

        setListAdapter(adapter);
       // ImageView view = (ImageView)findViewById(R.id.imagevert);

       // view.setVisibility(View.INVISIBLE);
        //p = (ImageView) this.findViewById(R.id.imagevert);
        addItem("210a", "210a");
        addItem("210b", "210b");

        //p.setVisibility(View.INVISIBLE);
    }




    private void addItem(String record_name, String record_fname) {
        HashMap<String,String> item = new HashMap<String,String>();
        item.put("name", record_name);
        item.put("firstname", record_fname);
        data.add(item);
    }
}
