package com.tofirst.chengrentang.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tofirst.chengrentang.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initData();
        initView();
        initEventListener();
    }

    public abstract void initData();

    public abstract void initView();

    public abstract void initEventListener();

}
