package com.bigbaby.myapplication

import com.bigbaby.myapplication.bridgemode.TestBridgeMode
import com.bigbaby.myapplication.proxymode.TestProxy
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_proxy_static_mode() {
        TestProxy.testStaticMode();
    }

    @Test
    fun test_bridge_mode() {
        TestBridgeMode.testBridge();
    }
}