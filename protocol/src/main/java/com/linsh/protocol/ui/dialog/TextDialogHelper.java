package com.linsh.protocol.ui.dialog;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface TextDialogHelper extends DialogHelper<TextDialogHelper> {

    TextDialogHelper content(CharSequence content);

    CharSequence getContent();
}
