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
public interface ViewProxy<T extends ViewProxy, V extends View> {

    V getView();

    T setBackground(Drawable drawable);

    T setBackgroundColor(int color);

    T setBackgroundRes(int resId);

    T setVisibility(int visibility);

    T setEnabled(boolean enabled);

    T setClickable(boolean clickable);

    T setOnClickListener(View.OnClickListener listener);

    T setOnTouchListener(View.OnTouchListener listener);
}
