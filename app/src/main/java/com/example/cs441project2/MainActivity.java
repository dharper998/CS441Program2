package com.example.cs441project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switch_button = findViewById(R.id.switch_button);
    }

    public void changeActivity(View view){
        Intent second_activity = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(second_activity);
    }
}