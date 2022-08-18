package com.bigbaby.myapplication.strategy

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/17
 */
open class EightDotFiveDiscount : IDiscount {
    override fun discount(price: Double): Double {
        return price * 0.85
    }
}