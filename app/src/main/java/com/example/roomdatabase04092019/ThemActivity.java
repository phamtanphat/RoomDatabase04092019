package com.example.roomdatabase04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThemActivity extends AppCompatActivity {

    EditText edtName,edtAge,edtAddress;
    Button btnCancel,btnInsert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them);

        edtAddress = findViewById(R.id.edittextAddress);
        edtName = findViewById(R.id.edittextName);
        edtAge = findViewById(R.id.edittextAge);
        btnCancel = findViewById(R.id.buttonCancel);
        btnInsert = findViewById(R.id.buttonInsert);


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                setResult(RESULT_CANCELED,intent);
                finish();
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String age = edtName.getText().toString();
                String address = edtName.getText().toString();

                if (!name.isEmpty() && !age.isEmpty() && !address.isEmpty()){
                    if (name.matches("^[A-Za-z]+$")){

                    }else{
                        Toast.makeText(ThemActivity.this, "Sai định dạng", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(ThemActivity.this, getResources().getString(R.string.label_alert_edit_null), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
