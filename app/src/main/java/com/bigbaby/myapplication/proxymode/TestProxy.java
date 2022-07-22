package com.bigbaby.myapplication.proxymode;

import android.util.Log;

import com.bigbaby.myapplication.proxymode.dynamic.MethodInvokeControllerProxy;
import com.bigbaby.myapplication.proxymode.staticmode.IUserController;
import com.bigbaby.myapplication.proxymode.staticmode.MethodInvokeController;
import com.bigbaby.myapplication.proxymode.staticmode.NewUser;
import com.bigbaby.myapplication.proxymode.staticmode.NewUserProxy;
import com.bigbaby.myapplication.proxymode.staticmode.UserController;
import com.bigbaby.myapplication.proxymode.staticmode.UserControllerProxy;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/21
 */
public class TestProxy {

    public static void main() {

    }

    public static void testStaticMode() {
        UserControllerProxy proxy = new UserControllerProxy(new MethodInvokeController());
        proxy.register();
        proxy.login();
        NewUserProxy proxy1 = new NewUserProxy(new MethodInvokeController());
        proxy1.register();
        proxy1.login();
    }
    public static void testDynamicMode() {
        MethodInvokeControllerProxy proxy = new MethodInvokeControllerProxy(new MethodInvokeController());
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.register();
        userController.login();

        userController = (IUserController) proxy.createProxy(new NewUser());
        userController.register();
        userController.login();
    }
}
