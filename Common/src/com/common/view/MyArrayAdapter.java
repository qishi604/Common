package com.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public abstract class MyArrayAdapter<T> extends ArrayAdapter<T> {
	
	public MyArrayAdapter(Context context) {
		super(context, 0);
	}
	
	public abstract int getItemViewResource();
	
	public abstract ViewHolder<T> getViewHolder(View convertView);
	
	@SuppressWarnings("unchecked")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder<T> holder = null;
		if (null == convertView) {
			convertView = LayoutInflater.from(getContext()).inflate(getItemViewResource(), null);
			holder = getViewHolder(convertView);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder<T>) convertView.getTag();
		}
		
		holder.setData(getItem(position));
		holder.setData(position, getItem(position));

		return convertView;
	}

}
