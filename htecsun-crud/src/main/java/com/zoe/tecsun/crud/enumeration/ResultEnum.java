package com.zoe.tecsun.crud.enumeration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

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
@Getter
@AllArgsConstructor
public enum ResultEnum {
    SUCCESS("200" , "请求成功"),
    FAILURE("500" , "请求失败"),
    EXIST("300" , "存在关联");

    private String code;
    private String name;

    public static ResultEnum getByCode(String code) {
        for (ResultEnum sellerStatusEnum : ResultEnum.values()) {
            if (sellerStatusEnum.getCode().equals(code)) {
                return sellerStatusEnum;
            }
        }
        return null;
    }
}
