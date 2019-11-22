package com.example.roomdatabase04092019;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//(tableName = "Sinhvien")
@Entity
public class Sinhvien {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;

    public int age;

    public String address;

}
