package com.linsh.protocol.db;

import com.linsh.protocol.Result;
import com.linsh.protocol.Task;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/12
 *    desc   :
 * </pre>
 */
public interface DbManager {

    <T> QueryBuilder<T> query(Class<T> clazz);

    <T> Task<List<T>> queryAll(Class<T> clazz);

    Task<Result> update(Object entity);

    Task<Result> delete(Object entity);

    <T> Task<Result> deleteById(Class<T> clazz, Object value);

    <T> Task<Result> deleteByKey(Class<T> clazz, String fieldName, Object value);

    <T> Task<Result> deleteAll(List<T> entities);

    Task<Result> deleteAll(Class<?> clazz);

    Task<Result> insert(Object entity);

    Task<Result> insert(List<?> entities);

    Task<Result> insertOrUpdate(Object entity);

    Task<Result> insertOrUpdate(List<?> entities);
}
