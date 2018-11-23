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
public class LogConfig {

    private final File cacheDir;
    private final boolean open;

    private LogConfig(File cacheDir, boolean open) {
        this.cacheDir = cacheDir;
        this.open = open;
    }

    public File cacheDir() {
        return cacheDir;
    }

    public boolean open() {
        return open;
    }

    public static class Builder {

        private File cacheDir;
        private boolean open;

        public Builder cacheDir(File cacheDir) {
            this.cacheDir = cacheDir;
            return this;
        }

        public Builder open(boolean open) {
            this.open = open;
            return this;
        }

        public LogConfig build() {
            return new LogConfig(cacheDir, open);
        }
    }
}