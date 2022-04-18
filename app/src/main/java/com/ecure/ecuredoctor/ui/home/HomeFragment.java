package com.ecure.ecuredoctor.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ecure.ecuredoctor.adapter.RecyclerAdapter;
import com.ecure.ecuredoctor.databinding.FragmentHomeBinding;
import com.ecure.ecuredoctor.model.User;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ArrayList<User> usersList;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        usersList = new ArrayList<>();


        setUserInfo();
        setAdapter();
        return root;
    }

    private void setAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(usersList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.recView.setLayoutManager(layoutManager);
        binding.recView.setItemAnimator(new DefaultItemAnimator());
        binding.recView.setAdapter(adapter);
    }

    private void setUserInfo() {
        usersList.add(new User("Vital"));
        usersList.add(new User("System Examination"));
        usersList.add(new User("Complaints"));
        usersList.add(new User("Diagnosis"));
        usersList.add(new User("Test Requested"));
        usersList.add(new User("Advice"));
        usersList.add(new User("Other Instruction"));
        usersList.add(new User("Support Us"));
        usersList.add(new User("Follow up Visit"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}