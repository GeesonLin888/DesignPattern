package com.bigbaby.myapplication.strategy

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/17
 */
open class SellManager {

    fun getTotalPrice(totalPrice : Double, num : Int) : Double {
        val discount : IDiscount = DiscountFactory.getDiscount(num)
//        discount = if (num == 1) {
//            NineDiscount()
//        } else if (num == 2) {
//            EightDotFiveDiscount()
//        } else if (num == 3) {
//            EightDiscount()
//        } else {
//            FiveDiscount()
//        }
        return discount.discount(totalPrice)
    }

}