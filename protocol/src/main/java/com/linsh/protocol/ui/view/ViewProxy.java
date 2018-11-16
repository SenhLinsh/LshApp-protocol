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
public interface ViewProxy {

    View getView();

    void setBackground(Drawable drawable);

    void setBackgroundColor(int color);

    void setBackgroundRes(int resId);

    void setVisibility(int visibility);

    void setEnabled(boolean enabled);

    void setClickable(boolean clickable);

    void setOnClickListener(View.OnClickListener listener);

    void setOnTouchListener(View.OnTouchListener listener);
}
