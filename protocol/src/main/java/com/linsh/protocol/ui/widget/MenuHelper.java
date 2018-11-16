package com.linsh.protocol.ui.widget;

import android.view.MenuItem;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/17
 *    desc   :
 * </pre>
 */
public interface MenuHelper {

    MenuItem addItem(CharSequence title);

    MenuItem addItem(CharSequence title, int icon);

    ItemBuilder build();

    ItemBuilder build(CharSequence title);

    interface ItemBuilder {

        ItemBuilder setGroupId(int id);

        ItemBuilder setOrder(int order);

        ItemBuilder setTitle(CharSequence title);

        ItemBuilder setIcon(int icon);

        /**
         * @param actionEnum {@link MenuItem#SHOW_AS_ACTION_ALWAYS},
         *                   {@link MenuItem#SHOW_AS_ACTION_IF_ROOM},
         *                   {@link MenuItem#SHOW_AS_ACTION_NEVER}.
         */
        ItemBuilder setShowAsAction(int actionEnum);

        MenuHelper add();
    }
}
