package com.anas.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnNextActivity=findViewById(R.id.btnNextActivity);

        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iM2S=new Intent(MainActivity.this,SecondActivity.class);
                iM2S.putExtra("title","Home");
                iM2S.putExtra("name","anas");
                iM2S.putExtra("number",706099758);
                startActivity(iM2S);
            }
        });
    }
}