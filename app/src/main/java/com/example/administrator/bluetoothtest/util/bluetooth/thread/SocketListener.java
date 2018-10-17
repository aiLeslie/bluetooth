package com.example.administrator.bluetoothtest.util.bluetooth.thread;

public interface SocketListener<M> {
    void onSucceed(final M m);
    void onFail(final M m);
}
