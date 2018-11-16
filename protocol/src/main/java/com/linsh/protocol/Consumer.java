package com.linsh.protocol;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface Consumer<T> {

    void accept(T t) throws Exception;
}
