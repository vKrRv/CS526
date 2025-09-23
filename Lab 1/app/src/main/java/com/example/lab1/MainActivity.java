package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.text2);
        button1.setOnClickListener(v -> {
            textView.setText("Button clicked!");
            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.VISIBLE);
        });

    }
    public void buttonHandler(View view) {
        TextView textView = findViewById(R.id.text2);
        textView.setText("Testing Android studio");
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button2.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
    }

}