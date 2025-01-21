package com.example.widgetverticallinearlayout_reuben;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            // Berpindah ke SecondActivity
            Intent intent = new Intent(MainActivity.this, Dashboard.class);
            startActivity(intent);
        });
    }
}
