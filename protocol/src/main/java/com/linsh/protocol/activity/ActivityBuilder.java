package com.linsh.protocol.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/05
 *    desc   :
 * </pre>
 */
public interface ActivityBuilder {

    ActivityBuilder target(Class<? extends Activity> activity);

    ActivityBuilder target(String className);

    ActivityBuilder targetInPath(String path);

    ActivityBuilder putExtra(String... values);

    ActivityBuilder putExtra(int... values);

    ActivityBuilder putExtra(long... values);

    ActivityBuilder putExtra(float... values);

    ActivityBuilder putExtra(double... values);

    ActivityBuilder putExtra(boolean... values);

    ActivityBuilder putExtra(Serializable... values);

    ActivityBuilder putExtra(Parcelable... values);

    ActivityBuilder putJsonExtra(Object... values);

    ActivityBuilder setData(Uri data);

    ActivityBuilder setAction(String action);

    ActivityBuilder setType(String type);

    ActivityBuilder setDataAndType(Uri data, String type);

    ActivityBuilder addFlags(int flags);

    ActivityBuilder addCategory(String category);

    ActivityBuilder newTask();

    ActivityBuilder subscribe(Class<? extends ActivitySubscribe> subscriber);

    Intent getIntent();

    void start();

    void start(Activity activity);

    void startForResult(Activity activity);

    void startForResult(ActivitySubscribe.OnActivityResult subscriber);
}
