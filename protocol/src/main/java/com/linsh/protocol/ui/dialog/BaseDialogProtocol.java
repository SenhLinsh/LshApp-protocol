package com.linsh.protocol.ui.dialog;

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
public interface BaseDialogProtocol<T extends BaseDialogProtocol> extends DialogProtocol {

    T title(CharSequence title);

    T positiveBtn(OnClickListener<T> listener);

    T positiveBtn(CharSequence text, OnClickListener<T> listener);

    T negativeBtn(OnClickListener<T> listener);

    T negativeBtn(CharSequence text, OnClickListener<T> listener);

    T neutralBtn(OnClickListener<T> listener);

    T neutralBtn(CharSequence text, OnClickListener<T> listener);

    T show();

    T dismiss();

    View getContentView();
}
