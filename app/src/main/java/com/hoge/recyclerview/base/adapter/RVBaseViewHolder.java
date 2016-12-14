package com.hoge.recyclerview.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author sunleilei
 * @date 2016/12/14 下午7:44.
 */

public class RVBaseViewHolder<T extends View> extends RecyclerView.ViewHolder{

    private View itemView;
    private SparseArray<View> mViews;
    public RVBaseViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        mViews = new SparseArray<>();
    }

    public T retrieveView(int id) {
        View view = mViews.get(id);
        if (view != null) {
            view = itemView.findViewById(id);
            mViews.put(id,view);
        }
        return (T) view;
    }

    public void setTextView(int id, String text) {
        TextView textView = (TextView) retrieveView(id);

    }

    public void setImageView(int id, String url) {
        ImageView view = (ImageView) retrieveView(id);
    }
}
