package com.example.roomdatabase04092019;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface SinhvienDao {

    @Query("SELECT * FROM Sinhvien")
    Cursor getAllSinhVien();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insertSinhvien(Sinhvien sinhvien);
}
