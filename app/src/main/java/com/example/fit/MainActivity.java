package com.example.fit;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        running();
    }

    // 実処理
    protected void running() {
        setContentView(R.layout.activity_main);


    }
}
