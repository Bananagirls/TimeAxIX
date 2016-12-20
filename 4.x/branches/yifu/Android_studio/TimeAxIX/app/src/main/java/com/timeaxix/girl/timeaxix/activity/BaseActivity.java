package com.timeaxix.girl.timeaxix.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/**
 * @类名称: CLASS
 * @类描述:
 * @创建人：
 * @创建时间：2016/12/16 17:54
 * @备注：
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener {
    protected Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        initView();
    }

    private void initView() {
        loadViewLayout();
        findViewById();
        setListener();
        processLogic();
    }

    protected abstract void loadViewLayout();

    protected abstract void findViewById();

    protected abstract void setListener();

    protected abstract void processLogic();


}