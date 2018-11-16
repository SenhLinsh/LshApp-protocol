package com.linsh.protocol.ui.layout;

import android.view.ViewGroup;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/15
 *    desc   :
 * </pre>
 */
public interface OnCreateItemViewListener<V extends ItemViewHelper> {

    V onCreateItemView(ViewGroup parent, int position);
}
