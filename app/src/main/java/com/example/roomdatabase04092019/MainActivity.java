package com.example.roomdatabase04092019;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSinhvien;
    SinhvienAdapter sinhvienAdapter;
    ArrayList<Sinhvien> sinhvienArrayList;
    int Request_Code_Insert = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSinhvien = findViewById(R.id.recycleSinhvien);

        sinhvienArrayList = Sinhvien.mockSinhvien();
        sinhvienAdapter = new SinhvienAdapter(sinhvienArrayList);
        rvSinhvien.setLayoutManager(new LinearLayoutManager(this));
        rvSinhvien.setHasFixedSize(true);
        rvSinhvien.setAdapter(sinhvienAdapter);
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
                startActivityForResult(intent,Request_Code_Insert);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
