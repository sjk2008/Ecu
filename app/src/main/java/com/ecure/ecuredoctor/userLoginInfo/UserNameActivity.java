package com.ecure.ecuredoctor.userLoginInfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ecure.ecuredoctor.MainActivity;
import com.ecure.ecuredoctor.databinding.ActivityUserNameBinding;

public class UserNameActivity extends AppCompatActivity {

    private ActivityUserNameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.userNameEDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.userNameEDT.getText().toString();
                Intent intent =  new Intent(UserNameActivity.this,UserNameActivity.this.getClass());
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        binding.submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.nameLL.setVisibility(View.GONE);
                binding.passwrodLL.setVisibility(View.VISIBLE);
            }
        });

        binding.submitPassBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText password = binding.passwordEDT;
                Intent intent = new Intent(UserNameActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        binding.forgetTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.nameLL.setVisibility(View.GONE);
                binding.passwrodLL.setVisibility(View.GONE);
                binding.recoveryLL.setVisibility(View.VISIBLE);

            }
        });

        binding.recBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.nameLL.setVisibility(View.GONE);
                binding.passwrodLL.setVisibility(View.GONE);
                binding.recoveryLL.setVisibility(View.GONE);
                binding.passwrodOTPLL.setVisibility(View.VISIBLE);


            }
        });
        binding.submitPassOTPBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserNameActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}