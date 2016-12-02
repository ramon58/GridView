package com.regilog.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Ramon on 27/11/2016.
 */

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	
	// Keep all Images in array
	public Integer[] mThumbIds = {
			R.drawable.img_uno,    R.drawable.img_nueve,  R.drawable.img_diecisiete,
			R.drawable.img_dos,    R.drawable.img_diez,   R.drawable.img_dieciocho,
			R.drawable.img_tres,   R.drawable.img_once,   R.drawable.img_diecinueve,
			R.drawable.img_cuatro, R.drawable.img_doce,   R.drawable.img_veinte,
			R.drawable.img_cinco,  R.drawable.img_trece,  R.drawable.img_ventiuno,
			R.drawable.img_seis,   R.drawable.img_catorce,
			R.drawable.img_siete,  R.drawable.img_quince,
			R.drawable.img_ocho,   R.drawable.img_dieciseis
	};
	
	// Constructor
	public ImageAdapter(Context c){
		mContext = c;
	}

	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		return mThumbIds[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {			
		ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(140, 140));
        return imageView;
	}

}
