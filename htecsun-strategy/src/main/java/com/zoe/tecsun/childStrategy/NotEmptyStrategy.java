package com.zoe.tecsun.childStrategy;


import com.alibaba.fastjson.JSON;
import com.zoe.tecsun.IReceiptHandleStrategy;
import com.zoe.tecsun.vo.ReceiptVO;
import com.zoe.tecsun.vo.ItemError;
import com.zoe.tecsun.vo.RuleDataVO;
import org.springframework.util.StringUtils;

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

public class NotEmptyStrategy implements IReceiptHandleStrategy {
    static final  String TAG  ="NOT_EMPTY";

    @Override
    public List<ItemError> handle(ReceiptVO receiptVO) {
        if(receiptVO.getType().equals("NOT_EMPTY")){
            System.out.println("这里执行的是不能为空的校验");
        }
        String data = receiptVO.getData();
        List<RuleDataVO> dataArray = JSON.parseArray(data, RuleDataVO.class);
        String errorMsg = "";
        List<ItemError> list  = new ArrayList<>();
        for (RuleDataVO ruleDataVO : dataArray) {
            if(StringUtils.isEmpty(ruleDataVO.getDeValue())){
                ItemError itemError = new ItemError();
                errorMsg = String.format("编码【%s】的值为空", ruleDataVO.getDeCode());
                itemError.setErrorMsg(errorMsg);
                list.add(itemError);
            }

        }
        System.out.println(list);
        return list;
    }
}
