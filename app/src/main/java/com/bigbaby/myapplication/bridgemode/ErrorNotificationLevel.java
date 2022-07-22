package com.bigbaby.myapplication.bridgemode;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/22
 */
public class ErrorNotificationLevel extends BaseNotificationLevel {

    public ErrorNotificationLevel(IMsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        sender.send("Error " + msg);
    }
}
