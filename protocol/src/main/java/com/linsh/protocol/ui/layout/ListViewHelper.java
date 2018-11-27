package com.linsh.protocol.ui.layout;

import android.support.v7.widget.RecyclerView;

import com.linsh.protocol.value.Types;

import java.util.List;

import io.reactivex.functions.BiFunction;

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

    ListViewHelper<T> setData(List<T> data);

    ListViewHelper<T> setData(T[] data);

    ListViewHelper<T> setSingleData(T data);

    ListViewHelper<T> setCounter(ItemCounter counter);

    <V extends ItemViewHelper<T>> ListViewHelper<T> addItemView(ItemViewFactory<V> factory);

    <V extends ItemViewHelper<T>> ListViewHelper<T> addItemView(ItemViewFactory<V> factory, BiFunction<ListViewHelper<T>, Integer, Boolean> filter);

    ListViewHelper<T> setDivider(Types types);

    <V extends ItemViewHelper<T>> ListViewHelper<T> setDivider(V helper);

    <V extends ItemViewHelper<T>> ListViewHelper<T> addHeader(V helper);

    <V extends ItemViewHelper<T>> ListViewHelper<T> addFooter(V helper);

    void setOnItemClickListener(OnItemClickListener listener);

    void setOnItemLongClickListener(OnItemLongClickListener listener);
}
