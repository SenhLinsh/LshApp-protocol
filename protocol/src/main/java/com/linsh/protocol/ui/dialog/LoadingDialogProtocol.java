package com.linsh.protocol.ui.dialog;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface LoadingDialogProtocol extends DialogProtocol {

    LoadingDialogProtocol title(CharSequence title);

    LoadingDialogProtocol content(CharSequence content);

    LoadingDialogProtocol progress(float progress);

    LoadingDialogProtocol horizontal();

    LoadingDialogProtocol horizontal(float progress);

    LoadingDialogProtocol round();

    LoadingDialogProtocol round(float progress);

    LoadingDialogProtocol show();

    LoadingDialogProtocol dismiss();
}
