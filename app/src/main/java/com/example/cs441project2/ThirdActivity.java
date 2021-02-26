package com.example.cs441project2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView name = findViewById(R.id.name);
        TextView level = findViewById(R.id.levelDisplay);
        TextView skillPoints = findViewById(R.id.SkillPoints);
        DataStorage data = DataStorage.getInstance();
        name.setText(data.getName());
        level.setText("Level: " + Integer.toString(data.getLevel()));
        skillPoints.setText("Skill Points: " + Integer.toString(data.getSkillPoints()));
        RadioButton strength = findViewById(R.id.Strength);
        RadioButton skill = findViewById(R.id.Skill);
        RadioButton luck = findViewById(R.id.Luck);
        strength.setText("Strength: " + Integer.toString(data.getStrength()));
        skill.setText("Skill: " + Integer.toString(data.getSkill()));
        luck.setText("Luck: " + Integer.toString(data.getLuck()));
    }

    public void levelUp(View view){
        DataStorage data = DataStorage.getInstance();
        if(data.getSkillPoints() == 0){
            return;
        }
        RadioGroup group = findViewById(R.id.radioGroup);
        int id = group.getCheckedRadioButtonId();
        RadioButton skill = findViewById(id);
        String skillType = (String) skill.getText();
        if(skillType.contains("Strength")){
            data.incrementStrength();
            skill.setText("Strength: " + Integer.toString(data.getStrength()));
        } else if(skillType.contains("Skill")){
            data.incrementSkill();
            skill.setText("Skill: " + Integer.toString(data.getSkill()));
        } else {
            data.incrementLuck();
            skill.setText("Luck: " + Integer.toString(data.getLuck()));
        }
        data.decrementSkillPoints();
        TextView skillPoints = findViewById(R.id.SkillPoints);
        skillPoints.setText("Skill Points: " + Integer.toString(data.getSkillPoints()));
    }

    public void closeMenuActivity(View view){
        finish();
    }
}