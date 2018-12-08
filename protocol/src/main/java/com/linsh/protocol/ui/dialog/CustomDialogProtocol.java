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
public interface CustomDialogProtocol extends BaseDialogProtocol<CustomDialogProtocol> {

    CustomDialogProtocol setView(View view);

    CustomDialogProtocol setView(@LayoutRes int layout);

    View getView();
}
