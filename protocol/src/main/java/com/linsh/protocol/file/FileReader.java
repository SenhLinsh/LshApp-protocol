package com.linsh.protocol.file;

import android.graphics.Bitmap;

import com.linsh.protocol.Consumer;
import com.linsh.protocol.Task;

import java.io.BufferedReader;
import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface FileReader {

    void reader(Consumer<BufferedReader> callable);

    BufferedReader reader();

    Task<String> read();

    Task<List<String>> readLines();

    <T> Task<T> readJson(Class<T> classOfT);

    Task<Bitmap> readBitmap();

    Task<byte[]> readBytes();
}
