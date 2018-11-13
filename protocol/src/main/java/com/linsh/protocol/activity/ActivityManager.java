package com.linsh.protocol.activity;

import android.app.Activity;
import android.content.Intent;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/06
 *    desc   :
 * </pre>
 */
public interface ActivityManager {

    ActivityDelegate target(Activity activity);

    ActivityBuilder build();

    ActivityBuilder build(Class<? extends Activity> target);

    ActivityBuilder build(Intent intent);
}
