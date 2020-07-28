package com.zoe.tecsun;

import com.zoe.tecsun.vo.ReceiptVO;
import com.zoe.tecsun.vo.ItemError;

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

/**
 * 策略接口
 */
public interface IReceiptHandleStrategy {
    List<ItemError> handle(ReceiptVO receiptVO);
}
