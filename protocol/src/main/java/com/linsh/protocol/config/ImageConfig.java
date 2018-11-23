package com.linsh.protocol.config;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/22
 *    desc   :
 * </pre>
 */
public class ImageConfig {

    private final int placeholder;
    private final int error;

    private ImageConfig(int placeholder, int error) {
        this.placeholder = placeholder;
        this.error = error;
    }

    public int placeholder() {
        return placeholder;
    }

    public int error() {
        return error;
    }

    public static class Builder {

        private int placeholder;
        private int error;

        public Builder placeholder(int placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public Builder error(int error) {
            this.error = error;
            return this;
        }

        public ImageConfig build() {
            return new ImageConfig(placeholder, error);
        }
    }

}
