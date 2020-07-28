package com.zoe.tecsun.factory;

import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zoe.tecsun.IReceiptHandleStrategy;
import com.zoe.tecsun.childStrategy.DomainValueStrategy;
import com.zoe.tecsun.childStrategy.NotEmptyStrategy;
import org.springframework.util.StringUtils;
import sun.security.jca.GetInstance;

import java.lang.management.OperatingSystemMXBean;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-07
 */
public class ReceiptHandlerStrategyFactory {
    //饿汉单例模式
    private static ReceiptHandlerStrategyFactory receiptHandlerStrategyFactory;
    private static Map<String, IReceiptHandleStrategy> strategyBeanMap;

    /**
     * 饿汉式单例模式
     * @return
     */
   public static ReceiptHandlerStrategyFactory getInstance(){
       receiptHandlerStrategyFactory = new ReceiptHandlerStrategyFactory();
       return receiptHandlerStrategyFactory;
   }

    private ReceiptHandlerStrategyFactory(){
        strategyBeanMap = new HashMap<>();
        strategyBeanMap.put("NOT_EMPTY",  new NotEmptyStrategy());
        strategyBeanMap.put("DOMAIN_VALUE",  new DomainValueStrategy());
    }

    public IReceiptHandleStrategy getStrategy(String beanName){
      if(StringUtils.isEmpty(beanName) ||strategyBeanMap ==null){
          throw new ApiException("策略器名称为空");
      }
      return strategyBeanMap.get(beanName);
    }
}
