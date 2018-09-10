package com.example.potatopaloozac.innertabproj.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.potatopaloozac.innertabproj.tabLayoutFragments.FragmentBottomOne;
import com.example.potatopaloozac.innertabproj.tabLayoutFragments.FragmentBottomTwo;

public class PagerBottom extends FragmentPagerAdapter {

    public PagerBottom(FragmentManager fm, int tabCount) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentBottomOne bottomOne = new FragmentBottomOne();
                return bottomOne;
            case 1:
                FragmentBottomTwo bottomTwo = new FragmentBottomTwo();
                return bottomTwo;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Bottom Tab 1";
            case 1:
                return "Bottom Tab 2";
            default:
                return null;
        }
    }
}
