package com.linsh.protocol.ui.layout;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/15
 *    desc   :
 * </pre>
 */
public interface OnBindItemListener<T, V extends ItemViewHelper> {

    void onBindItem(T t, V itemHelper, int position);
}
