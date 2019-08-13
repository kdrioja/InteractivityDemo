package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        //findViewById returns a View so we need to cast it to an EditText object
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("Info", "It worked!!!");
        Log.i("Values", nameEditText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
