package com.linsh.protocol.ui.window;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/16
 *    desc   :
 * </pre>
 */
public interface FloatingHelper {

    void setMovable(boolean movable);

    void setSticky(boolean sticky);

    void setHidePercentWhenStick(float hidePercent);

    void stickToFrame();
}
