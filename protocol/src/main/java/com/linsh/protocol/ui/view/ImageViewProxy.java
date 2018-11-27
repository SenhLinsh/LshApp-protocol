package com.linsh.protocol.ui.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/14
 *    desc   :
 * </pre>
 */
public interface ImageViewProxy<T extends ImageViewProxy, V extends ImageView> extends ViewProxy<T, V> {

    @Override
    V getView();

    T setImage(Bitmap bitmap);

    T setImage(Drawable drawable);

    T setImage(int resId);
}
