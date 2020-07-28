package com.zoe.tecsun.music.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ListSongVO {
    private Integer songId;
    private Integer songListId;
}
