package com.zoe.tecsun.strategy;

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
public interface DataCleanStrategyHandler {
    String BEAN_PREFIX = "DATA_CLEAN:";

    String dataClean(String message);

}
