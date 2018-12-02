package com.linsh.protocol.config;

import com.linsh.protocol.ui.view.ViewProtocol;

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

    private final Map<Class<? extends ViewProtocol>, Class<? extends ViewProtocol>> impls;

    public UIConfig(Map<Class<? extends ViewProtocol>, Class<? extends ViewProtocol>> impls) {
        this.impls = impls;
    }

    public <T extends ViewProtocol> Class<? extends T> getImpl(Class<T> protocol) {
        return (Class<? extends T>) impls.get(protocol);
    }

    public static class Builder {

        private Map<Class<? extends ViewProtocol>, Class<? extends ViewProtocol>> impls;

        public Builder impls(Map<Class<? extends ViewProtocol>, Class<? extends ViewProtocol>> impls) {
            this.impls = impls;
            return this;
        }

        public UIConfig build() {
            return new UIConfig(impls);
        }
    }
}
