package com.naruto.mvpdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.naruto.mvpdemo.R;
import com.naruto.mvpdemo.bean.ArticleBean;

import java.util.Collection;
import java.util.List;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 15:03.
 */
public class DataAdapter extends RecyclerView.Adapter<DataViewHolder>{

    private List<ArticleBean> mDataList;
    private LayoutInflater mInflater;

    public DataAdapter(Context context, List<ArticleBean> list) {
        mDataList = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_article, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.mTvTitle.setText(mDataList.get(position).getTitle());
        holder.mTvSource.setText(mDataList.get(position).getSource());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void setNewData(Collection<ArticleBean> articleBeanCollection){
        mDataList.clear();
        mDataList.addAll(articleBeanCollection);
        notifyDataSetChanged();
    }
}
