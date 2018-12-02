package com.linsh.protocol.ui.view;

import android.view.View;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ViewProtocol<T extends View> {
    T getView();
}