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
public interface EditTextHelper<T extends EditTextHelper, V extends EditText> extends TextViewHelper<T, V>, EditTextProxy<T, V> {
}
