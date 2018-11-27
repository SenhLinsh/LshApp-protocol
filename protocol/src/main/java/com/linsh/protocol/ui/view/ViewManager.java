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

    <V extends View> ViewHelper<ViewHelper, V> view(V view);

    ViewHelper view(Types types);

    <V extends View> ViewHelper<ViewHelper, V> view(V view, Types types);

    <V extends ViewGroup> ViewGroupHelper<ViewGroupHelper, V> viewGroup(V viewGroup);

    <V extends ViewGroup> ViewGroupHelper<ViewGroupHelper, V> viewGroup(V viewGroup, Types types);

    ViewHelper find(int id);

    ViewHelper inflate(int layout);

    ViewHelper inflate(int layout, ViewGroup parent);

    ViewHelper inflate(int layout, ViewGroup parent, boolean attach);
}
