package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView myName;
EditText editName;
TextView myContact;
TextView myEmail;
TextView helloWorld;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = (TextView) findViewById(R.id.myName);
        editName = (EditText) findViewById(R.id.editName);
        myContact = (TextView) findViewById(R.id.myContact);
        myEmail = (TextView) findViewById(R.id.myEmail);
        helloWorld = (TextView) findViewById(R.id.helloWorld);
        button = (Button) findViewById(R.id.button);

        //Hello.setText("Hello Isa!");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        String myValue = editName.getText().toString();
                        helloWorld.setText("HELLO " + myValue + "!");
            }
        });
    }
}