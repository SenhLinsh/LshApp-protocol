package com.linsh.protocol.ui.dialog;

import android.support.annotation.LayoutRes;
import android.view.View;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface DialogManager {

    LoadingDialogProtocol loading();

    LoadingDialogProtocol loading(CharSequence content);

    TextDialogProtocol text();

    TextDialogProtocol text(CharSequence content);

    InputDialogProtocol input();

    InputDialogProtocol input(CharSequence content);

    ListDialogProtocol list();

    ListDialogProtocol list(CharSequence[] items);

    ListDialogProtocol list(List<? extends CharSequence> items);

    CustomDialogProtocol custom();

    CustomDialogProtocol custom(View view);

    CustomDialogProtocol custom(@LayoutRes int layout);

    void dismiss();
}
