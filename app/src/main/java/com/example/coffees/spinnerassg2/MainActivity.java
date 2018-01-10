package com.example.coffees.spinnerassg2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ArrayList<String> alState,alCity;
    ArrayAdapter<String>  aaState,aaCity;
    Spinner spState, spCity;
    EditText etState,etCity;
    TextView tState,tCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etState = (EditText) findViewById(R.id.editstate);
        etState = (EditText) findViewById(R.id.editcity);
        tState = (TextView) findViewById(R.id.textView1);
        tCity = (TextView) findViewById(R.id.textView2);
        spState = (Spinner) findViewById(R.id.spstate);
        spCity = (Spinner) findViewById(R.id.spcity);

        alState = new ArrayList<String>();
        alCity = new ArrayList<String>();
        aaState = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alState);
        aaCity = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alCity);

        alState.add("State");
        aaState.notifyDataSetChanged();
        spState.setAdapter(aaState);

        alCity.add("City");
        aaCity.notifyDataSetChanged();
        spCity.setAdapter(aaCity);

        spState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position > 0){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void addState(View view) {

    }

    public void addcity(View view) {

    }


}
