package com.linsh.protocol.db;


import com.linsh.protocol.Result;
import com.linsh.protocol.Task;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/12
 *    desc   :
 * </pre>
 */
public interface DbConfigManager {

    Task<String> get(String key);

    <T> Task<T> getJson(Class<T> classOfJson);

    <T> Task<T> getJson(String key, Class<T> classOfJson);

    Task<Result> put(String key, String value);

    <T> Task<Result> putJson(T json);

    <T> Task<Result> putJson(String key, T json);

    Task<Result> remove(String key);

    Task<Result> remove(Class<?> key);
}
