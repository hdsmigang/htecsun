package com.zoe.tecsun.basic;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-06
 */

import com.zoe.tecsun.exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Optional;

/**
 * 定义基类策略器
 * @param <T>
 */
public abstract class BaseStrategy<T> {
    /**
     *设置map字典
     */
    @Autowired(required = false)
    private Map<String, T> strategyBeanMap;

    protected BaseStrategy(Map<String, T> strategyBeanMap) {
        this.strategyBeanMap = strategyBeanMap;
    }

    /**
     *Bean前缀
     * @return
     */
    protected abstract String beanPrefix();

    /**
     * 策略器名称
     */

    protected abstract String strategyName();


    private Optional<T> get(String beanName) {
        //如果beanName为空传空
        if (StringUtils.isEmpty(beanName) || strategyBeanMap == null) {
            return Optional.empty();
        }
        //如果beanName部位空
        String beanFullName = this.beanPrefix().concat(beanName);
        return Optional.ofNullable(strategyBeanMap.get(beanFullName));

    }

    public T getOrThrow(String beanName) throws ApiException {
        return this.get(beanName.toUpperCase()).orElseThrow(() -> new ApiException(String.format("找不到指定记录%s",
                this.strategyName(), beanName)));

    }


}
