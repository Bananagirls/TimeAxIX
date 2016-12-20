package com.timeaxix.girl.timeaxix.activity;

import android.view.View;
import android.widget.TextView;

import com.timeaxix.girl.timeaxix.R;

public class MainActivity extends BaseActivity {
    private TextView tv_vertical;
    private TextView tv_horizontal;

    @Override
    protected void loadViewLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void findViewById() {
        tv_vertical = (TextView) findViewById(R.id.tv_vertical);
        tv_horizontal = (TextView) findViewById(R.id.tv_horizontal);
    }

    @Override
    protected void setListener() {
        tv_horizontal.setOnClickListener(this);
        tv_vertical.setOnClickListener(this);
    }

    @Override
    protected void processLogic() {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_vertical:
                break;
            case R.id.tv_horizontal:
                break;
        }
    }
}
