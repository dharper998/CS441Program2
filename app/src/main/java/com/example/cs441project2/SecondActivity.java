package com.example.cs441project2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button switch_button = findViewById(R.id.switch_button);
    }

    public void changeActivity(View view){
        Intent main_activity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(main_activity);
    }
}