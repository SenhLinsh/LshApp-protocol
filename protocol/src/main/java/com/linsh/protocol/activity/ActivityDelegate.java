package com.linsh.protocol.activity;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/06
 *    desc   :
 * </pre>
 */
public interface ActivityDelegate {

    ActivityDelegate subscribe(Class<? extends ActivitySubscribe> subscriber);

    ActivityDelegate subscribe(ActivitySubscribe subscriber);

    ActivityDelegate remove(Class<? extends ActivitySubscribe> subscriber);

    ActivityDelegate remove(ActivitySubscribe subscriber);

    <T extends ActivitySubscribe> T use(Class<T> subscriber);

    <T extends ActivitySubscribe> T use(T subscriber);
}
