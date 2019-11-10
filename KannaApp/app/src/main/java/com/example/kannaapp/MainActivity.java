package com.example.kannaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        // Initialize resource
        ImageView kanna = findViewById(R.id.kanna_chan);
        ImageView platelet = findViewById(R.id.platelet);
        kanna.animate().alpha(0f).setDuration(2000);
        platelet.animate().alpha(1f).setDuration(2000);
    }
}
