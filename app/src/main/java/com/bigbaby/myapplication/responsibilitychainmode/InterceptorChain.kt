package com.bigbaby.myapplication.responsibilitychainmode

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/18
 */
open class InterceptorChain {

    private var head : Interceptor? = null
    private var tail : Interceptor? = null

    fun addInterceptor(interceptor: Interceptor) {
        interceptor.setInterceptor(null)
        if (head == null) {
            head = interceptor
            tail = interceptor
            return
        }
        tail?.setInterceptor(interceptor)
        tail = interceptor
    }

    fun process() {
        if (head != null) {
            head?.interceptor()
        }
    }
}