package com.example.rjtest.littlemaster;

import android.support.design.widget.TabLayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.concurrent.RunnableFuture;


public class MainActivity extends AppCompatActivity {
  Toolbar toolbar;
    TabLayout tabout;
    ViewPager viewPager;
  ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new AtoZFragment(),"AtoZ");
        viewPager.setAdapter(viewPagerAdapter);
        //tabout.setupWithViewPager(viewPager);
        tabout.post(new Runnable() {
            @Override
            public void run() {
                tabout.setupWithViewPager(viewPager);
            }
        });
    }

}
