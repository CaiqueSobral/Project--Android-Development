package com.ibm.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void converter(View view) {
        EditText editDolar = findViewById(R.id.textMoneyInput);
        TextView textResultado = findViewById(R.id.textConverted);

        Double dolarValue = Double.parseDouble(editDolar.getText().toString());
        String convertedValue = String.format("%.2f", dolarValue * 5.19).replace(".", ",");

        textResultado.setText("Converted R$: " + convertedValue);
    }

    public void previous(View view) {
        Intent mainActv = new Intent(this, MainActivity2.class);
        startActivity(mainActv);
    }
}