package com.example.scrolltabapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class MyAdap extends FragmentStatePagerAdapter {

    public MyAdap(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new One();
                break;
            case 1:
                fragment = new Two();
                break;
            case 2:
                fragment = new Three();
                break;
            case 3:
                fragment = new Four();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String tag = null;
        switch (position) {
            case 0:
                tag = "one";
                break;
            case 1:
                tag = "two";
                break;
            case 2:
                tag = "three";
                break;
            case 3:
                tag = "four";
                break;
        }
        return tag;
    }


}
