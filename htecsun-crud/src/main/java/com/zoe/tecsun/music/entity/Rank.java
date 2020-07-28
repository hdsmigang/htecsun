package com.zoe.tecsun.music.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class Rank implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("songListId")
    private Long songListId;

    @TableField("consumerId")
    private Long consumerId;

    private Integer score;


}
