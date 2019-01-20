package com.example.android.saturdaycodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText mUsername;
    EditText mEmail;
    EditText mPassword;
    String name;
    String mail;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button mSignUp = findViewById(R.id.signUpButton);
        mUsername = findViewById(R.id.usernameField2);
        mEmail = findViewById(R.id.emailField);
        mPassword = findViewById(R.id.passwordField1);

        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = mUsername.getText().toString();
                mail = mEmail.getText().toString();
                pass = mPassword.getText().toString();
                if (name.matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter Username", Toast.LENGTH_SHORT).show();
                }
                if (mail.matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter Email", Toast.LENGTH_SHORT).show();
                }
                if (pass.matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent loginIntent = new Intent(SignUpActivity.this, WelcomeActivity.class);
                    loginIntent.putExtra("key", name);
                    startActivity(loginIntent);
                    Toast.makeText(getApplicationContext(), "Sign Up Successful", Toast.LENGTH_SHORT).show();
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            }
        });
    }
}
