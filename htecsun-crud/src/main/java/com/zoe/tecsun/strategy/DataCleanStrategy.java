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
@Component
public class DataCleanStrategy extends BaseStrategy<DataCleanStrategyHandler>{
    @Override
    protected String beanPrefix() {
        return DataCleanStrategyHandler.BEAN_PREFIX;
    }

    @Override
    protected String strategyName() {
        return "数据清洗策略器";
    }
}
