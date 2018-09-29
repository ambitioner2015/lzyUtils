package com.lzy.pro;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.RadioGroup;

import com.example.appframework.base.BaseActivity;
import com.example.learn.LearnFragment;
import com.example.news.NewsFragment;
import com.example.video.VideoFragment;
import com.skyseraph.xknife.R;

import java.util.List;

public class IndexActivity extends BaseActivity implements View.OnClickListener {

    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    NewsFragment newsFragment;
    LearnFragment learnFragment;
    VideoFragment videoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_index);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_index;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {
        RadioGroup bottomContainer = (RadioGroup) findViewById(R.id.rg_activity_main_bottom_container);

        bottomContainer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                hideFragments();
                if (checkedId == R.id.rb_activity_main_bottom_index) {
                    if (newsFragment == null) {
                        newsFragment = new NewsFragment();

                        ft.add(R.id.fl_activity_main_container, newsFragment, newsFragment.getClass().getName());
                    } else {
                        ft.show(newsFragment);
                    }
                } else if (checkedId == R.id.rb_activity_main_bottom_center) {
                    if (learnFragment == null) {
                        learnFragment = new LearnFragment();

                        ft.add(R.id.fl_activity_main_container, learnFragment, learnFragment.getClass().getName());
                    } else {
                        ft.show(learnFragment);
                    }
                } else if (checkedId == R.id.rb_activity_main_bottom_person) {
                    if (videoFragment == null) {
                        videoFragment = new VideoFragment();

                        ft.add(R.id.fl_activity_main_container, videoFragment, videoFragment.getClass().getName());
                    } else {
                        ft.show(videoFragment);
                    }
                } else if (checkedId == R.id.rb_activity_main_bottom_chat) {
                }
                ft.commitAllowingStateLoss();
            }
        });
    }

    public void hideFragments() {
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();

        List<Fragment> list = fm.getFragments();
        for (Fragment f : list
                ) {
            ft.hide(f);
        }
        ft.commitAllowingStateLoss();
    }


    @Override
    public void onClick(View v) {
    }
}
