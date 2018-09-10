package com.example.potatopaloozac.innertabproj;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.potatopaloozac.innertabproj.Adapters.PagerTop;

/**
 * Dragos Review
 *  - code looks good
 *  - group fragments in packages for easier read of app structure
 *  - maybe rethink variables naming (instead of bottom and top just tabs and sub-tabs)
 */

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPagerTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPagerTop = findViewById(R.id.pager);

        setSupportActionBar(toolbar);

        PagerTop pagerTop = new PagerTop(getSupportFragmentManager());
        viewPagerTop.setAdapter(pagerTop);
        tabLayout.setupWithViewPager(viewPagerTop);
    }
}
