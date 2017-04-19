package com.waqaansari.fragmentstest;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        Fragment fragment = new Fragment1();
        Bundle bundle = new Bundle();
        bundle.putString("message", "For Fragment1 from Activity");
        fragment.setArguments(bundle);
        adapter.addFragment(fragment, "Tab1");

        fragment = new Fragment2();
        bundle = new Bundle();
        bundle.putString("message", "For Fragment2 from Activity");
        fragment.setArguments(bundle);
        adapter.addFragment(fragment, "Tab2");

        fragment = new Fragment3();
        bundle = new Bundle();
        bundle.putString("message", "For Fragment3 from Activity");
        fragment.setArguments(bundle);
        adapter.addFragment(fragment, "Tab3");

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);

    }
}
