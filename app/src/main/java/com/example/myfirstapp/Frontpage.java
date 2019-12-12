package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Frontpage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);
        Button profilBtn =(Button)findViewById(R.id.buttonbutton);
        Button faqBtn = (Button) findViewById(R.id.FAQ_Btn);

        profilBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent logRegIntent = new Intent(Frontpage.this, LoginAndRegister.class);
                startActivity(logRegIntent);
            }
        });

        faqBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent faqIntent = new Intent(Frontpage.this, FAQ.class);
                startActivity(faqIntent);
            }
        });

        Spinner spinner = findViewById(R.id.ticketSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tickets, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
      //  String text = parent.getItemAtPosition(position).toString();
      //  Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
