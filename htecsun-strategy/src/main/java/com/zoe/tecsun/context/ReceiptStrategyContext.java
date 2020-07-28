package com.zoe.tecsun.context;

import com.zoe.tecsun.IReceiptHandleStrategy;
import com.zoe.tecsun.vo.ReceiptVO;

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
public class ReceiptStrategyContext {
    private final IReceiptHandleStrategy iReceiptHandleStrategy;

    public ReceiptStrategyContext(IReceiptHandleStrategy iReceiptHandleStrategy) {
        this.iReceiptHandleStrategy = iReceiptHandleStrategy;
    }


    public void handleReceipt(ReceiptVO receiptVO){
        if (iReceiptHandleStrategy !=null){
            this.iReceiptHandleStrategy.handle(receiptVO);
        }
    }
}
