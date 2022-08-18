package com.bigbaby.myapplication.strategy

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/17
 */
object DiscountFactory {

    var nineDiscount : IDiscount = NineDiscount()
    var eightDotFiveDiscount : IDiscount = EightDotFiveDiscount()
    var eightDiscount : IDiscount = EightDiscount()
    var fiveDiscount : IDiscount = FiveDiscount()

//    fun getDiscount(num : Int) : IDiscount {
//        return if (num == 1) {
//            NineDiscount()
//        } else if (num == 2) {
//            EightDotFiveDiscount()
//        } else if (num == 3) {
//            EightDiscount()
//        } else {
//            FiveDiscount()
//        }
//    }

    fun getDiscount(num: Int) = when(num) {
        1 -> nineDiscount
        2 -> eightDotFiveDiscount
        3 -> eightDiscount
        else -> fiveDiscount
    }

}