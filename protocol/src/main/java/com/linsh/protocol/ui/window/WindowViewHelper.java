package com.linsh.protocol.ui.window;

import android.view.View;

import com.linsh.protocol.ui.view.ViewProtocol;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/16
 *    desc   :
 * </pre>
 */
public interface WindowViewHelper extends ViewProtocol {

    View getView();

    void setLocation(int x, int y);

    void addFlags(int flags);

    void removeFlags(int flags);

    void setGravity(int gravity);

    void setType(int type);

    void setFormat(int format);

    void makeFloating(FloatingHelper floatingHelper);

    FloatingHelper getFloatingHelper();
}
