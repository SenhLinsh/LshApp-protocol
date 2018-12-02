package com.linsh.protocol.ui.layout;

import com.linsh.protocol.ui.view.ViewProtocol;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/16
 *    desc   :
 * </pre>
 */
public interface OnItemSelectedListener<T> {

    void onItemSelected(DataSetViewProtocol<T> dataSet, ViewProtocol itemView, int index);

}
