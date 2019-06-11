package com.example.scholametric.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.scholametric.Fragments.ClassSettingsFragment;
import com.example.scholametric.Fragments.ContactFragment;
import com.example.scholametric.Fragments.StaffCatergoryFragment;
import com.example.scholametric.Fragments.StudentCatergoryFragment;
import com.example.scholametric.R;

public class ViewPagerAdaper  extends FragmentPagerAdapter {
    private Context mContext;
    public ViewPagerAdaper(Context context, FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i==0){
            return new ContactFragment();
        }else if (i==1){
            return new StudentCatergoryFragment();
        }else if(i==2){
            return new StaffCatergoryFragment();
        }else if (i==3){
            return new ClassSettingsFragment();
        }else{
            return new StudentCatergoryFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.contact);
            case 1:
                return mContext.getString(R.string.student_catergory);
            case 2:
                return mContext.getString(R.string.staff_catergory);
            case 3:
                return mContext.getString(R.string.class_settings);
            case 4:
                return mContext.getString(R.string.student_dormitory);
                default:
                    return null;
        }
    }
}
