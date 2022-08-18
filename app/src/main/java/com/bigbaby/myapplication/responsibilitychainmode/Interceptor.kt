package com.bigbaby.myapplication.responsibilitychainmode

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/18
 */
abstract class Interceptor {

    var mInterceptor : Interceptor? = null

    fun setInterceptor(intnterceptor: Interceptor?) {
        mInterceptor = intnterceptor
    }

    abstract fun interceptor()

}