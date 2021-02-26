package com.example.cs441project2;

public class DataStorage {
    String name;
    private static final DataStorage data = new DataStorage();
    private DataStorage(){};
    public static DataStorage getInstance() {
        return data;
    }

    public void setName(String nameVal){
        this.name = nameVal;
    }
}
