package com.linsh.protocol.ui.dialog;

import android.app.Dialog;
import android.view.View;

import com.linsh.protocol.ui.OnClickListener;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface DialogHelper<T extends DialogHelper> {

    T title(CharSequence title);

    T positiveBtn(OnClickListener<T> listener);

    T positiveBtn(CharSequence text, OnClickListener<T> listener);

    T negativeBtn(OnClickListener<T> listener);

    T negativeBtn(CharSequence text, OnClickListener<T> listener);

    T neutralBtn(OnClickListener<T> listener);

    T neutralBtn(CharSequence text, OnClickListener<T> listener);

    T show();

    T dismiss();

    Dialog build();

    View getContentView();
}
