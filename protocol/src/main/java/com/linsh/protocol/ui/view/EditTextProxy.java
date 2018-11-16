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
public interface EditTextProxy extends TextViewProxy {

    @Override
    EditText getView();

    void setSelection(int index);

    void setSelection(int start, int stop);
}
