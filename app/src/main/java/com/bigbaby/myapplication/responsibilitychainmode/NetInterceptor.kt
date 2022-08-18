package com.bigbaby.myapplication.responsibilitychainmode

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/18
 */
class NetInterceptor : Interceptor() {
    override fun interceptor() {
        // 需要做的事情
        println("NetInterceptor")
        // 然后调用下一个 Interceptor
        if (mInterceptor != null) {
            mInterceptor?.interceptor()
        }
    }
}