package com.linsh.protocol.ui.view;

import android.support.v7.widget.RecyclerView;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/15
 *    desc   :
 * </pre>
 */
public interface RecyclerViewProxy extends ViewGroupProxy {

    @Override
    RecyclerView getView();

    RecyclerView.Adapter getAdapter();

    void setAdapter(RecyclerView.Adapter adapter);

    void setLayoutManager(RecyclerView.LayoutManager layoutManager);

    void addItemDecoration(RecyclerView.ItemDecoration decor);

    void addItemDecoration(RecyclerView.ItemDecoration decor, int index);

    void addOnScrollListener(RecyclerView.OnScrollListener listener);

    void addOnItemTouchListener(RecyclerView.OnItemTouchListener listener);

    void setOnFlingListener(RecyclerView.OnFlingListener onFlingListener);
}
