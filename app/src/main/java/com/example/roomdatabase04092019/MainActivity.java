package com.example.roomdatabase04092019;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSinhvien;
    SinhvienAdapter sinhvienAdapter;
    ArrayList<Sinhvien> sinhvienArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSinhvien = findViewById(R.id.recycleSinhvien);

        sinhvienArrayList = new ArrayList<>();
        sinhvienAdapter = new SinhvienAdapter(sinhvienArrayList);
        rvSinhvien.setLayoutManager(new LinearLayoutManager(this));
        rvSinhvien.setHasFixedSize(true);
        rvSinhvien.setAdapter(sinhvienAdapter);
        getAllSinhvien();
    }

    private void getAllSinhvien() {
        sinhvienArrayList.clear();
        Cursor cursor = SinhvienRepository.getInstance(this).getAllSinhVien();
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            Integer age = cursor.getInt(2);
            String address = cursor.getString(3);
            sinhvienArrayList.add(new Sinhvien(id ,name,age,address));
        }
        sinhvienAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_menu_insert :
                Intent intent = new Intent(MainActivity.this,ThemActivity.class);
                startActivityForResult(intent,Appconstant.Request_Code_Insert);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == Appconstant.Request_Code_Insert && resultCode == RESULT_OK){
            getAllSinhvien();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
