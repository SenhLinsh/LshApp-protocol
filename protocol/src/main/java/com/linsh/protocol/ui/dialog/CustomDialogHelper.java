package com.linsh.protocol.ui.dialog;

import android.support.annotation.LayoutRes;
import android.view.View;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface CustomDialogHelper extends DialogHelper<CustomDialogHelper> {

    CustomDialogHelper setView(View view);

    CustomDialogHelper setView(@LayoutRes int layout);

    View getView();
}
