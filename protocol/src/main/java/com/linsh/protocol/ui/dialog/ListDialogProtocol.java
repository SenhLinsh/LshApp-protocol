package com.linsh.protocol.ui.dialog;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface ListDialogProtocol extends BaseDialogProtocol<ListDialogProtocol> {

    ListDialogProtocol singleChoice();

    ListDialogProtocol singleChoice(int checkedItem);

    ListDialogProtocol multiChoice();

    ListDialogProtocol multiChoice(boolean[] checkedItems);

    ListDialogProtocol setItems(CharSequence[] list);

    ListDialogProtocol setItems(CharSequence[] list, OnItemClickListener listener);

    ListDialogProtocol setItems(List<? extends CharSequence> list);

    ListDialogProtocol setItems(List<? extends CharSequence> list, OnItemClickListener listener);

    ListDialogProtocol setItems(RecyclerView.Adapter<?> adapter);

    ListDialogProtocol setOnItemClickListener(OnItemClickListener listener);

    interface OnItemClickListener {
        void onItemClick(ListDialogProtocol dialogHelper, int index);
    }
}
