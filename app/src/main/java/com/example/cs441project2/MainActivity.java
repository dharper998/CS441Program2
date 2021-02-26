package com.example.cs441project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switch_button = findViewById(R.id.switch_button);
    }

    public void changeActivity(View view){
        EditText name = findViewById(R.id.editTextTextPersonName);
        if(name.getText().toString().isEmpty()) {
            name.setError("Enter a Name");
        }else {
            String nameVal = name.getText().toString();
            DataStorage data = com.example.cs441project2.DataStorage.getInstance();
            data.setName(nameVal);
        }
        Intent second_activity = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(second_activity);
    }
}