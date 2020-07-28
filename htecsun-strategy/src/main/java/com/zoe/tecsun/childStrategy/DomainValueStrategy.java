package com.zoe.tecsun.childStrategy;


import com.zoe.tecsun.IReceiptHandleStrategy;
import com.zoe.tecsun.vo.ItemError;
import com.zoe.tecsun.vo.ReceiptVO;

import java.util.List;


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

public class DomainValueStrategy implements IReceiptHandleStrategy {
    static final String TAG = "DOMAIN_VALUE";

    @Override
    public List<ItemError> handle(ReceiptVO receiptVO) {
        if(receiptVO.getType().equals(TAG)){
            System.out.println("这里进的是值域策略器");
            if(receiptVO.getType().equals("RC0023")){
                System.out.println("执行RC0023值域校验");
                String message = receiptVO.getMessage();

            }

        }
        return null;

    }
}
