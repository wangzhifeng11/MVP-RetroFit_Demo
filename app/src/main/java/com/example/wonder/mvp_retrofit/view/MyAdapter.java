package com.example.wonder.mvp_retrofit.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wonder.mvp_retrofit.R;
import com.example.wonder.mvp_retrofit.http.GoodsListBean;

import java.util.List;

/**
 * Created by gjl on 2018/3/13.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<GoodsListBean.DataBean> list;
    public MyAdapter(Context context, List<GoodsListBean.DataBean> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.layout_item, null);
        ImageView iv=view.findViewById(R.id.pic);
       TextView tv= view.findViewById(R.id.tv);
        String images = list.get(position).getImages();
        String s = images.split("\\|")[0];
        Glide.with(context).load(s).into(iv);
        tv.setText(list.get(position).getTitle());
        return view;
    }
}
