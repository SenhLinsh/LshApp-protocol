package com.linsh.protocol.log;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/12
 *    desc   :
 * </pre>
 */
public interface LogManager {

    LogTracer trace();

    LogPrinter print();

    Logger log();
}
