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

    LoadingDialogHelper loading();

    LoadingDialogHelper loading(CharSequence content);

    TextDialogHelper text();

    TextDialogHelper text(CharSequence content);

    InputDialogHelper input();

    InputDialogHelper input(CharSequence content);

    ListDialogHelper list();

    ListDialogHelper list(CharSequence[] items);

    ListDialogHelper list(List<? extends CharSequence> items);

    CustomDialogHelper custom();

    CustomDialogHelper custom(View view);

    CustomDialogHelper custom(@LayoutRes int layout);

    void dismiss();
}
