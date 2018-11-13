package com.linsh.protocol.file;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/04
 *    desc   :
 * </pre>
 */
public interface PermissionCallback {

    void onGranted(String permission);

    void onDenied(String permission, boolean isNeverAsked);

    /**
     * 当前系统版本在为 Android M (6.0) 以下, 无法得知是否拥有该权限, 需要实际运行才可得知
     */
    void onBeforeAndroidM(String permission);
}
