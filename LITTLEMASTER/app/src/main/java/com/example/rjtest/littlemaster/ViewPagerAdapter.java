package com.example.rjtest.littlemaster;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by RITESH on 12/12/2016.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> frag = new ArrayList<>();
    ArrayList<String> TabTitles = new ArrayList<>();


    public void addFragment(Fragment fragments,String titles){

        this.frag.add(fragments);
        this.TabTitles.add(titles);
    }


    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return frag.get(position);
    }

    @Override
    public int getCount() {
        return frag.size();
    }
    public CharSequence getPageTitles(int position){
        return TabTitles.get(position);
    }
}
