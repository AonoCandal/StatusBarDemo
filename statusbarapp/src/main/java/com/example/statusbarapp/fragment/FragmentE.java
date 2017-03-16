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

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentE extends Fragment {
    private Toolbar mToolbar;
    private View statusbar;



    public FragmentE() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_e, container, false);
        mToolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        statusbar = rootView.findViewById(R.id.statusbar);
        statusbar.setVisibility(View.VISIBLE);


        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        initView();
    }

    private void initView() {
        mToolbar.setBackgroundColor(getResources().getColor(R.color.white));
        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);

    }
}
