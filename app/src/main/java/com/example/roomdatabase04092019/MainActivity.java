package com.example.roomdatabase04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SinhvienRepository sinhvienRepository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sinhvienRepository = SinhvienRepository.getInstance(this);
        // 1 : Enitity
        // 2 : Dao
        // 3 : Database

//        Cursor cursor = sinhvienRepository.getAllSinhVien();
//        Log.d("BBB",cursor.getCount() + "");

        sinhvienRepository.insertSinhvien("Nguyễn Văn A" , 1990 , "Quận 1");

    }
}
