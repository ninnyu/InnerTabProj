package com.example.potatopaloozac.innertabproj.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.potatopaloozac.innertabproj.tabLayoutFragments.FragmentTopOne;
import com.example.potatopaloozac.innertabproj.tabLayoutFragments.FragmentTopTwo;

public class PagerTop extends FragmentPagerAdapter {

    public PagerTop(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentTopOne topOne= new FragmentTopOne();
                return topOne;
            case 1:
                FragmentTopTwo topTwo = new FragmentTopTwo();
                return topTwo;
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
                return "Top Tab 1";
            case 1:
                return "Top Tab 2";
            default:
                return null;
        }
    }
}
