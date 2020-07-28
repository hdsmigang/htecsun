package com.zoe.tecsun.music.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoe.tecsun.music.entity.Singer;
import com.zoe.tecsun.music.mapper.SingerMapper;
import com.zoe.tecsun.music.service.ISingerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@Service
public class SingerServiceImpl extends ServiceImpl<SingerMapper, Singer> implements ISingerService {
    @Override
    public IPage<List<Singer>> selectAll(Page page) {
        List<Singer> singers = this.baseMapper.selectList(null);
        page.setRecords(singers);
        page.setTotal(singers.size());
        return page;
    }

    @Override
    public Singer getSingerById(Integer id) {
        Singer singer = this.baseMapper.selectById(id);
        return singer;
    }
}
