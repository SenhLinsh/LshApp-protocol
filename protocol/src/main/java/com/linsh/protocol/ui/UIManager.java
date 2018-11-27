package com.linsh.protocol.ui;

import android.app.Activity;

import com.linsh.protocol.ui.dialog.DialogManager;
import com.linsh.protocol.ui.layout.LayoutManager;
import com.linsh.protocol.ui.popup.PopupWindowManager;
import com.linsh.protocol.ui.toast.ToastManager;
import com.linsh.protocol.ui.view.ViewManager;
import com.linsh.protocol.ui.widget.WidgetManager;
import com.linsh.protocol.ui.window.WindowManager;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2018/10/12
 *    desc   :
 * </pre>
 */
public interface UIManager {

    DialogManager dialog(Activity activity);

    LayoutManager layout(Activity activity);

    PopupWindowManager popup(Activity activity);

    ToastManager toast();

    ViewManager view(Activity activity);

    WidgetManager widget(Activity activity);

    WindowManager window();
}
