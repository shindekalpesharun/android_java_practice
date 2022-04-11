package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;

    public CustomListViewAdapter(Activity context, String[] maintitle, String[] subtitle) {
        super(context, R.layout.mylist, maintitle);

        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.tv_custom_lv_title);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.tv_custom_lv_subtitle);

        titleText.setText(maintitle[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;

    };
}
