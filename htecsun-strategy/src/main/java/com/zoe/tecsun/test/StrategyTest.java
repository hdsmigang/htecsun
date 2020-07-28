package com.zoe.tecsun.test;

import com.zoe.tecsun.IReceiptHandleStrategy;
import com.zoe.tecsun.factory.ReceiptHandlerStrategyFactory;
import com.zoe.tecsun.vo.ReceiptVO;

import java.util.ArrayList;
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
public class StrategyTest {
    public static void main(String[] args) {

        ReceiptVO receiptVO = new ReceiptVO("不能为空策略器", "NOT_EMPTY","[{deCode:'code_1',deValue:'',deText:''},{deCode:'code_2',deValue:'',deText:''},{deCode:'code_3',deValue:'3',deText:''}]");
        ReceiptVO receiptVO1 = new ReceiptVO("至于校验策略器", "DOMAIN_VALUE","");
        List<ReceiptVO> list = new ArrayList<>();
        list.add(receiptVO);
        list.add(receiptVO1);
        IReceiptHandleStrategy strategy = ReceiptHandlerStrategyFactory.getInstance().getStrategy(receiptVO.getType());
        strategy.handle(receiptVO);




    }
}
