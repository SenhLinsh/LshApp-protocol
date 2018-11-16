package com.linsh.protocol.ui.layout;

import android.view.View;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface TabLayoutHelper<T> {

    View getView();

    List<T> getData();

    T getSingleData();

    ListViewHelper setData(List<T> data);

    ListViewHelper setData(T[] data);

    ListViewHelper setSingleData(T data);

    ListViewHelper setCounter(ItemCounter counter);

    TabLayoutHelper setTitles(CharSequence[] titles);

    TabLayoutHelper setTitles(List<CharSequence> titles);

    TabLayoutHelper setIcons(int[] icons);

    <V extends ItemViewHelper<T>> TabLayoutHelper setItemView(ItemViewFactory<V> factory);

    <V extends ItemViewHelper<T>> TabLayoutHelper setItemView(ItemViewFactory<V> factory,
                                                           OnItemSelectedListener<V> listener);
}
