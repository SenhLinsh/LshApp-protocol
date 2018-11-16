package com.linsh.protocol.ui.widget;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/17
 *    desc   :
 * </pre>
 */
public interface ToolbarHelper {

    ToolbarHelper setBackgroundColor(int color);

    ToolbarHelper setTitle(CharSequence title);

    ToolbarHelper setSubtitle(CharSequence subtitle);

    ToolbarHelper setMenu(MenuHelper helper);
}
