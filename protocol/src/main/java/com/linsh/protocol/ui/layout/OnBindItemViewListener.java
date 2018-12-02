package com.linsh.protocol.ui.layout;

import com.linsh.protocol.ui.view.ViewProtocol;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/12/02
 *    desc   :
 * </pre>
 */
public interface OnBindItemViewListener<T, V extends ViewProtocol> {
    void onBindItemView(DataSetViewProtocol<T> dataSet, V itemView, int position);
}