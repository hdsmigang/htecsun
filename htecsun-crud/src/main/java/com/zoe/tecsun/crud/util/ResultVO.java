package com.zoe.tecsun.crud.util;

import com.zoe.tecsun.crud.enumeration.ResultEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel("返回数据")
public class ResultVO<T> implements Serializable {
    @ApiModelProperty("返回结果状态编码")
    private String code;
    @ApiModelProperty("错误信息")
    private String error;
    @ApiModelProperty("返回消息")
    private String message;
    @ApiModelProperty("返回数据")
    private T data;

    public static <T> ResultVO<T> success(String message) {
        return ResultVO.<T>builder().code(ResultEnum.SUCCESS.getCode()).message(message).build();
    }

    public static <T> ResultVOBuilder<T> success() {
        return ResultVO.<T>builder().code(ResultEnum.SUCCESS.getCode());
    }

    public static <T> ResultVO<T> failure(String message) {
        return ResultVO.<T>builder().code(ResultEnum.FAILURE.getCode()).message(message).build();
    }

    public static <T> ResultVO<T> failure(String code, String message) {
        return ResultVO.<T>builder().code(code).message(message).build();
    }

    public static <T> ResultVOBuilder<T> failure() {
        return ResultVO.<T>builder().code(ResultEnum.FAILURE.getCode());
    }

    public static <T> ResultVO<T> data(T data) {
        return ResultVO.<T>success().data(data).build();
    }
}
