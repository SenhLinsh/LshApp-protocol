package com.linsh.protocol.ui.layout;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/15
 *    desc   :
 * </pre>
 */
public interface LayoutManager {

    <T> ListViewProtocol<T> list();

    <T> ListViewProtocol<T> list(List<T> data);

    <T> ListViewProtocol<T> list(T[] data);

    <T> ListViewProtocol<T> list(T data);
}