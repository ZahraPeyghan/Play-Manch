package com.example.playmanch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {

    TextView random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        random=findViewById(R.id.RandomText);
        random.setText(String.valueOf(new Random().nextInt(6-1+1)+1));
    }
}
