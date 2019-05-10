
package com.example.travelguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {


    private TabLayout tl;
    private ViewPager vp;

    private FragmentAdapter adapter;
    private List<Fragment> fragments;
    private List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl = (TabLayout) findViewById(R.id.tl);
        vp = (ViewPager) findViewById(R.id.vp);

        //添加Fragment
        fragments = new ArrayList<>();
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());
        fragments.add(new FragmentOne());

        //添加Tab文字
        strings = new ArrayList<>();
        strings.add("行人");
        strings.add("公交");
        strings.add("汽车");
        strings.add("骑车");
        strings.add("飞机");
        strings.add("火车");

        //添加Tab
        for (String str : strings) {
            tl.addTab(tl.newTab().setText(str));
        }

        //绑定ViewPager
        adapter = new FragmentAdapter(getSupportFragmentManager(), fragments, strings);
        vp.setAdapter(adapter);
        tl.setupWithViewPager(vp);
    }



}
