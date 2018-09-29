package com.lzy.pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.skyseraph.xknife.R;

public class IndexActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

    }

    protected void initView() {
        RadioGroup bottomContainer = (RadioGroup) findViewById(R.id.rg_activity_main_bottom_container);

        bottomContainer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_activity_main_bottom_index) {
                } else if (checkedId == R.id.rb_activity_main_bottom_center) {
                } else if (checkedId == R.id.rb_activity_main_bottom_person) {
                } else if (checkedId == R.id.rb_activity_main_bottom_chat) {
                }
            }
        });
    }
    @Override
    public void onClick(View v) {
    }
}
