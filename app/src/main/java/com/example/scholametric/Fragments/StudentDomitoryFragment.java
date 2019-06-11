package com.example.scholametric.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.scholametric.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentDomitoryFragment extends Fragment {


    public StudentDomitoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_staff_catergory, container, false);
        return v;
    }

}
