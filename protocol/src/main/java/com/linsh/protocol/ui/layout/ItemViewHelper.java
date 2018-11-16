package com.linsh.protocol.ui.layout;

import android.view.View;
import android.view.ViewGroup;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface ItemViewHelper<T> {

    View onCreateView(ViewGroup parent);

    void onBindView(T data, int position);
}
