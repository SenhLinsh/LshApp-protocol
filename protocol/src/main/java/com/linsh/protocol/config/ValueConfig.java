package com.linsh.protocol.config;

import com.linsh.protocol.value.ColorCreator;
import com.linsh.protocol.value.TextSizeCreator;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/11/23
 *    desc   :
 * </pre>
 */
public class ValueConfig {

    private final ColorCreator color;
    private final TextSizeCreator textSize;

    private ValueConfig(ColorCreator color, TextSizeCreator textSize) {
        this.color = color;
        this.textSize = textSize;
    }

    public ColorCreator color() {
        return color;
    }

    public TextSizeCreator textSize() {
        return textSize;
    }

    public static class Builder {

        private ColorCreator color;
        private TextSizeCreator textSize;

        public Builder color(ColorCreator color) {
            this.color = color;
            return this;
        }

        public Builder textSize(TextSizeCreator textSize) {
            this.textSize = textSize;
            return this;
        }

        public ValueConfig build() {
            return new ValueConfig(color, textSize);
        }
    }
}
