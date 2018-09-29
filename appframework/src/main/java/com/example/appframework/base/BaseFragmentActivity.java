package com.example.appframework.base;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by lzy on 2018/9/29.
 */

public abstract class BaseFragmentActivity extends AppCompatActivity implements IBaseCallback {
    protected FragmentManager fm = getFragmentManager();

    public void showFragment(Class<Fragment> fragment) {

    }

    protected void hideAllFragments()
    {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            List<Fragment> list = fm.getFragments();
        }

    }

}
