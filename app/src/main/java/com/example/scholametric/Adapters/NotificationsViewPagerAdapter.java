package com.example.scholametric.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.scholametric.Fragments.EmailFragment;
import com.example.scholametric.Fragments.SmsFragment;
import com.example.scholametric.R;

public class NotificationsViewPagerAdapter extends FinancesViewPagerAdapter {
    private Context mContext;
    public NotificationsViewPagerAdapter(Context context, FragmentManager fm) {
        super(context, fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i==1){
            return  new SmsFragment();
        }else{
            return new EmailFragment();
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
                return mContext.getString(R.string.sms_notification);
            case 1:
                return mContext.getString(R.string.email_notification);
            default:
                return null;
        }
    }
}
