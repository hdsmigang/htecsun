package com.zoe.tecsun.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain =true)
public class CqRule implements Serializable {
    private String groupName;
    private  String message;
    private  String condition;
    private List<Arithmetic> arithmetics;

}
