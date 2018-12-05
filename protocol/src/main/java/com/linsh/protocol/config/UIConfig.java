package com.linsh.protocol.config;

import java.io.File;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/22
 *    desc   :
 * </pre>
 */
public class UIConfig {

    private final File resDir;
    private final File commonResDir;

    private UIConfig(File resDir, File commonResDir) {
        this.resDir = resDir;
        this.commonResDir = commonResDir;
    }

    public File resDir() {
        return resDir;
    }

    public File commonResDir() {
        return commonResDir;
    }

    public static class Builder {

        private File resDir;
        private File commonResDir;

        public Builder resDir(File resDir) {
            this.resDir = resDir;
            return this;
        }

        public Builder commonResDir(File commonResDir) {
            this.commonResDir = commonResDir;
            return this;
        }

        public UIConfig build() {
            return new UIConfig(resDir, commonResDir);
        }
    }
}
