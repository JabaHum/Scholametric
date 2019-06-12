package com.example.scholametric.Adapters;

        import android.content.Context;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

        import com.example.scholametric.Fragments.ExamsSettingsFragment;
        import com.example.scholametric.Fragments.GradesAlevelFragment;
        import com.example.scholametric.Fragments.GradesOlevelFragment;
        import com.example.scholametric.R;

public class ExamViewPagerAdapter  extends FragmentPagerAdapter {
    private Context mcontext;
    public ExamViewPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mcontext=context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i==0){
            return new ExamsSettingsFragment();
        }else if (i==1){
            return new GradesOlevelFragment();
        }else {
            return new GradesAlevelFragment();
        }
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
                return mcontext.getString(R.string.exam_settings);
            case 1:
                return mcontext.getString(R.string.grades_olevel_settings);
            case 2:
                return mcontext.getString(R.string.grades_olevel_settings);
            default:
                return null;
        }
    }
}
