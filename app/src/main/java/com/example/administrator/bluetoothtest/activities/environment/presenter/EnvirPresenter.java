package com.example.administrator.bluetoothtest.activities.environment.presenter;

import com.example.administrator.bluetoothtest.activities.environment.view.EnvirView;
import com.example.administrator.bluetoothtest.mvp.model.MyModel;
import com.example.administrator.bluetoothtest.mvp.presenter.Presenter;

import static com.example.administrator.bluetoothtest.ApplicationUtil.MODE;
import static com.example.administrator.bluetoothtest.ApplicationUtil.acceptThread;
import static com.example.administrator.bluetoothtest.ApplicationUtil.connectThread;

public class EnvirPresenter extends Presenter<EnvirView> {
    public EnvirPresenter(MyModel model) {
        super(model);
    }


    /******************************Socket通讯******************************/

    public void write(String data) {
        if (MODE.isNull()) {
            return;
        } else if (MODE.isServer()) {
            acceptThread.getMsg().sendData(data);
        } else if (MODE.isClient()) {
            connectThread.getMsg().sendData(data);
        }
    }


}
