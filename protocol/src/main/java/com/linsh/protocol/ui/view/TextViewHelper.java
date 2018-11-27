package com.linsh.protocol.ui.view;

import android.widget.TextView;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface TextViewHelper<T extends TextViewHelper, V extends TextView> extends ViewHelper<T, V>, TextViewProxy<T, V> {
}
