package com.linsh.protocol.db;

import com.linsh.protocol.Task;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/20
 *    desc   :
 * </pre>
 */
public interface QueryBuilder<T> {

    QueryBuilder equalTo(String fieldName, Object value);

    QueryBuilder notEqualTo(String fieldName, Object value);

    QueryBuilder in(String fieldName, Object... values);

    <R extends Number> QueryBuilder greaterThan(String fieldName, R value);

    <R extends Number> QueryBuilder greaterThanOrEqualTo(String fieldName, R value);

    <R extends Number> QueryBuilder lessThan(String fieldName, R value);

    <R extends Number> QueryBuilder lessThanOrEqualTo(String fieldName, R value);

    <R extends Number> QueryBuilder between(String fieldName, R from, R to);

    QueryBuilder contains(String fieldName, String value);

    QueryBuilder beginsWith(String fieldName, String value);

    QueryBuilder beginsWith(String fieldName, String value, boolean isCaseSensitive);

    QueryBuilder endsWith(String fieldName, String value);

    QueryBuilder endsWith(String fieldName, String value, boolean isCaseSensitive);

    QueryBuilder like(String fieldName, String value);

    QueryBuilder like(String fieldName, String value, boolean isCaseSensitive);

    QueryBuilder distinct(String fieldName);

    QueryBuilder isNull(String fieldName);

    QueryBuilder isNotNull(String fieldName);

    QueryBuilder isEmpty(String fieldName);

    QueryBuilder isNotEmpty(String fieldName);

    QueryBuilder sortAsc(String fieldName);

    QueryBuilder sortAsc(String fieldName1, String fieldName2);

    QueryBuilder sortDesc(String fieldName);

    QueryBuilder sortDesc(String fieldName1, String fieldName2);

    QueryBuilder not();

    QueryBuilder and();

    QueryBuilder or();

    QueryBuilder beginGroup();

    QueryBuilder endGroup();

    Task<Long> count();

    Task<Number> max(String fieldName);

    Task<Number> min(String fieldName);

    Task<Number> sum(String fieldName);

    Task<Double> average(String fieldName);

    Task<T> findFirst();

    Task<List<T>> findAll();
}
