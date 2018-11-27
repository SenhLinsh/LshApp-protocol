package com.linsh.protocol.ui.view;

import android.text.TextUtils;
import android.widget.TextView;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface TextViewProxy<T extends TextViewProxy, V extends TextView> extends ViewProxy<T, V> {

    @Override
    V getView();

    T setText(CharSequence text);

    T setText(int resId);

    T setTextColor(int color);

    T setTextSize(float size);

    T setTextSize(int unit, float size);

    T setHint(CharSequence text);

    T setHint(int resId);

    T setHintTextColor(int color);

    T setLines(int lines);

    T setLineSpacing(float add, float mult);

    T setMaxLines(int maxLines);

    T setMinLines(int minLines);

    T setEllipsize(TextUtils.TruncateAt where);
}
