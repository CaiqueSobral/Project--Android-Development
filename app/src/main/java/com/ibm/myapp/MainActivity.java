package com.ibm.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view) {
        TextView textResult = findViewById(R.id.textResult);

        int number = new Random().nextInt(11);

        textResult.setText("Your number: " + number);
    }

    public void nextApp(View view) {
        Intent mainActv2 = new Intent(this, MainActivity2.class);
        startActivity(mainActv2);
    }
}