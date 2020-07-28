package com.zoe.tecsun.test;

import com.alibaba.fastjson.JSON;
import com.zoe.tecsun.vo.Arithmetic;
import com.zoe.tecsun.vo.CqRule;

import java.util.List;


/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-16
 */
public class CqRuleTest {
    public static void main(String[] args) {
        String text ="[{\"groupName\":\"条件组1\",\"message\":\"\",\"condition\":\"AND\"," +
                "\"arithmetics\":[{\"arithmeticConfigCode\":\"7b7d1c63f0cc07893cb9769dc452ad19\"," +
                "\"arithmeticName\":\"重症监护室日期非空，重症监护室名称必填\",\"arithmeticType\":\"PROGRAM\",\"condition\":\"AND\"}]}]";
        List<CqRule> cqRules = JSON.parseArray(text, CqRule.class);

        CqRule cqRule = cqRules.get(0);
        System.out.println(cqRule); //如果这个类没有get set方法，就得不到具体的值,这样子打出来的话就是地址值，得不到getXX的值
        List<Arithmetic> arithmeticList = cqRule.getArithmetics();
        System.out.println(arithmeticList);
        for (Arithmetic arithmetic : arithmeticList) {
            System.out.println(arithmetic.getArithmeticConfigCode());


        }


    }
}
