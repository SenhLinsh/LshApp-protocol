package com.linsh.protocol.ui.layout;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/16
 *    desc   :
 * </pre>
 */
public interface OnItemSelectedListener<V extends ItemViewHelper> {

    void onItemSelected(V viewHelper, int index);

}
