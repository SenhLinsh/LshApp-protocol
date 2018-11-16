package com.linsh.protocol.file;

import android.graphics.Bitmap;

import com.linsh.protocol.Consumer;
import com.linsh.protocol.TaskHolder;

import java.io.BufferedWriter;
import java.io.OutputStream;
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

    void writer(Consumer<BufferedWriter> callable);

    FileWriter write(String content);

    FileWriter write(String content, boolean append);

    FileWriter write(List<String> content);

    FileWriter write(List<String> content, boolean append);

    FileWriter writeLine();

    FileWriter writeLines(int lines);

    FileWriter write(Bitmap bitmap);

    FileWriter write(byte[] bytes);

    FileWriter write(OutputStream stream);

    Task task();

    interface Task extends TaskHolder<Boolean> {

        Task write(String content);

        Task write(String content, boolean append);

        Task write(List<String> content);

        Task write(List<String> content, boolean append);

        Task writeLine();

        Task writeLines(int lines);

        Task write(Bitmap bitmap);

        Task write(byte[] bytes);

        Task write(OutputStream stream);
    }
}
