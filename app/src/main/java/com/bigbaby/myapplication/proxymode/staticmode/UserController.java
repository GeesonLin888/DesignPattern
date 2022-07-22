package com.bigbaby.myapplication.proxymode.staticmode;

import android.util.Log;

import com.bigbaby.myapplication.base.PrintLog;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/21
 */
public class UserController implements IUserController {

    @Override
    public void login() {
        PrintLog.print("UserController login");
    }

    @Override
    public void register() {
        PrintLog.print("UserController register");
    }
}
