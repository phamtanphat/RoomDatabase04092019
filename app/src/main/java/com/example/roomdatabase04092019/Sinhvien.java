package com.example.roomdatabase04092019;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//(tableName = "Sinhvien")
@Entity
public class Sinhvien {

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    public String name;

    public int age;

    public String address;

    public Sinhvien(Integer id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Sinhvien() {
    }
}
