package com.example.uddishverma22.hackdtu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uddishverma22 on 11/02/17.
 */

public class FlipAdapter extends ArrayAdapter {

    String text;

    public FlipAdapter(Context context, int resource) {
        super(context, resource);
    }

    List list = new ArrayList();

    static class Data{
        TextView textView;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        Data d;
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.custom_flip,parent,false);
            d = new Data();
            d.textView = (TextView) row.findViewById(R.id.flip_text);
            row.setTag(d);
        }else {
            d = (Data) row.getTag();
        }

        FlipDetails flipDetails = (FlipDetails)this.getItem(position);
        d.textView.setText(flipDetails.getText());

        return row;
    }
}
