package com.ecure.ecuredoctor.splashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.ecure.ecuredoctor.MainActivity;
import com.ecure.ecuredoctor.databinding.ActivityMainBinding;
import com.ecure.ecuredoctor.databinding.ActivitySplashScreenBinding;
import com.ecure.ecuredoctor.userLoginInfo.UserNameActivity;

public class SplashScreenActivity extends AppCompatActivity {
    private ActivitySplashScreenBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash_screen);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, UserNameActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}