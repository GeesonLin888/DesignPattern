package com.bigbaby.myapplication.responsibilitychainmode

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/18
 */
object ResponsibilityChainMode {

    fun testResponsibilityChainMode() {
        var interceptor = InterceptorChain()
        interceptor.addInterceptor(BridgeInterceptor())
        interceptor.addInterceptor(CacheInterceptor())
        interceptor.addInterceptor(NetInterceptor())
        interceptor.process()
    }

}