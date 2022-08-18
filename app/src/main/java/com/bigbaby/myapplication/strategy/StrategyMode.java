package com.bigbaby.myapplication.strategy;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/17
 */
public class StrategyMode {
    /**
     * 衣服打折：1件9折、2件8.5折、3件8折。。。
     */
    public static void testStrategy() {
        SellManager sellManager = new SellManager();
        double d = sellManager.getTotalPrice(200, 1);
        System.out.println(d);
        double d1 = sellManager.getTotalPrice(200, 2);
        System.out.println(d1);
        double d2 = sellManager.getTotalPrice(200, 3);
        System.out.println(d2);
        double d3 = sellManager.getTotalPrice(200, 4);
        System.out.println(d3);
    }
}
