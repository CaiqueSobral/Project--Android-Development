package com.ibm.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void generatePhrase(View view){
        TextView textPhrases = findViewById(R.id.textPhrase);
    }

    public void previous(View view) {
        Intent mainActv = new Intent(this, MainActivity.class);
        startActivity(mainActv);
    }
}