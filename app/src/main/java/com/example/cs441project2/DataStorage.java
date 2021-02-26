package com.example.cs441project2;

public class DataStorage {
    String name;
    int level = 1;
    int skillPoints = 0;
    int strength = 1;
    int skill = 1;
    int luck = 1;
    private static final DataStorage data = new DataStorage();
    private DataStorage(){};
    public static DataStorage getInstance() {
        return data;
    }

    public void setName(String nameVal){
        this.name = nameVal;
    }

    public String getName(){
        return this.name;
    }

    public void incrementLevel(){
        this.level++;
    }

    public int getLevel(){
        return this.level;
    }

    public void incrementSkillPoints(){
        this.skillPoints++;
    }

    public void decrementSkillPoints() {
        this.skillPoints--;
    }

    public int getSkillPoints(){
        return this.skillPoints;
    }

    public void incrementStrength(){
        this.strength++;
    }

    public int getStrength(){
        return this.strength;
    }

    public void incrementSkill(){
        this.skill++;
    }

    public int getSkill() {
        return skill;
    }

    public void incrementLuck(){
        this.luck++;
    }

    public int getLuck() {
        return luck;
    }

}
