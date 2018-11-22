package com.example.rajshekhar.tabs;

import android.content.Context;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.example.rajshekhar.tabs.fragment.HomeFragment;
import com.example.rajshekhar.tabs.fragment.MusicFragment;
import com.example.rajshekhar.tabs.fragment.SportFragment;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {


    private Context mContext;
    int totalTabs;


    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        mContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    @Override
    public Fragment getItem(int postion) {
        switch (postion) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;

            case 1:
                SportFragment sportFragment = new SportFragment();
                return sportFragment;

            case 2:
                MusicFragment musicFragment = new MusicFragment();
                return musicFragment;


        }
        return null;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }

}