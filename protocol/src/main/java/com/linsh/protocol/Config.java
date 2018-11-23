package com.linsh.protocol;

import com.linsh.protocol.config.DbConfig;
import com.linsh.protocol.config.FileConfig;
import com.linsh.protocol.config.HttpConfig;
import com.linsh.protocol.config.ImageConfig;
import com.linsh.protocol.config.LogConfig;
import com.linsh.protocol.config.ThreadConfig;
import com.linsh.protocol.config.UIConfig;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/23
 *    desc   :
 * </pre>
 */
public class Config {

    private final DbConfig db;
    private final FileConfig file;
    private final HttpConfig http;
    private final ImageConfig image;
    private final LogConfig log;
    private final ThreadConfig thread;
    private final UIConfig ui;

    private Config(DbConfig db, FileConfig file, HttpConfig http, ImageConfig image, LogConfig log, ThreadConfig thread, UIConfig ui) {
        this.db = db;
        this.file = file;
        this.http = http;
        this.image = image;
        this.log = log;
        this.thread = thread;
        this.ui = ui;
    }

    public DbConfig db() {
        return db;
    }

    public FileConfig file() {
        return file;
    }

    public HttpConfig http() {
        return http;
    }

    public ImageConfig image() {
        return image;
    }

    public LogConfig log() {
        return log;
    }

    public ThreadConfig thread() {
        return thread;
    }

    public UIConfig ui() {
        return ui;
    }

    public static class Builder {

        private DbConfig db;
        private FileConfig file;
        private HttpConfig http;
        private ImageConfig image;
        private LogConfig log;
        private ThreadConfig thread;
        private UIConfig ui;

        public Builder db(DbConfig db) {
            this.db = db;
            return this;
        }

        public Builder file(FileConfig file) {
            this.file = file;
            return this;
        }

        public Builder http(HttpConfig http) {
            this.http = http;
            return this;
        }

        public Builder image(ImageConfig image) {
            this.image = image;
            return this;
        }

        public Builder log(LogConfig log) {
            this.log = log;
            return this;
        }

        public Builder thread(ThreadConfig thread) {
            this.thread = thread;
            return this;
        }

        public Builder ui(UIConfig ui) {
            this.ui = ui;
            return this;
        }

        public Config build() {
            return new Config(db, file, http, image, log, thread, ui);
        }
    }
}
