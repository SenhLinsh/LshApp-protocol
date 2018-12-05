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

    <V extends ViewProtocol> V getProtocol(Class<V> protocol);

    <V extends ViewProtocol> V getProtocol(Class<V> protocol, String key);

    <V extends View> ViewProtocol<V> view(V view);

    ViewProtocol inflate(int layout, Context context);

    ViewProtocol inflate(int layout, ViewGroup parent);

    ViewProtocol inflate(int layout, ViewGroup parent, boolean attach);
}
