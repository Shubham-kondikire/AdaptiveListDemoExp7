package com.example.adaptivelistdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Custom adapter that adapts a List<ListItem> data source into
 * ListView rows containing an ImageView, title, subtitle and price.
 * Uses the ViewHolder pattern + convertView recycling for smooth scrolling.
 */
public class CustomAdapter extends BaseAdapter {

    private final Context context;
    private final List<ListItem> itemList;

    public CustomAdapter(Context context, List<ListItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.list_item_row, parent, false);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.title = convertView.findViewById(R.id.textTitle);
            holder.subtitle = convertView.findViewById(R.id.textSubtitle);
            holder.price = convertView.findViewById(R.id.textPrice);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ListItem item = itemList.get(position);
        holder.imageView.setImageResource(item.getImageResId());
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());
        holder.price.setText(item.getPrice());

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageView;
        TextView title;
        TextView subtitle;
        TextView price;
    }
}
