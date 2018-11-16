package com.linsh.protocol;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/23
 *    desc   :
 * </pre>
 */
public interface Config {
    // common
    String COMMON_BOOLEAN_CACHED = "common_cached";
    // File
    String FILE_STRING_APP_DIR = "file_app_dir";
    // Http
    String HTTP_STRING_BASE_URL = "http_base_url";
    // Image
    String IMAGE_INT_PLACEHOLDER = "image_placeholder";
    String IMAGE_INT_ERROR = "image_error";
    // Log
    String LOG_STRING_CACHE_DIR = "log_cache_dir";
    String LOG_BOOLEAN_TOGGLE = "log_toggle";

    Config put(String key, Object value);

    <T> T get(String key);

    <T> T getOrDefault(String key, T defaultValue);

    int getInt(String key);

    long getLong(String key);

    String getString(String key);

    boolean getBoolean(String key);

    float getFloat(String key);

    double getDouble(String key);

    char getChar(String key);

    class Builder {

        public static Config create() {
            return new ConfigImpl();
        }
    }
}
