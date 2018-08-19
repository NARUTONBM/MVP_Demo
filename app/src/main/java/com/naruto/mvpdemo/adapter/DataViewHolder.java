package com.naruto.mvpdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.naruto.mvpdemo.R;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 15:07.
 */
class DataViewHolder extends RecyclerView.ViewHolder{

    TextView mTvTitle;
    TextView mTvSource;

    public DataViewHolder(View itemView) {
        super(itemView);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mTvSource = itemView.findViewById(R.id.tvSource);
    }
}
