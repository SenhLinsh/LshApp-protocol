package com.linsh.protocol.ui.window;

import android.view.View;
import android.view.WindowManager.LayoutParams;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface WindowManager {

    WindowManager addView(View view, LayoutParams layoutParams);

    WindowManager addView(WindowViewHelper viewHelper);

    WindowViewHelper getWindowViewHelper();

    int getViewCount();

    boolean containView(View view);

    WindowManager updateViewLayout(View view);

    WindowManager updateViewLayout(WindowViewHelper viewHelper);

    WindowManager removeView(int index);

    WindowManager removeView(View view);

    WindowManager removeAllViews();
}
