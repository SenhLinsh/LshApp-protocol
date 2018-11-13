package com.linsh.protocol.thread;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface ThreadManager {

    void ui(Runnable task);

    void single(Runnable task);

    void small(Runnable task);

    void io(Runnable task);

    void newThread(Runnable task);
}
