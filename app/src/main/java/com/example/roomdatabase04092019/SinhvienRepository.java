package com.example.roomdatabase04092019;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class SinhvienRepository {

    private static SinhvienRepository instance = null;
    private SinhvienDao sinhvienDao;

    private SinhvienRepository(Context context){
        SinhvienDatabase sinhvienDatabase = SinhvienDatabase.getInstance(context);
        sinhvienDao = sinhvienDatabase.sinhvienDao();
    }

    public static SinhvienRepository getInstance(Context context){
        if (instance == null){
            instance = new SinhvienRepository(context);
        }
        return instance;
    }

    public Cursor getAllSinhVien(){
        return sinhvienDao.getAllSinhVien();
    }

    public long insertSinhvien(Sinhvien sinhvien){
        return sinhvienDao.insertData(sinhvien);
    }
}
