package com.bigbaby.myapplication.bridgemode;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/22
 */
public abstract class BaseNotificationLevel {
    protected IMsgSender sender;

    public BaseNotificationLevel(IMsgSender msgSender) {
        sender = msgSender;
    }

    /**
     * 通知
     * @param msg
     */
    public abstract void notify(String msg);

}
