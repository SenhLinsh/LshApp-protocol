package com.linsh.protocol.ui.widget;

import android.support.v7.widget.Toolbar;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/17
 *    desc   :
 * </pre>
 */
public interface ToolbarHelper {

    ToolbarHelper setToolbar(Toolbar toolbar);

    ToolbarHelper setBackgroundColor(int color);

    ToolbarHelper setTitle(CharSequence title);

    ToolbarHelper setSubtitle(CharSequence subtitle);
}
