package com.linsh.protocol.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ViewGroupProxy<T extends ViewGroupProxy, V extends ViewGroup> extends ViewProxy<T, V> {

    @Override
    V getView();

    T addView(View view);

    T getChildAt(int index);

    T removeView(View view);

    T removeViewAt(int index);

    T removeAllViews();

    T setClipToPadding(boolean clipToPadding);

    T setClipChildren(boolean clipChildren);

    T setLayoutAnimation(LayoutAnimationController controller);

    T setLayoutAnimationListener(Animation.AnimationListener animationListener);
}
