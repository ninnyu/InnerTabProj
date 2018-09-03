package com.example.potatopaloozac.innertabproj;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTopTwo extends Fragment {
    PagerBottom pagerBottom;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.top_two, container, false);

        tabLayout = v.findViewById(R.id.topTab2Layout);
        viewPager = v.findViewById(R.id.topTab2Pager);
        pagerBottom = new PagerBottom(getChildFragmentManager(),2);

        viewPager.setAdapter(pagerBottom);

        tabLayout.setupWithViewPager(viewPager);

        return v;
    }
}
