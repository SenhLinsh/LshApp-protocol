package com.linsh.protocol.value;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/07
 *    desc   :
 * </pre>
 */
public interface Types {

    SizeType size();

    SizeType width();

    SizeType height();

    TextType text();

    ColorType color();

    ViewType view();

    UsageType usage();

    StatusType status();

    int guessWidth();

    int guessHeight();

    int guessMargin();

    int guessPadding();

    int guessTextSize();

    int guessColor();

    int guessBgColor();

    int guessTextColor();

    interface Builder {

        Builder size(SizeType type);

        Builder width(SizeType type);

        Builder height(SizeType type);

        Builder text(TextType type);

        Builder color(ColorType type);

        Builder view(ViewType type);

        Builder usage(UsageType type);

        Builder status(StatusType type);

        Types build();
    }
}
