package com.linsh.protocol.config;

import com.linsh.protocol.ui.view.ViewProtocol;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/22
 *    desc   :
 * </pre>
 */
public class UIConfig {

    private final Map<String, Class<? extends ViewProtocol>> impls;

    public UIConfig() {
        this.impls = new HashMap<>();
    }

    public <T extends ViewProtocol> Class<? extends T> getImpl(Class<T> protocol) {
        return getImpl(protocol, null);
    }

    public <T extends ViewProtocol> Class<? extends T> getImpl(Class<T> protocol, String key) {
        if (!protocol.isInterface()) {
            throw new IllegalArgumentException("protocol 必须为接口");
        }
        return getImpl(protocol.getSimpleName(), key);
    }

    public <T extends ViewProtocol> Class<? extends T> getImpl(String protocolName) {
        return getImpl(protocolName, null);
    }

    public <T extends ViewProtocol> Class<? extends T> getImpl(String protocolName, String key) {
        String mapKey = key == null ? protocolName : protocolName + "-" + key;
        return (Class<? extends T>) impls.get(mapKey);
    }

    public <T extends ViewProtocol> UIConfig putImpl(Class<T> protocol, Class<? extends T> protocolImpl) {
        impls.put(protocol.getSimpleName(), protocolImpl);
        return this;
    }

    public <T extends ViewProtocol> UIConfig putImpl(Class<T> protocol, String key, Class<? extends T> protocolImpl) {
        impls.put(protocol.getSimpleName() + "-" + key, protocolImpl);
        return this;
    }

    public <T extends ViewProtocol> UIConfig putImpl(String protocolName, Class<? extends T> protocolImpl) {
        impls.put(protocolName, protocolImpl);
        return this;
    }

    public <T extends ViewProtocol> UIConfig putImpl(String protocolName, String key, Class<? extends T> protocolImpl) {
        impls.put(protocolName + "-" + key, protocolImpl);
        return this;
    }
}
