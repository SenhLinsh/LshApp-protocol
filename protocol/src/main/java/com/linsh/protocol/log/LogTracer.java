package com.linsh.protocol.log;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/15
 *    desc   :
 * </pre>
 */
public interface LogTracer {

    void i(String msg);

    void i(String tag, String msg);
}
