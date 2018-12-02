package com.linsh.protocol.ui.layout;

import com.linsh.protocol.ui.view.ViewProtocol;

import java.util.List;

import io.reactivex.functions.BiFunction;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface TabLayoutProtocol<T> extends DataSetViewProtocol<T> {

    @Override
    TabLayoutProtocol<T> setData(List<T> data);

    @Override
    TabLayoutProtocol<T> setData(T[] data);

    @Override
    TabLayoutProtocol<T> setSingleData(T data);

    @Override
    TabLayoutProtocol<T> setExtraData(Object... data);

    @Override
    TabLayoutProtocol<T> setExtraData(int index, Object data);

    @Override
    TabLayoutProtocol<T> setCounter(ItemCounter counter);

    @Override
    <V extends ViewProtocol> TabLayoutProtocol<T> addItemView(Class<V> itemHelper);

    @Override
    <V extends ViewProtocol> TabLayoutProtocol<T> addItemView(Class<V> itemHelper, OnBindItemViewListener<T, V> listener);

    @Override
    <V extends ViewProtocol> TabLayoutProtocol<T> addItemView(Class<V> itemHelper, OnBindItemViewListener<T, V> listener, BiFunction<ListViewProtocol<T>, Integer, Boolean> filter);

    TabLayoutProtocol<T> setOnItemSelectedListener(OnItemSelectedListener<T> listener);
}
