package com.tofirst.chengrentang.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tofirst.chengrentang.R;

/**
 * 闪屏页面
 */
public class SpalshActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initEventListener() {

    }

    /**
     * 测试用
     *
     * @param view
     */
    public void click(View view) {
        startActivity(new Intent(SpalshActivity.this, MainActivity.class));
        finish();
    }
}
