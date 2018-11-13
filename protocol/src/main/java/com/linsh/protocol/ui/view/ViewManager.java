package com.linsh.protocol.ui.view;

import android.view.View;
import android.view.ViewGroup;

import com.linsh.protocol.value.Values;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface ViewManager {

    void image();

    void image(Values values);

    void input();

    void input(Values values);

    void list();

    void list(Values values);

    void text();

    void text(Values values);

    void view();

    void find(int id);

    void layout(View view);

    void layout(int layout);

    void layout(int layout, ViewGroup parent);

    void layout(int layout, ViewGroup parent, boolean attach);
}
