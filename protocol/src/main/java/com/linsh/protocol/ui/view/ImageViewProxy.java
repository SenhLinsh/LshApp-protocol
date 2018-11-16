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
public interface ImageViewProxy extends ViewProxy {

    @Override
    ImageView getView();

    void setImage(Bitmap bitmap);

    void setImage(Drawable drawable);

    void setImage(int resId);
}
