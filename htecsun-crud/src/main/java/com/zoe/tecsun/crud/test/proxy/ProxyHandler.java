package com.zoe.tecsun.crud.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-18
 */
public class ProxyHandler implements InvocationHandler {
    private Object targetObject;

    /**
     *
     * @param targetObject 要增强的对象
     * @return
     */
    public Object proxyInstance(Object targetObject){
        //被代理对象的类加载器
        this.targetObject = targetObject;
        ClassLoader classLoader = targetObject.getClass().getClassLoader();
        //被代理对象视线的接口
        Class<?>[] interfaces = targetObject.getClass().getInterfaces();
        System.out.println("类加载器"+classLoader);
        System.out.println("接口"+interfaces);

        //this：也就是当前对象即实现了InvocationHandler接口的类的对象，在调用方法时会调用它的invoke方法
       return Proxy.newProxyInstance(classLoader,interfaces,this);
    }


    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
     @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         System.out.println("打印日志");
        return method.invoke(targetObject,args);
    }
}
