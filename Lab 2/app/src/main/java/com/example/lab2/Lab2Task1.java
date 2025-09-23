package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab2Task1 extends AppCompatActivity {

    private int count = 0;
    private TextView btnCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab2_task1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void increaseCount(View view){
        btnCount = findViewById(R.id.btnCount);
        btnCount.setText(String.valueOf(++count));
    }
    public void resetCount(View view){
        btnCount = findViewById(R.id.btnCount);
        count = 0;
        btnCount.setText(String.valueOf(count));
    }
    public void getToast(View view){
        Toast.makeText(this, "Keep going!", Toast.LENGTH_SHORT).show();
    }
}