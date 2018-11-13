package com.linsh.protocol.ui.dialog;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface InputDialogHelper extends DialogHelper<InputDialogHelper> {

    InputDialogHelper hint(CharSequence hint);

    InputDialogHelper content(CharSequence content);

    CharSequence getHint();

    CharSequence getContent();
}
