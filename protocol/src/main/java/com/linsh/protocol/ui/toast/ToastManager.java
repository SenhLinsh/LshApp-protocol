package com.linsh.protocol.ui.toast;

import android.content.Context;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface ToastManager {

    void show(String msg);

    void show(Context context, String msg);

    void showLong(String msg);

    void showLong(Context context, String msg);
}
