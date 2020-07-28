package com.zoe.tecsun.crud.test.printer;

import com.zoe.tecsun.crud.test.IPrinter;

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
public class MedicalPrinter implements IPrinter {
    @Override
    public String print() {
        return "瓶签打印机";
    }
}
