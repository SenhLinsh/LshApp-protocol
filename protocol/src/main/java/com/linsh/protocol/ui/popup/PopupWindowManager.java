package com.linsh.protocol.ui.popup;

import android.view.View;
import android.widget.PopupWindow;

import com.linsh.protocol.ui.view.ViewProtocol;
import com.linsh.protocol.ui.window.WindowViewHelper;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/16
 *    desc   :
 * </pre>
 */
public interface PopupWindowManager {

    PopupWindow getWindow();

    PopupWindowManager setView(int layout);

    PopupWindowManager setView(View view);

    PopupWindowManager setView(ViewProtocol viewHelper);

    PopupWindowManager setView(WindowViewHelper helper);

    PopupWindowManager showAsDropDown(View anchor);

    PopupWindowManager showAsDropDown(View anchor, int xoff, int yoff);

    PopupWindowManager showAsDropDown(View anchor, int xoff, int yoff, int gravity);

    PopupWindowManager showAtLocation(View anchor, int gravity);

    PopupWindowManager showAtLocation(View anchor, int gravity, int xoff, int yoff);

    PopupWindowManager setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);
}
