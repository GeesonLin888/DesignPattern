package com.bigbaby.myapplication.proxymode.staticmode;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/21
 */
public class NewUserProxy extends NewUser {
    private MethodInvokeController mController;

    public NewUserProxy(MethodInvokeController controller) {
        mController = controller;
    }

    @Override
    public void register() {
        super.register();
        mController.invokeMethod("register");
    }

    @Override
    public void login() {
        super.login();
        mController.invokeMethod("login");
    }
}
