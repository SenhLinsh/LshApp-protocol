package com.linsh.protocol.file;

import com.linsh.protocol.Callback;
import com.linsh.protocol.Consumer;

import java.io.BufferedWriter;
import java.io.File;
import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/24
 *    desc   :
 * </pre>
 */
public interface FileWriter {

    BufferedWriter writer();

    FileWriter write(Consumer<BufferedWriter> callable);

    FileWriter write(String content);

    FileWriter write(String content, boolean append);

    FileWriter write(List<String> content);

    FileWriter write(List<String> content, boolean append);

    FileWriter writeLine();

    FileWriter writeLines(int lines);

    FileWriter callback(Callback<File> callback);
}
