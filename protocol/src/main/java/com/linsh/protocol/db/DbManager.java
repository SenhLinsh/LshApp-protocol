package com.linsh.protocol.db;

import com.linsh.protocol.Result;
import com.linsh.protocol.TaskHolder;

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

    <T> TaskHolder<List<T>> queryAll(Class<T> clazz);

    TaskHolder<Result> update(Object entity);

    TaskHolder<Result> delete(Object entity);

    TaskHolder<Result> deleteAll(List<?> entity);

    TaskHolder<Result> deleteAll(Class<?> clazz);

    TaskHolder<Result> insert(Object entity);

    TaskHolder<Result> insert(List<Object> entity);

    TaskHolder<Result> insertOrUpdate(Object entity);

    TaskHolder<Result> insertOrUpdate(List<Object> entity);
}
