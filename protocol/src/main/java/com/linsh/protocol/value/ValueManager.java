package com.linsh.protocol.value;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/06
 *    desc   :
 * </pre>
 */
public interface ValueManager {

    ColorCreator color();

    TextSizeCreator textSize();

    IdCreator id();
}
