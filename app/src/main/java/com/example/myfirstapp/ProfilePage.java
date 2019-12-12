package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilpage);
        int indexNew = LoginAndRegister.index;
        String name = LoginAndRegister.users.get(indexNew);

        TextView nametext = (TextView) findViewById(R.id.showUsername);
        nametext.setText(name);
    }
}
