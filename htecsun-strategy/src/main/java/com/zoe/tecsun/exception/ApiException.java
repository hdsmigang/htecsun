package com.zoe.tecsun.exception;


import com.zoe.tecsun.crud.enumeration.ResultEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2019</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: ruansheng
 * @date 2019-06-11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApiException extends Exception {

    private static final long serialVersionUID = 5722486780178759094L;
    private ResultEnum resultEnum;

    public ApiException(String message) {
        super(message);
        this.resultEnum = ResultEnum.FAILURE;
    }

    public ApiException(ResultEnum resultEnum, String message) {
        super(message);
        this.resultEnum = resultEnum;
    }
}
