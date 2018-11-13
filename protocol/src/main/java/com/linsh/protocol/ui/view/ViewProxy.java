package com.linsh.protocol.ui.view;

import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ViewProxy<T extends ViewProxy> {

    View getView();

    T background(Drawable drawable);

    T backgroundColor(int color);

    T backgroundRes(int resId);

    T visibility(int visibility);

    T enabled(boolean enabled);

    T clickable(boolean clickable);

    T onClickListener(View.OnClickListener listener);

    T onTouchListener(View.OnTouchListener listener);
}
