package com.zoe.tecsun.strategy;

import org.springframework.stereotype.Component;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2021-09-29
 */
@Component(DataCleanStrategyHandler.BEAN_PREFIX+SecondDataClean.TAG)
public class SecondDataClean implements  DataCleanStrategyHandler{

    public static final String TAG = "SECOND_CLEAN";
    @Override
    public String dataClean(String message) {
        return "我是第二个清洗";
    }
}
