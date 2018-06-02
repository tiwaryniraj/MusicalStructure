package com.example.niraj.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        String nameSong = getIntent().getStringExtra("song");
        String nameOther = getIntent().getStringExtra("other");
        TextView textView = findViewById(R.id.name);
        TextView textView2 = findViewById(R.id.name2);
        textView.setText(nameSong);
        textView2.setText(nameOther);
    }
}
