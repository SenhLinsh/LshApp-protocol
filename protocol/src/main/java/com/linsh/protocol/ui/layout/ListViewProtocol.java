package com.linsh.protocol.ui.layout;

import android.support.v7.widget.RecyclerView;

import com.linsh.protocol.ui.view.ViewProtocol;

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
public interface ListViewProtocol<T> extends DataSetViewProtocol<T> {

    @Override
    RecyclerView getView();

    List<T> getData();

    T getSingleData();

    T getItemData(int position);

    <U> U getExtraData();

    <U> U getExtraData(int index);

    @Override
    ListViewProtocol<T> setData(List<T> data);

    @Override
    ListViewProtocol<T> setData(T[] data);

    @Override
    ListViewProtocol<T> setSingleData(T data);

    @Override
    ListViewProtocol<T> setExtraData(Object... data);

    @Override
    ListViewProtocol<T> setExtraData(int index, Object data);

    @Override
    ListViewProtocol<T> setCounter(ItemCounter counter);

    @Override
    <V extends ViewProtocol> ListViewProtocol<T> addItemView(Class<V> itemProtocol);

    @Override
    <V extends ViewProtocol> ListViewProtocol<T> addItemView(Class<V> itemProtocol, OnBindItemViewListener<T, V> listener);

    @Override
    <V extends ViewProtocol> ListViewProtocol<T> addItemView(Class<V> itemProtocol, OnBindItemViewListener<T, V> listener, BiFunction<ListViewProtocol<T>, Integer, Boolean> filter);

    <V extends ViewProtocol> ListViewProtocol<T> addHeader(Class<V> itemProtocol);

    <V extends ViewProtocol> ListViewProtocol<T> addHeader(Class<V> itemProtocol, OnBindItemViewListener<T, V> listener);

    <V extends ViewProtocol> ListViewProtocol<T> addFooter(Class<V> itemProtocol);

    <V extends ViewProtocol> ListViewProtocol<T> addFooter(Class<V> itemProtocol, OnBindItemViewListener<T, V> listener);

    <V extends ViewProtocol> ListViewProtocol<T> setDivider(Class<V> itemProtocol);

    <V extends ViewProtocol> ListViewProtocol<T> setDivider(Class<V> itemProtocol, OnBindItemViewListener<T, V> listener);

    ListViewProtocol<T> setDivider(int gap, int color);

    ListViewProtocol<T> setOnItemClickListener(OnItemClickListener<T> listener);

    ListViewProtocol<T> setOnItemLongClickListener(OnItemLongClickListener<T> listener);
}