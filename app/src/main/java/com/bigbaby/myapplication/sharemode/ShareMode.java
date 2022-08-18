package com.bigbaby.myapplication.sharemode;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/30
 */
public class ShareMode {

    public static void test() {
        Integer i1 = 68; // 自动装箱，使用 Integer.valueOf(int i)
        Integer i2 = 68;
        Integer i3 = 168;
        Integer i4 = 168;

        System.out.println(i1 == i2); // true
        System.out.println(i3 == i4); // false

        String s1 = "cong";
        String s2 = "cong";

        System.out.println(s1 == s2);
    }
}
