package com.example.roomdatabase04092019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SinhvienAdapter extends RecyclerView.Adapter<SinhvienAdapter.SinhvienHolder>{

    ArrayList<Sinhvien> sinhviens;

    public SinhvienAdapter(ArrayList<Sinhvien> sinhviens) {
        this.sinhviens = sinhviens;
    }

    @NonNull
    @Override
    public SinhvienHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater  = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_sinhvien, parent, false);
        return new SinhvienHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SinhvienHolder holder, int position) {
        Sinhvien sinhvien = sinhviens.get(position);
        holder.txtName.setText("Tên : " +sinhvien.getName());
        holder.txtAge.setText("Năm sinh : " +sinhvien.getAge());
        holder.txtAddress.setText("Địa chỉ : " +sinhvien.getAddress());
    }

    @Override
    public int getItemCount() {
        return sinhviens != null ? sinhviens.size() : 0;
    }

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
