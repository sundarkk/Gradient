package com.example.gradient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText EdtUsername,EdtPassword;
    Button BtnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EdtUsername = (EditText)findViewById(R.id.EdtUsername);
        EdtPassword = (EditText)findViewById(R.id.EdtUsername);

        BtnLogin = (Button)findViewById(R.id.BtnLogin);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
