package com.linsh.protocol.ui.layout;

import com.linsh.protocol.Type;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/15
 *    desc   :
 * </pre>
 */
public interface LayoutManager {

    <T> ListViewHelper<T> list(Type<T> typeOfData);

    <T> TabLayoutHelper<T> tab(Type<T> typeOfData);
}
