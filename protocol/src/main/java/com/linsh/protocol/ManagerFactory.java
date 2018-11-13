package com.linsh.protocol;

import com.linsh.protocol.db.DBManager;
import com.linsh.protocol.file.FileManager;
import com.linsh.protocol.http.HttpManager;
import com.linsh.protocol.image.ImageManager;
import com.linsh.protocol.log.LogManager;
import com.linsh.protocol.thread.ThreadManager;
import com.linsh.protocol.ui.UIManager;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/23
 *    desc   : 各个管理器的生产者
 * </pre>
 */
public interface ManagerFactory {

    DBManager db();

    DBManager db(Config config);

    FileManager file();

    FileManager file(Config config);

    HttpManager http();

    HttpManager http(Config config);

    ImageManager image();

    ImageManager image(Config config);

    LogManager log();

    LogManager log(Config config);

    ThreadManager thread();

    ThreadManager thread(Config config);

    UIManager ui();

    UIManager ui(Config config);
}
