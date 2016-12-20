package com.timeaxix.girl.timeaxix.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.timeaxix.girl.timeaxix.R;
import com.timeaxix.girl.timeaxix.adapter.HorizontalAdapter;
import com.timeaxix.girl.timeaxix.adapter.VerticalAdapter;
import com.timeaxix.girl.timeaxix.widget.HorizontalListView;

import java.util.ArrayList;
import java.util.List;

public class HorizontalActivity extends Activity {
    private HorizontalListView horizontal_lv;
    private List<String> list = new ArrayList<>();
    private HorizontalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);
        horizontal_lv = (HorizontalListView) findViewById(R.id.horizontal_lv);
        for (int i = 1; i < 32; i++) {
            list.add("2016-12-" + i);
        }
        adapter = new HorizontalAdapter(list, HorizontalActivity.this);
        horizontal_lv.setAdapter(adapter);
        horizontal_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(HorizontalActivity.this, "点击了" + i, Toast.LENGTH_LONG).show();
            }
        });
    }
}
