package com.example.administrator.bluetoothtest.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.administrator.bluetoothtest.ApplicationUtil;
import com.example.administrator.bluetoothtest.mvp.presenter.Presenter;
import com.example.administrator.bluetoothtest.mvp.view.BaseActivity;
import com.example.administrator.bluetoothtest.mysocket.Task.TaskHandler;

public abstract class BluetoothActivity<P extends Presenter> extends BaseActivity<P> {
    protected abstract TaskHandler initMode();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (ApplicationUtil.MODE.isNull()) return;

        TaskHandler taskHandler = initMode();

        if (ApplicationUtil.MODE.isClient()) {
            ApplicationUtil.connectThread.getMsg().getCounter().setHandler(taskHandler);
        }else if (ApplicationUtil.MODE.isServer()){
            ApplicationUtil.connectThread.getMsg().getCounter().setHandler(taskHandler);
        }
    }
}
