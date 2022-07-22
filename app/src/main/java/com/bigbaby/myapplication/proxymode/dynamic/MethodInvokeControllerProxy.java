package com.bigbaby.myapplication.proxymode.dynamic;

import com.bigbaby.myapplication.proxymode.staticmode.MethodInvokeController;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/21
 */
public class MethodInvokeControllerProxy {

    private MethodInvokeController mController;

    public MethodInvokeControllerProxy(MethodInvokeController controller) {
        mController = controller;
    }

    public Object createProxy(Object proxy) {
        Class<?>[] interfaces = proxy.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxy);
        return Proxy.newProxyInstance(
                proxy.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxyObject;

        public DynamicProxyHandler(Object proxy) {
            proxyObject = proxy;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
            Object result = method.invoke(proxyObject, objects);
            mController.invokeMethod(proxyObject.getClass().getName() + method.getName());
            return result;
        }
    }
}
