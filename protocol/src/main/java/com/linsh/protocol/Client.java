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
 *    date   : 2018/10/12
 *    desc   : 客户端总控制器
 *
 *              控制器需要对客户端的各个模块进行调度, 通过抽象工厂, 将各个模块之间高度解耦, 以达到
 *              对每个模块的随时可替换操作.
 *
 *              该模式的三个核心在于:
 *                      1. 模块开发的便捷性: 项目开发, 往往需要追求效率, 在没有对 UI 定制过多的情况
 *                          下, 我们需要快速布置页面和逻辑. 特别是个人开发者, 往往对于 UI 感到头疼.
 *                          该模式便是对常规 UI 和逻辑进行协议上的规定, 我们可以通过指定任意的实现,
 *                          便可进行快速开发.
 *
 *                      2. 模块操作的统一性: 对于拥有多个项目的开发者来说, 项目之间的代码很难达到
 *                          统一和复用, 往往近期项目开发使用的新技术, 很难移植到老项目上, 因为需要
 *                          对代码进行大量的操作和变更, 容易导致老项目的技术滞流和代码老化.
 *
 *                      3. 模块实现的复用性和可替换性: 我们每写好一个模块的实现, 就可以很方便地对
 *                          原模块进行替换, 或者在下一个项目中使用.
 * </pre>
 */
public class Client {

    private static ManagerFactory factory;

    static void init(ManagerFactory factory) {
        Client.factory = factory;
    }

    public static Config config() {
        return factory.config();
    }

    public static ActivityManager activity() {
        return factory.activity();
    }

    public static DbManager db() {
        return factory.db();
    }

    public static DbManager db(DbConfig config) {
        return factory.db(config);
    }

    public static FileManager file() {
        return factory.file();
    }

    public static FileManager file(FileConfig config) {
        return factory.file(config);
    }

    public static HttpManager http() {
        return factory.http();
    }

    public static HttpManager http(HttpConfig config) {
        return factory.http(config);
    }

    public static ImageManager image() {
        return factory.image();
    }

    public static ImageManager image(ImageConfig config) {
        return factory.image(config);
    }

    public static LogManager log() {
        return factory.log();
    }

    public static LogManager log(LogConfig config) {
        return factory.log(config);
    }

    public static ThreadManager thread() {
        return factory.thread();
    }

    public static ThreadManager thread(ThreadConfig config) {
        return factory.thread(config);
    }

    public static UIManager ui() {
        return factory.ui();
    }

    public static UIManager ui(UIConfig config) {
        return factory.ui(config);
    }

    public static ValueManager value() {
        return factory.value();
    }

    public static ValueManager value(ValueConfig config) {
        return factory.value(config);
    }
}
