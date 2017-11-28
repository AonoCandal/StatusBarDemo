package com.example.aono.statusbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.aono.statusbardemo.activitys.APageActivity;
import com.example.aono.statusbardemo.activitys.BPageActivity;
import com.example.aono.statusbardemo.activitys.CPageActivity;
import com.example.aono.statusbardemo.activitys.DPageActivity;
import com.example.aono.statusbardemo.activitys.EPageActivity;
import com.example.aono.statusbardemo.activitys.FPageActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void page1(View view){
        startActivity(new Intent(this, APageActivity.class));
    }
    public void page2(View view){
        startActivity(new Intent(this, BPageActivity.class));
    }
    public void page3(View view){
        startActivity(new Intent(this, CPageActivity.class));
    }
    public void page4(View view){
        startActivity(new Intent(this, DPageActivity.class));
    }
    public void page5(View view){
        startActivity(new Intent(this, EPageActivity.class));
    }
    public void page6(View view){
        startActivity(new Intent(this, FPageActivity.class));
    }

}
