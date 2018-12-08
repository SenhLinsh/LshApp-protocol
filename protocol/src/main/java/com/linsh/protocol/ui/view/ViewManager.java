package com.linsh.protocol.ui.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface ViewManager {

    <V extends ViewProtocol> V findProtocol(Activity activity, Class<V> protocol);

    <V extends ViewProtocol> V findProtocol(Activity activity, Class<V> protocol, String key);

    <V extends ViewProtocol> V findProtocol(View view, Class<V> protocol);

    <V extends ViewProtocol> V findProtocol(View view, Class<V> protocol, String key);

    <V extends ViewProtocol> V getProtocol(Context context, Class<V> protocol);

    <V extends ViewProtocol> V getProtocol(Context context, Class<V> protocol, String key);

    <V extends ViewProtocol> V getProtocol(ViewGroup parent, Class<V> protocol, boolean attachToRoot);

    <V extends ViewProtocol> V getProtocol(ViewGroup parent, Class<V> protocol, String key, boolean attachToRoot);

    View inflate(String layoutName, Context context);

    View inflate(String layoutName, ViewGroup parent);

    View inflate(String layoutName, ViewGroup parent, boolean attach);

    <T extends View> T findViewById(Activity activity, String id);

    <T extends View> T findViewById(View view, String id);

    Register register();
}
