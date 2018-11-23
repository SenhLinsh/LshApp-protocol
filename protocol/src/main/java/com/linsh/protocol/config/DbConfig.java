package com.linsh.protocol.config;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/22
 *    desc   :
 * </pre>
 */
public class DbConfig {

    private final String fieldNameForId;

    private DbConfig(String fieldNameForId) {
        this.fieldNameForId = fieldNameForId;
    }

    public String fieldNameForId() {
        return fieldNameForId;
    }

    public static class Builder {

        private String fieldNameForId;

        public Builder() {
        }

        public Builder fieldNameForId(String fieldNameForId) {
            this.fieldNameForId = fieldNameForId;
            return this;
        }

        public DbConfig build() {
            return new DbConfig(fieldNameForId);
        }
    }
}