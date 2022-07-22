package com.bigbaby.myapplication.bridgemode;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/22
 */
public class WarnNotificationLevel extends BaseNotificationLevel {

    public WarnNotificationLevel(IMsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        sender.send("Warn " + msg);
    }
}
