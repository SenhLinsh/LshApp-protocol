package com.linsh.protocol.config;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/22
 *    desc   :
 * </pre>
 */
public class HttpConfig {

    private final String baseUrl;

    private HttpConfig(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String baseUrl() {
        return baseUrl;
    }

    public static class Builder {

        private String baseUrl;

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public HttpConfig build() {
            return new HttpConfig(baseUrl);
        }
    }
}
