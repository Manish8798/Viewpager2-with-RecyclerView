package com.example.viewpager2withrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 mViewpager;
    MyAdapter myAdapter;
    List<String> strings;
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewpager = findViewById(R.id.viewPagerEx);
        mTabLayout = findViewById(R.id.tabLayoutPromotions);
        strings = new ArrayList<>();

        strings.add("Screen 1");
        strings.add("Screen 2");
        strings.add("Screen 3");
        strings.add("Screen 4");
        strings.add("Screen 5");

        myAdapter = new MyAdapter(this, strings);
        mViewpager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        mViewpager.setAdapter(myAdapter);
        new TabLayoutMediator(mTabLayout, mViewpager, ((tab, position) -> {
        })).attach();

    }
}