package com.bigbaby.myapplication.proxymode.staticmode;

import android.util.Log;

import com.bigbaby.myapplication.base.PrintLog;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/21
 */
public class NewUser implements IUserController {

    @Override
    public void login() {
        PrintLog.print("NewUser login");
    }

    @Override
    public void register() {
        PrintLog.print("NewUser register");
    }
}
