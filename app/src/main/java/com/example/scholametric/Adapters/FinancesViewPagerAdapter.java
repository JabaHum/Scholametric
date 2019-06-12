package com.example.scholametric.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.scholametric.Fragments.FeesStructureFragment;
import com.example.scholametric.Fragments.PaymentMethodsFragment;
import com.example.scholametric.Fragments.StaffSalariesFragment;
import com.example.scholametric.R;

public class FinancesViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public FinancesViewPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int i) {
        if(i==1){
            return new FeesStructureFragment();
        }else if(i==2){
            return  new PaymentMethodsFragment();
        }else
        return new StaffSalariesFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.fees_structure);
            case 1:
                return mContext.getString(R.string.payment_methods);
            case 2:
                return mContext.getString(R.string.staff_salaries);
                default:
                    return null;
        }
    }
}
