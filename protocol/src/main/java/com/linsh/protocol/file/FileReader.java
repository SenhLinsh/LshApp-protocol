package com.linsh.protocol.file;

import com.linsh.protocol.Callback;
import com.linsh.protocol.Consumer;

import java.io.BufferedReader;
import java.util.List;

import io.reactivex.Flowable;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface FileReader {

    Flowable<String> read();

    Flowable<List<String>> readLines();

    <T> Flowable<T> readJson(Class<T> classOfT);

    void read(Consumer<BufferedReader> callable);

    void read(Callback<String> callback);

    <T> void readLines(Callback<List<T>> callback);

    <T> void readJson(Callback<T> callback);

    String readBlocked();

    String readLinesBlocked();

    <T> T readJsonBlocked(Class<T> classOfT);

    BufferedReader reader();
}
