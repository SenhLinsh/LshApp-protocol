package com.linsh.protocol.ui.dialog;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface InputDialogProtocol extends BaseDialogProtocol<InputDialogProtocol> {

    InputDialogProtocol hint(CharSequence hint);

    InputDialogProtocol content(CharSequence content);

    CharSequence getHint();

    CharSequence getContent();
}
