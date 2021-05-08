package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Model.AddServiceModel;
import com.example.shakil.customalertdialog.Model.EmployeeModel;
import com.example.shakil.customalertdialog.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.MyViewHolder> {

    List<EmployeeModel> employeeModelList;
    Context context;

    public EmployeeListAdapter(List<EmployeeModel> employeeModelList, Context context) {
        this.employeeModelList = employeeModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_employee_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imgProfile.setImageResource(employeeModelList.get(position).getEmployeeImage());
        holder.txtName.setText(employeeModelList.get(position).getEmployeeName());
        holder.txtSpecialist.setText(employeeModelList.get(position).getEmployeeSpecialist());
        holder.txtNationality.setText(new StringBuilder().append("Nationality: ").append(employeeModelList.get(position).getEmployeeNationality()).toString());
    }

    @Override
    public int getItemCount() {
        return employeeModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgProfile;
        TextView txtName, txtSpecialist, txtNationality;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            txtName = itemView.findViewById(R.id.txtName);
            txtSpecialist = itemView.findViewById(R.id.txtSpecialist);
            txtNationality = itemView.findViewById(R.id.txtNationality);
        }
    }
}
