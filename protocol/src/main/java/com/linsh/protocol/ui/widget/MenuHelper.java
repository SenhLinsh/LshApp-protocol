package com.linsh.protocol.ui.widget;

import android.view.MenuItem;

import com.linsh.protocol.ui.OnClickListener;
import com.linsh.protocol.ui.OnItemClickListener;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/17
 *    desc   :
 * </pre>
 */
public interface MenuHelper {

    MenuHelper addItem(CharSequence title);

    MenuHelper addItem(CharSequence title, OnClickListener<MenuItem> listener);

    MenuHelper addItems(CharSequence[] titles);

    MenuHelper addItems(CharSequence[] titles, OnItemClickListener<MenuItem> listener);

    MenuHelper addItems(List<? extends CharSequence> titles);

    MenuHelper addItems(List<? extends CharSequence> titles, OnItemClickListener<MenuItem> listener);

    MenuHelper setOnMenuItemClickListener(OnItemClickListener<MenuItem> listener);

    ItemBuilder build();

    ItemBuilder build(CharSequence title);

    interface ItemBuilder {

        ItemBuilder setGroupId(int id);

        ItemBuilder setItemId(int id);

        ItemBuilder setOrder(int order);

        ItemBuilder setTitle(CharSequence title);

        ItemBuilder setIcon(int icon);

        /**
         * @param actionEnum {@link MenuItem#SHOW_AS_ACTION_ALWAYS},
         *                   {@link MenuItem#SHOW_AS_ACTION_IF_ROOM},
         *                   {@link MenuItem#SHOW_AS_ACTION_NEVER}.
         */
        ItemBuilder setShowAsAction(int actionEnum);

        ItemBuilder setOnClickListener(OnClickListener<MenuItem> listener);

        MenuHelper add();
    }
}
