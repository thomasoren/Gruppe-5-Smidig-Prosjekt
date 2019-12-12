package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.front.R;

import java.util.ArrayList;

public class LoginAndRegister extends AppCompatActivity {

    public ArrayList<String> users = new ArrayList<String>();
    public ArrayList<String> password = new ArrayList<String>();
    public ArrayList<String> getList(){
        return users;
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final Button registerBtn = (Button) findViewById(R.id.registerBtn);
        Button loginBtn = (Button)findViewById(R.id.loginBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String regConfirmTxt ="User Registered";
                EditText registerUsername = (EditText) findViewById(R.id.usernameText);
                EditText registerPassword = (EditText) findViewById(R.id.passwordText);
                TextView registerConfirm = (TextView) findViewById(R.id.regConfirm);
                registerConfirm.setText(regConfirmTxt);
                String regUser = registerUsername.getText().toString();
                String regPass = registerPassword.getText().toString();

                users.add(regUser);
                password.add(regPass);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                EditText loginUsername = (EditText) findViewById(R.id.usernameLogin);
                EditText loginPassword = (EditText) findViewById(R.id.passwordInput);

                String logUser = loginUsername.getText().toString();
                String logPass = loginPassword.getText().toString();

                TextView confirmLogin = (TextView) findViewById(R.id.loginConfirm);

                String success = "User logged in";
                String fail = "Wrong username or password";
                int arrSize = users.size();
                for (int i = 0; i < arrSize; i++) {
                    String userCheck = users.get(i);
                    String passCheck = password.get(i);
                    if (logUser.equals(userCheck)) {
                        if (logPass.equals(passCheck)) {
                            confirmLogin.setText(success);
                            Intent intent = new Intent(LoginAndRegister.this, ProfilePage.class);
                            startActivity(intent);

                        }else{
                            confirmLogin.setText(fail);
                        }
                    } else {
                        confirmLogin.setText(fail);
                    }
                }
            }
        }
        );
    }
}
