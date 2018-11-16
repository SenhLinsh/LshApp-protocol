package com.linsh.protocol.db;


import com.linsh.protocol.TaskHolder;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/12
 *    desc   :
 * </pre>
 */
public interface DbConfigManager {

    TaskHolder<String> get(String key);

    <T> TaskHolder<T> getJson(Class<T> classOfJson);

    <T> TaskHolder<T> getJson(String key, Class<T> classOfJson);

    TaskHolder<Boolean> put(String key, String value);

    <T> TaskHolder<Boolean> putJson(T json);

    <T> TaskHolder<Boolean> putJson(String key, T json);

    TaskHolder<Boolean> remove(String key);

    TaskHolder<Boolean> remove(Class<?> key);
}
