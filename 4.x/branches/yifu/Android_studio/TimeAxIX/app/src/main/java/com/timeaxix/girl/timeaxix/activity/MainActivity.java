package com.timeaxix.girl.timeaxix.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.timeaxix.girl.timeaxix.R;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView tv_vertical;
    private TextView tv_horizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        setListener();
    }


    protected void findViewById() {
        tv_vertical = (TextView) findViewById(R.id.tv_vertical);
        tv_horizontal = (TextView) findViewById(R.id.tv_horizontal);
    }

    protected void setListener() {
        tv_horizontal.setOnClickListener(this);
        tv_vertical.setOnClickListener(this);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_vertical:
                startActivity(new Intent(this, VerticalActivity.class));
                break;
            case R.id.tv_horizontal:
                startActivity(new Intent(this, HorizontalActivity.class));
                break;
        }
    }
}
