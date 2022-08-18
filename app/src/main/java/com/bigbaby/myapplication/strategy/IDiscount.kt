package com.bigbaby.myapplication.strategy

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/17
 */
open interface IDiscount {
    fun discount(price : Double) : Double
}