package com.example.scholametric.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.scholametric.Fragments.ALevelFragment;
import com.example.scholametric.Fragments.OLevelFragment;
import com.example.scholametric.R;

public class SubjectsViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public SubjectsViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i==1){
            return  new OLevelFragment();
        }else{
            return new ALevelFragment();
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
                return mContext.getString(R.string.olevel_subjects);
            case 1:
                return mContext.getString(R.string.alevel_subjects);
                default:
                    return null;
        }
    }
}
