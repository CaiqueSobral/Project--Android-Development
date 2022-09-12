package com.ibm.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    String[] phrases = {"“All our dreams can come true, if we have the courage to pursue them.“",
    "“The secret of getting ahead is getting started.”",
    "“I’ve missed more than 9,000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life, and that is why I succeed.”",
    "“Don’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.”",
    "“The best time to plant a tree was 20 years ago. The second best time is now.”",
    "“Only the paranoid survive.”",
    "“It’s hard to beat a person who never gives up.”",
    "“I wake up every morning and think to myself, ‘How far can I push this company in the next 24 hours.”",
    "“If people are doubting how far you can go, go so far that you can’t hear them anymore.”"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void generatePhrase(View view){
        TextView textPhrases = findViewById(R.id.textPhrase);

        int number = new Random().nextInt(phrases.length);

        textPhrases.setText(phrases[number]);
    }

    public void previous(View view) {
        Intent mainActv = new Intent(this, MainActivity.class);
        startActivity(mainActv);
    }
}