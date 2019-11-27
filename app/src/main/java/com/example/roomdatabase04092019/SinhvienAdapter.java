package com.example.roomdatabase04092019;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SinhvienAdapter {


    class SinhvienHolder extends RecyclerView.ViewHolder{
        TextView txtName,txtAge,txtAddress;
        public SinhvienHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.textviewName);
            txtAge = itemView.findViewById(R.id.textviewAge);
            txtAddress = itemView.findViewById(R.id.textviewAddress);
        }
    }
}
