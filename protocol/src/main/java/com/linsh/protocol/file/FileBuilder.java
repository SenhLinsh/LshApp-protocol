package com.linsh.protocol.file;

import com.linsh.protocol.Callback;

import java.io.File;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/24
 *    desc   :
 * </pre>
 */
public interface FileBuilder {

    FileBuilder parent(String name);

    FileBuilder child(String name);

    FileBuilder external(boolean external);

    FileBuilder external(boolean external, boolean force);

    FileBuilder makeDirs();

    FileBuilder makeParentDirs();

    File file();

    File[] listFiles();

    FileReader read();

    FileWriter write();

    boolean delete();

    void deleteAll(Callback<File> callback);
}
