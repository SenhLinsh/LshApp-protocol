package com.linsh.protocol.ui.view;

import com.linsh.protocol.value.Types;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ViewHelper extends ViewProxy {

    void setTypes(Types types);

    void setWidth(int width);

    void setHeight(int height);

    void setSize(int width, int height);
}