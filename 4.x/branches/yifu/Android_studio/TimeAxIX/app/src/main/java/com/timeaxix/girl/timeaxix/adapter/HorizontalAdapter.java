package com.timeaxix.girl.timeaxix.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.timeaxix.girl.timeaxix.R;

import java.util.List;

/**
 * @类名称: CLASS
 * @类描述:
 * @创建人：""
 * @创建时间：2016/12/20 15:29
 * @备注：
 */
public class HorizontalAdapter extends BaseAdapter {
    private List<String> list;
    private Context context;
    private LayoutInflater layoutInflater;

    public HorizontalAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_hlv, viewGroup, false);
            holder = new ViewHolder();
            holder.tv_content = (TextView) view.findViewById(R.id.tv_content);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        String data = list.get(i);
        holder.tv_content.setText(data);
        return view;
    }

    class ViewHolder {
        TextView tv_content;
    }
}