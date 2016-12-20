package com.timeaxix.girl.timeaxix.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.timeaxix.girl.timeaxix.R;
import com.timeaxix.girl.timeaxix.adapter.VerticalAdapter;

import java.util.ArrayList;
import java.util.List;

public class VerticalActivity extends Activity {
    private ListView vertical_listview;
    private List<String> list = new ArrayList<>();
    private VerticalAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical);
        findViewById();
        processLogic();
    }


    protected void findViewById() {
        vertical_listview = (ListView) findViewById(R.id.vertical_listview);
    }


    protected void processLogic() {
        for (int i = 1; i < 32; i++) {
            list.add("2016-12-" + i);
        }
        adapter = new VerticalAdapter(list, VerticalActivity.this);
        vertical_listview.setAdapter(adapter);
        vertical_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(VerticalActivity.this, "您点击了" + i, Toast.LENGTH_LONG).show();
            }

        });
    }


}
