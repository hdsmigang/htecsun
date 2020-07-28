package com.zoe.tecsun.music.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.tecsun.music.entity.Singer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
public interface ISingerService extends IService<Singer> {

    IPage<List<Singer>> selectAll(Page page);

    Singer getSingerById(Integer id);
}
