package com.waracle.androidtest;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CakeAdapter extends BaseAdapter {

    private List<Cake> mCakeList;

    public CakeAdapter(List<Cake> cakeList) {
        mCakeList = cakeList;
    }

    @Override
    public int getCount() {
        return mCakeList.size();
    }

    @Override
    public Object getItem(int position) {
        return mCakeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View root = inflater.inflate(R.layout.list_item_layout, parent, false);
        if (root != null) {
            TextView title = (TextView) root.findViewById(R.id.title);
            TextView desc = (TextView) root.findViewById(R.id.desc);
            ImageView image = (ImageView) root.findViewById(R.id.image);
            Cake cake = (Cake) getItem(position);
            title.setText(cake.getTitle());
            desc.setText(cake.getDesc());

            Glide.with(parent.getContext()).load(cake.getImage()).into(image);
        }

        return root;
    }

    public void addCakeList(List<Cake> cakeList) {
        mCakeList.addAll(cakeList);
        notifyDataSetChanged();
    }
}