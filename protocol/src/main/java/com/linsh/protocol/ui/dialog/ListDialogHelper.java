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
public interface ListDialogHelper extends DialogHelper<ListDialogHelper> {

    ListDialogHelper singleChoice();

    ListDialogHelper singleChoice(int checkedItem);

    ListDialogHelper multiChoice();

    ListDialogHelper multiChoice(boolean[] checkedItems);

    ListDialogHelper setItems(CharSequence[] list);

    ListDialogHelper setItems(CharSequence[] list, OnItemClickListener listener);

    ListDialogHelper setItems(List<? extends CharSequence> list);

    ListDialogHelper setItems(List<? extends CharSequence> list, OnItemClickListener listener);

    ListDialogHelper setItems(RecyclerView.Adapter<?> adapter);

    ListDialogHelper setOnItemClickListener(OnItemClickListener listener);

    interface OnItemClickListener {
        void onItemClick(ListDialogHelper dialogHelper, int index);
    }
}
