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
public interface RecyclerViewProxy<T extends RecyclerViewProxy, V extends RecyclerView> extends ViewGroupProxy<T, V> {

    @Override
    V getView();

    RecyclerView.Adapter getAdapter();

    T setAdapter(RecyclerView.Adapter adapter);

    T setLayoutManager(RecyclerView.LayoutManager layoutManager);

    T addItemDecoration(RecyclerView.ItemDecoration decor);

    T addItemDecoration(RecyclerView.ItemDecoration decor, int index);

    T addOnScrollListener(RecyclerView.OnScrollListener listener);

    T addOnItemTouchListener(RecyclerView.OnItemTouchListener listener);

    T setOnFlingListener(RecyclerView.OnFlingListener onFlingListener);
}
