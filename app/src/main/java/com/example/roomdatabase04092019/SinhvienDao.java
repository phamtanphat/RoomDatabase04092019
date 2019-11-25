package com.example.roomdatabase04092019;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface SinhvienDao {

    @Query("SELECT * FROM Sinhvien")
    Cursor getAllSinhVien();

//    @Query("INSERT INTO Sinhvien VALUES (null,:name,:age,:address)")
//    void insertData(String name , int age , String address);

    @Insert(entity = Sinhvien.class)
    Long insertData(Sinhvien sinhvien);
}
