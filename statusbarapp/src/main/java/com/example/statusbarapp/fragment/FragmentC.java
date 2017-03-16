package com.example.statusbarapp.fragment;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.statusbarapp.R;
import com.example.statusbarapp.utils.DensityUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentC extends Fragment {
    private Toolbar mToolbar;


    public FragmentC() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_c, container, false);
        mToolbar = (Toolbar) rootView.findViewById(R.id.toolbar);

        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        initView();
    }

    private void initView() {
        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);
    }
}
