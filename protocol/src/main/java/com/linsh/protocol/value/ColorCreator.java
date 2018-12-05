package com.linsh.protocol.value;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/06
 *    desc   :
 * </pre>
 */
public interface ColorCreator {

    int color(String name);

    int main();

    int mainLight();

    int mainDark();

    int success();

    int warning();

    int error();

    int link();

    int title();

    int title(int bgColor);

    int subtitle();

    int subtitle(int bgColor);

    int text();

    int text(int bgColor);

    int subtext();

    int subtext(int bgColor);

    int disabled();

    int border();

    int divider();

    int background();
}
