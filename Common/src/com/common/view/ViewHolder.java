package com.common.view;

import android.view.View;

public abstract class ViewHolder<D> {

	protected View mConvertView;
	
	public View getConvertView() {
		return mConvertView;
	}

	public ViewHolder(View convertView) {
		mConvertView = convertView;
	}
	
	public abstract void setData(D d);
	
	public void setData(int position, D d) {
		
	}
}
