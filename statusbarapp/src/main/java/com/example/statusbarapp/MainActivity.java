package com.example.statusbarapp;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.statusbarapp.fragment.FragmentA;
import com.example.statusbarapp.fragment.FragmentB;
import com.example.statusbarapp.fragment.FragmentC;
import com.example.statusbarapp.fragment.FragmentD;
import com.example.statusbarapp.fragment.FragmentE;
import com.jaeger.library.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.vp);
        viewPager.setAdapter(new MainAdapter(getSupportFragmentManager()));
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                switch (position){
//                    case 0:
//                    case 1:
//                    case 2:
//                        StatusBarUtil.setColor(MainActivity.this,getResources().getColor(android.R.color.white), 30);
//                        break;
//                    case 3:
//                        StatusBarUtil.setColor(MainActivity.this,getResources().getColor(R.color.colorPrimary), 0);
//                        break;
//                    case 4:
//                        StatusBarUtil.setTransparent(MainActivity.this);
//                        break;
//
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
        viewPager.setCurrentItem(0);
//        StatusBarUtil.setColor(MainActivity.this,getResources().getColor(android.R.color.white), 20);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }
    private class MainAdapter extends FragmentPagerAdapter {

        public MainAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position){
                case 0:
                    fragment = new FragmentA();
                    break;
                case 1:
                    fragment = new FragmentB();
                    break;
                case 2:
                    fragment = new FragmentC();
                    break;
                case 3:
                    fragment = new FragmentD();
                    break;
                case 4:
                    fragment = new FragmentE();
                    break;

            }
            return fragment;

        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
