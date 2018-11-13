package com.linsh.protocol.log;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/15
 *    desc   :
 * </pre>
 */
public interface Logger {

    void i(String msg);

    void i(String msg, Throwable thr);

    void i(String tag, String msg);

    void i(String tag, String msg, Throwable thr);

    void w(String msg);

    void w(Throwable thr);

    void w(String msg, Throwable thr);

    void w(String tag, String msg);

    void w(String tag, String msg, Throwable thr);

    void e(String msg);

    void e(Throwable thr);

    void e(String msg, Throwable thr);

    void e(String tag, String msg);

    void e(String tag, String msg, Throwable thr);
}
