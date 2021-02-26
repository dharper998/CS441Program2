package com.example.cs441project2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button switch_button = findViewById(R.id.switch_button);
        TextView adventureResult = findViewById(R.id.AdventureResult);
        adventureResult.setVisibility(View.INVISIBLE);
    }

    public void adventure(View view){
        DataStorage data = DataStorage.getInstance();
        ProgressBar bar = findViewById(R.id.progressBar);
        TextView level = findViewById(R.id.level);
        TextView adventureResult = findViewById(R.id.AdventureResult);
        Random random = new Random();
        int randStrength = random.nextInt(90 + (data.getStrength() * 10));
        if(randStrength > 50){
            int randLuck = random.nextInt(99 + data.getLuck() * 1);
            if(randLuck > 99){
                bar.setProgress(bar.getMax());
                adventureResult.setText("You made an amazing discovery thanks to your luck, which gained you a whole level!");
                adventureResult.setVisibility(View.VISIBLE);
            } else {
                adventureResult.setText("Your adventure was successful thanks to your strength and skill");
                adventureResult.setVisibility(View.VISIBLE);
                bar.incrementProgressBy(data.getSkill());
            }
        } else {
            adventureResult.setText("You were not strong enough to continue, your adventure failed");
            adventureResult.setVisibility(View.VISIBLE);
        }
        if(bar.getProgress() == bar.getMax()){
            bar.setMax(bar.getMax() * 2);
            bar.setProgress(0);
            data.incrementLevel();
            data.incrementSkillPoints();
            int lvl = data.getLevel();
            level.setText("Level: " + lvl);
        }
    }

    public void menuActivity(View view){
        Intent third_activity = new Intent(getApplicationContext(), ThirdActivity.class);
        startActivity(third_activity);
    }
}