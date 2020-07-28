package com.zoe.tecsun.crud.test;

import com.zoe.tecsun.crud.test.printer.A4Print;
import com.zoe.tecsun.crud.test.proxy.ProxyHandler;

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
public class Test {
    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        IPrinter iPrinter  = (IPrinter) proxyHandler.proxyInstance(new A4Print());
        iPrinter.print();
    }
}
