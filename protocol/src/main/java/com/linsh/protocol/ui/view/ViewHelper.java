package com.linsh.protocol.ui.view;

import com.linsh.protocol.value.Values;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ViewHelper extends ViewProxy<ViewHelper> {

    ViewHelper setStyle(Values values);

    ViewGroupHelper asViewGroup();
}
