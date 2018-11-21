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

    /**
     * 管理配置数据
     */
    DbConfigManager config();

    <T> QueryBuilder<T> query(Class<T> clazz);

    <T> Task<List<T>> queryAll(Class<T> clazz);

    Task<Result> update(Object entity);

    Task<Result> delete(Object entity);

    Task<Result> deleteAll(List<?> entity);

    Task<Result> deleteAll(Class<?> clazz);

    Task<Result> insert(Object entity);

    Task<Result> insert(List<Object> entity);

    Task<Result> insertOrUpdate(Object entity);

    Task<Result> insertOrUpdate(List<Object> entity);
}
