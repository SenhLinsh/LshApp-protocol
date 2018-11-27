package com.linsh.protocol.ui.view;

import android.widget.EditText;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface EditTextProxy<T extends EditTextProxy, V extends EditText> extends TextViewProxy<T, V> {

    @Override
    V getView();

    T setSelection(int index);

    T setSelection(int start, int stop);
}
