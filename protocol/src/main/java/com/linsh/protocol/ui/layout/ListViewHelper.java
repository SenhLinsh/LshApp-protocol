package com.linsh.protocol.ui.layout;

import android.support.v7.widget.RecyclerView;

import com.linsh.protocol.value.Types;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/15
 *    desc   :
 * </pre>
 */
public interface ListViewHelper<T> {

    RecyclerView getView();

    RecyclerView.Adapter getAdapter();

    List<T> getData();

    T getSingleData();

    ListViewHelper setData(List<T> data);

    ListViewHelper setData(T[] data);

    ListViewHelper setSingleData(T data);

    ListViewHelper setCounter(ItemCounter counter);

    <V extends ItemViewHelper<T>> ListViewHelper setItemView(ItemViewFactory<V> factory);

    <V extends ItemViewHelper<T>> ListViewHelper setItemView(OnCreateItemViewListener<V> createListener);

    ListViewHelper setDivider(Types types);

    <V extends ItemViewHelper<T>> ListViewHelper setDivider(V helper);

    <V extends ItemViewHelper<T>> ListViewHelper addHeader(V helper);

    <V extends ItemViewHelper<T>> ListViewHelper addFooter(V helper);

    void setOnItemClickListener(OnItemClickListener listener);

    void setOnItemLongClickListener(OnItemLongClickListener listener);
}
