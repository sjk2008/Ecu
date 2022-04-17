package com.ecure.ecuredoctor.ui.gallery;

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

import com.ecure.ecuredoctor.adapter.DetailAdapter;
import com.ecure.ecuredoctor.adapter.RecyclerAdapter;
import com.ecure.ecuredoctor.databinding.FragmentGalleryBinding;
import com.ecure.ecuredoctor.model.Details;
import com.ecure.ecuredoctor.model.User;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private ArrayList<Details> details;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        details = new ArrayList<>();
        setUserDetails();
        setAdapterDetails();
        return root;
    }

    private void setUserDetails() {
        details.add(new Details("All Prescriptions","5"));
        details.add(new Details("Medical Records","8"));
    }

    private void setAdapterDetails() {
        DetailAdapter adapter = new DetailAdapter(details);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.detailsRV.setLayoutManager(layoutManager);
        binding.detailsRV.setItemAnimator(new DefaultItemAnimator());
        binding.detailsRV.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}