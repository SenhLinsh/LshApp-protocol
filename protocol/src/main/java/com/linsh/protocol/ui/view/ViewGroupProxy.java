package com.linsh.protocol.ui.view;

import android.view.View;
import android.view.ViewGroup;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ViewGroupProxy<T extends ViewGroupProxy> extends ViewProxy<T> {

    @Override
    ViewGroup getView();

    T addView(View view);

    T getChildAt(int index);
}
