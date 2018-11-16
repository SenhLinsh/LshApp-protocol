package com.linsh.protocol.ui.view;

import android.view.View;
import android.view.ViewGroup;

import com.linsh.protocol.value.Types;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface ViewManager {

    ImageViewHelper image();

    ImageViewHelper image(Types types);

    EditTextHelper input();

    EditTextHelper input(Types types);

    TextViewHelper text();

    TextViewHelper text(Types types);

    ViewHelper view();

    ViewHelper view(View view);

    ViewHelper view(Types types);

    ViewHelper view(View view, Types types);

    ViewHelper find(int id);

    ViewHelper inflate(int layout);

    ViewHelper inflate(int layout, ViewGroup parent);

    ViewHelper inflate(int layout, ViewGroup parent, boolean attach);
}
