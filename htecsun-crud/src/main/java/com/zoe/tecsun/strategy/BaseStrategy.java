package com.zoe.tecsun.strategy;

import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Optional;

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
public abstract class BaseStrategy<T> {

    @Autowired(required = false)
    private Map<String, T> strategyMap;

    protected abstract String beanPrefix();

    protected String strategyName() {
        return "策略器";
    }


    public Optional<T> get(String beanName) {
        if (StringUtils.isNullOrEmpty(beanName)) {
            return Optional.empty();
        }
        String beanFullName = this.beanPrefix().concat(beanName);
        return Optional.ofNullable(strategyMap.get(beanFullName));

    }


    public T getOrThrow(String beanName) throws Exception {
        return this.get(beanName.toUpperCase()).orElseThrow(() -> new RuntimeException(String.format("找不到指定的策略器：%s," +
                "%s", this.strategyName(), beanName)));
    }


}
