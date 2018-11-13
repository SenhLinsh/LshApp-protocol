package com.linsh.protocol.ui.dialog;

import android.app.Dialog;

import com.linsh.protocol.ui.view.ViewHelper;

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

    T positiveBtn(OnClickListener listener);

    T positiveBtn(CharSequence text, OnClickListener<T> listener);

    T negativeBtn(OnClickListener listener);

    T negativeBtn(CharSequence text, OnClickListener<T> listener);

    T neutralBtn(OnClickListener listener);

    T neutralBtn(CharSequence text, OnClickListener<T> listener);

    T show();

    T dismiss();

    Dialog build();

    ViewHelper getContentView();

    interface OnClickListener<T> {
        void onClick(T dialogHelper);
    }
}
