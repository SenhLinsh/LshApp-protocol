package com.linsh.protocol.file;

import android.app.Activity;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface FileManager {

    FileBuilder path(String path);

    FileBuilder sd(String filename);

    FileBuilder app(String filename);

    FileBuilder data(String filename);

    FileBuilder cache(String filename);

    boolean checkPermission();

    void checkOrRequestPermission(Activity activity);

    void checkOrRequestPermission(Activity activity, PermissionCallback callback);

    void requestPermission(Activity activity);
}
