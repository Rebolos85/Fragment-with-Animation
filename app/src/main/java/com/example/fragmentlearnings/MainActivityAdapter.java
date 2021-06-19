package com.example.fragmentlearnings;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MainActivityAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragmentList = new ArrayList<>();

    public MainActivityAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addFragment(Fragment addedFragment) {
        fragmentList.add(addedFragment);
    }
}
