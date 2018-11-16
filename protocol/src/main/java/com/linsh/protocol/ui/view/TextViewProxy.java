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
public interface TextViewProxy extends ViewProxy {

    @Override
    TextView getView();

    void setText(CharSequence text);

    void setText(int resId);

    void setTextColor(int color);

    void setTextSize(float size);

    void setTextSize(int unit, float size);

    void setHint(CharSequence text);

    void setHint(int resId);

    void setHintTextColor(int color);

    void setLines(int lines);

    void setLineSpacing(float add, float mult);

    void setMaxLines(int maxLines);

    void setMinLines(int minLines);

    void setEllipsize(TextUtils.TruncateAt where);
}
