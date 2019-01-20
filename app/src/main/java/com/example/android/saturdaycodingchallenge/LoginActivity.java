package com.example.android.saturdaycodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    String name;
    String pass;
    EditText mUsername;
    EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button mLogin = findViewById(R.id.loginButton);
        mUsername = findViewById(R.id.usernameField);
        mPassword = findViewById(R.id.passwordField);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = mUsername.getText().toString();
                pass = mPassword.getText().toString();
                if (name.matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter Username", Toast.LENGTH_SHORT).show();
                }
                if (pass.matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent loginIntent = new Intent(LoginActivity.this, WelcomeActivity.class);
                    loginIntent.putExtra("key", name);
                    startActivity(loginIntent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            }
        });
    }
}
