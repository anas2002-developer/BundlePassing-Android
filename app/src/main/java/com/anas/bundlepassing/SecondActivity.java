package com.anas.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtName;
    TextView txtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtName=findViewById(R.id.txtName);
        txtNumber=findViewById(R.id.txtNumber);

        Intent iReceive=getIntent();
        String newtitle=iReceive.getStringExtra("title");
        String newName=iReceive.getStringExtra("name");
        int newNumber=iReceive.getIntExtra("number",0);
//
        getSupportActionBar().setTitle(newtitle);
        txtName.setText("Name "+newName);
        txtNumber.setText("Number "+newNumber);
    }
}