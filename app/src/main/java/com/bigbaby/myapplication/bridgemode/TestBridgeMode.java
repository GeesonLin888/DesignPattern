package com.bigbaby.myapplication.bridgemode;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/22
 */
public class TestBridgeMode {

    public static void testBridge() {
        BaseNotificationLevel notificationLevel = new NormalNotificationLevel(new WeChatMessageSender());
        notificationLevel.notify("hahahhahah");
        notificationLevel = new ErrorNotificationLevel(new EmailMessageSender());
        notificationLevel.notify("Is it not sure?");
    }

}
