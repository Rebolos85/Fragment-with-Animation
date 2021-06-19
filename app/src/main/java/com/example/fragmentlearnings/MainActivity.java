package com.example.fragmentlearnings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.view_pager);

        MainActivityAdapter mainActivityAdapter = new MainActivityAdapter(getSupportFragmentManager());
        mainActivityAdapter.addFragment(new FirstFragment());
        mainActivityAdapter.addFragment(new SecondFragment());
        mainActivityAdapter.addFragment(new ThirdFragment());

        pager.setAdapter(mainActivityAdapter);
        pager.setPageTransformer(true, new ZoomPageAdapter());


    }
}