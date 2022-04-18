package com.ecure.ecuredoctor.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ecure.ecuredoctor.R;
import com.ecure.ecuredoctor.model.Patient;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.ViewHolder> {

    private ArrayList<Patient> patientList;

    public AppointmentAdapter(ArrayList<Patient> patientsList) {
        this.patientList = patientsList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.patient_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final Patient patient = patientList.get(position);
    holder.name.setText(patient.getName());
    holder.age.setText(patient.getAge());
    holder.mobile.setText(patient.getMobile());
    holder.pid.setText(patient.getPid());
    holder.net.setText(patient.getNet());

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        String name = patient.getName();
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "selected:- "+name, Toast.LENGTH_SHORT).show();
        }
    });
    }

    @Override
    public int getItemCount() {
        return patientList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name,pid,age,mobile,net,date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            pid = itemView.findViewById(R.id.pidnumber);
            age = itemView.findViewById(R.id.age);
            mobile = itemView.findViewById(R.id.mobile);
            net = itemView.findViewById(R.id.online);
        }
    }
}
