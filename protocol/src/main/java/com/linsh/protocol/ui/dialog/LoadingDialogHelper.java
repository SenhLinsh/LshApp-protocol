package com.linsh.protocol.ui.dialog;

import android.app.Dialog;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface LoadingDialogHelper {

    LoadingDialogHelper title(CharSequence title);

    LoadingDialogHelper content(CharSequence content);

    LoadingDialogHelper progress(float progress);

    LoadingDialogHelper horizontal();

    LoadingDialogHelper horizontal(float progress);

    LoadingDialogHelper round();

    LoadingDialogHelper round(float progress);

    LoadingDialogHelper show();

    LoadingDialogHelper dismiss();

    Dialog build();
}
