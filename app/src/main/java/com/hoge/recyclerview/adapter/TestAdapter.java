package com.hoge.recyclerview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.hoge.recyclerview.base.adapter.RVBaseAdapter;
import com.hoge.recyclerview.base.adapter.RVBaseViewHolder;
import com.hoge.simplerecyclerview.R;

/**
 * @author sunleilei
 * @date 2016/12/14 下午7:57.
 */

public class TestAdapter extends RVBaseAdapter<RVBaseViewHolder>{


    public TestAdapter(Context mContext) {
        super(mContext);
    }

    @Override
    protected RVBaseViewHolder createHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.test_item1,parent,false);
        return new RVBaseViewHolder(itemView);
    }

    @Override
    protected void bindHolder(RVBaseViewHolder holder, int position) {

    }

}
