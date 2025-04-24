package com.example.counterapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textResult;
    private Button buttonIncrement, buttonDecrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.text_result);
        buttonIncrement = findViewById(R.id.button_increment);
        buttonDecrement = findViewById(R.id.button_decrement);

        buttonIncrement.setOnClickListener(v -> {
            count++;
            textResult.setText(String.valueOf(count));
        });

        buttonDecrement.setOnClickListener(v -> {
            count--;
            textResult.setText(String.valueOf(count));
        });
    }
}
