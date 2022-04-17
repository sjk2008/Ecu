package com.ecure.ecuredoctor.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ecure.ecuredoctor.R;
import com.ecure.ecuredoctor.adapter.AppointmentAdapter;
import com.ecure.ecuredoctor.databinding.FragmentSlideshowBinding;
import com.ecure.ecuredoctor.model.Patient;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private ArrayList<Patient> patientsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if (patientsList.contains(s)) {

                } else {
                    Toast.makeText(getContext(), "No Match Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        patientsList = new ArrayList<>();
        setPatientInfo();
        setAdapter();
        return root;
    }

    private void setPatientInfo() {
        patientsList.add(new Patient("Radhika k", "Age:- 32", "pid:- 216464646", "8795555750", "Online", ""));
        patientsList.add(new Patient("Ambika", "Age:- 22", "pid:- 6546565", "8746566557", "Offline", ""));
        patientsList.add(new Patient("Shardha", "Age:- 35", "pid:- 6545348", "8795555750", "Offline", ""));
        patientsList.add(new Patient("Shunanda", "Age:- 84", "pid:- 53212121", "8589631478", "Online", ""));
        patientsList.add(new Patient("Suraj", "Age:- 20", "pid:- 1024785963", "8697522147", "Offline", ""));
        patientsList.add(new Patient("Kulkarrni k", "Age:- 55", "pid:- 1023456789", "8795555750", "Online", ""));


    }

    private void setAdapter() {
        AppointmentAdapter appointmentAdapter = new AppointmentAdapter(patientsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.patientRV.setLayoutManager(layoutManager);
        binding.patientRV.setItemAnimator(new DefaultItemAnimator());
        binding.patientRV.setAdapter(appointmentAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}