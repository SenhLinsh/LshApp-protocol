package com.linsh.protocol.ui.view;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/12/06
 *    desc   :
 * </pre>
 */
public interface Register {

    <T extends ViewProtocol> Register registerProtocol(Class<T> protocol, Class<? extends T> protocolImpl);

    <T extends ViewProtocol> Register registerProtocol(Class<T> protocol, Class<? extends T> protocolImpl, boolean defaultLayout);

    <T extends ViewProtocol> Register unregisterProtocol(Class<T> protocol, Class<? extends T> protocolImpl);

    <I, T extends Info<? super I>> Register registerInfo(String name, Class<T> info, Class<I> target);
}