package com.hoge.recyclerview.base.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunleilei
 * @date 2016/12/14 下午7:52.
 */

public abstract class RVBaseAdapter<VH extends RVBaseViewHolder> extends RecyclerView.Adapter<VH> {
    private Context mContext;
    protected LayoutInflater mLayoutInflater;
    protected List items;
    protected abstract VH createHolder(ViewGroup parent, int viewType);
    protected abstract void bindHolder(VH holder, int position);
    public RVBaseAdapter(Context mContext) {
        this.mContext = mContext;
        mLayoutInflater = LayoutInflater.from(mContext);
        items = new ArrayList();
    }

    public void appendData(List list) {
        items.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return createHolder(parent,viewType);
    }


    @Override
    public void onBindViewHolder(VH holder, int position) {
        bindHolder(holder,position);
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
