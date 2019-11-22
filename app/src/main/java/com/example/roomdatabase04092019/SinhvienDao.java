package com.example.roomdatabase04092019;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.ArrayList;

@Dao
public interface SinhvienDao {

    @Query("SELECT * FROM Sinhvien")
    Cursor getAllSinhVien();
}
