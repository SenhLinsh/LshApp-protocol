package com.linsh.protocol.ui.layout;

import com.linsh.protocol.ui.view.ViewProtocol;

import java.util.List;

import io.reactivex.functions.BiFunction;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/12/02
 *    desc   :
 * </pre>
 */
public interface DataSetViewProtocol<T> extends ViewProtocol {

    List<T> getData();

    T getSingleData();

    T getItemData(int position);

    <U> U getExtraData();

    <U> U getExtraData(int index);

    DataSetViewProtocol<T> setData(List<T> data);

    DataSetViewProtocol<T> setData(T[] data);

    DataSetViewProtocol<T> setSingleData(T data);

    DataSetViewProtocol<T> setExtraData(Object... data);

    DataSetViewProtocol<T> setExtraData(int index, Object data);

    DataSetViewProtocol<T> setCounter(ItemCounter counter);

    <V extends ViewProtocol> DataSetViewProtocol<T> addItemView(Class<V> itemHelper);

    <V extends ViewProtocol> DataSetViewProtocol<T> addItemView(Class<V> itemHelper, OnBindItemViewListener<T, V> listener);

    <V extends ViewProtocol> DataSetViewProtocol<T> addItemView(Class<V> itemHelper, OnBindItemViewListener<T, V> listener, BiFunction<ListViewProtocol<T>, Integer, Boolean> filter);

}
