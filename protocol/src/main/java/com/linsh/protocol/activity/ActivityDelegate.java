package com.linsh.protocol.activity;

import com.linsh.protocol.ui.view.ViewProtocol;

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

    ActivityDelegate unsubscribe(Class<? extends ActivitySubscribe> subscriber);

    ActivityDelegate unsubscribe(ActivitySubscribe subscriber);

    <T extends ActivitySubscribe> T getSubscriber(Class<T> subscriber);

    <T extends ActivitySubscribe> T useSubscriber(Class<T> subscriber);

    <T extends ActivitySubscribe> T useSubscriber(T subscriber);

    IntentDelegate intent();

    <V extends ViewProtocol> V findViewProtocol(Class<V> protocol);

    <V extends ViewProtocol> V findViewProtocol(Class<V> protocol, String key);
}
