package com.linsh.protocol.value;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/07
 *    desc   :
 * </pre>
 */
public interface ValueBuilder {

    ValueBuilder size(SizeType type);

    ValueBuilder width(SizeType type);

    ValueBuilder height(SizeType type);

    ValueBuilder text(TextType type);

    ValueBuilder color(ColorType type);

    ValueBuilder view(ViewType type);

    ValueBuilder usage(UsageType type);

    ValueBuilder status(UsageType type);

    Types build();
}
