package com.example.roomdatabase04092019;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

//(tableName = "Sinhvien")
@Entity
public class Sinhvien {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String name;

    private int age;

    private String address;

    public Sinhvien(Integer id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Ignore
    public Sinhvien() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static ArrayList<Sinhvien> mockSinhvien(){
        int cout = 1;
        ArrayList<Sinhvien> sinhviens = new ArrayList<>();
        while (cout <= 10){
            sinhviens.add(new Sinhvien(cout,"Nguyen van A", 20 ,"Quan 1"));
            cout++;
        }
        return sinhviens;
    }
}
