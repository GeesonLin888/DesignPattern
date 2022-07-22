package com.bigbaby.myapplication.bridgemode;

import com.bigbaby.myapplication.base.PrintLog;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/22
 */
public class TelephoneMessageSender implements IMsgSender {

    @Override
    public void send(String msg) {
        PrintLog.print("TelephoneMessageSender send : " + msg);
    }
}
