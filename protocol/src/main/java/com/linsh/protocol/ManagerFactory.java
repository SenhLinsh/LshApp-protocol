package com.linsh.protocol;

import com.linsh.protocol.activity.ActivityManager;
import com.linsh.protocol.config.DbConfig;
import com.linsh.protocol.config.FileConfig;
import com.linsh.protocol.config.HttpConfig;
import com.linsh.protocol.config.ImageConfig;
import com.linsh.protocol.config.LogConfig;
import com.linsh.protocol.config.ThreadConfig;
import com.linsh.protocol.config.UIConfig;
import com.linsh.protocol.config.ValueConfig;
import com.linsh.protocol.db.DbManager;
import com.linsh.protocol.file.FileManager;
import com.linsh.protocol.http.HttpManager;
import com.linsh.protocol.image.ImageManager;
import com.linsh.protocol.log.LogManager;
import com.linsh.protocol.thread.ThreadManager;
import com.linsh.protocol.ui.UIManager;
import com.linsh.protocol.value.ValueManager;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/23
 *    desc   : 各个管理器的生产者
 * </pre>
 */
public interface ManagerFactory {

    Config config();

    ActivityManager activity();

    DbManager db();

    DbManager db(DbConfig config);

    FileManager file();

    FileManager file(FileConfig config);

    HttpManager http();

    HttpManager http(HttpConfig config);

    ImageManager image();

    ImageManager image(ImageConfig config);

    LogManager log();

    LogManager log(LogConfig config);

    ThreadManager thread();

    ThreadManager thread(ThreadConfig config);

    UIManager ui();

    UIManager ui(UIConfig config);

    ValueManager value();

    ValueManager value(ValueConfig config);
}
