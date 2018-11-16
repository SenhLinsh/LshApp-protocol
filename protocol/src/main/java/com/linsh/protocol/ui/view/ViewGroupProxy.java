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
public interface ViewGroupProxy extends ViewProxy {

    @Override
    ViewGroup getView();

    void addView(View view);

    void getChildAt(int index);

    void removeView(View view);

    void removeViewAt(int index);

    void removeAllViews();

    void setClipToPadding(boolean clipToPadding);

    void setClipChildren(boolean clipChildren);

    void setLayoutAnimation(LayoutAnimationController controller);

    void setLayoutAnimationListener(Animation.AnimationListener animationListener);
}
