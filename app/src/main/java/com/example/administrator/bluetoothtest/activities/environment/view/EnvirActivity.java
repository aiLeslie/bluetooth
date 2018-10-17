package com.example.administrator.bluetoothtest.activities.environment.view;

import android.os.Bundle;

import com.example.administrator.bluetoothtest.R;
import com.example.administrator.bluetoothtest.activities.BluetoothActivity;
import com.example.administrator.bluetoothtest.activities.environment.presenter.EnvirPresenter;
import com.example.administrator.bluetoothtest.handle.EnvirHandle;
import com.example.administrator.bluetoothtest.mysocket.Task.TaskHandler;

import java.util.List;

public class EnvirActivity extends BluetoothActivity<EnvirPresenter> implements EnvirView {


    @Override
    protected EnvirPresenter createPresenter() {
        return null;
    }

    @Override
    protected TaskHandler initMode() {
        return new EnvirHandle();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envir);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showInfos(List infos) {

    }

    @Override
    public void warning() {



    }

    @Override
    public void stopWarning() {

    }
}
