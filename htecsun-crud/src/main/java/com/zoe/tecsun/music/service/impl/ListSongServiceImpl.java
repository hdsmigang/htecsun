package com.zoe.tecsun.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zoe.tecsun.music.entity.ListSong;
import com.zoe.tecsun.music.mapper.ListSongMapper;
import com.zoe.tecsun.music.service.IListSongService;
import com.zoe.tecsun.music.vo.ListSongVO;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@Service
public class ListSongServiceImpl extends ServiceImpl<ListSongMapper, ListSong> implements IListSongService {
    @Override
    public ListSong addListSong(ListSongVO listSongVO) {
        if (!Optional.ofNullable(listSongVO.getSongId()).isPresent()) {
            new ApiException("歌单编码为空");
        }
        if (!Optional.ofNullable(listSongVO.getSongListId()).isPresent()) {
            new ApiException("歌单列表编码不能为空");
        }

        ListSong listSong = new ListSong();
        listSong.setSongId(listSongVO.getSongId()).setSongListId(listSongVO.getSongListId());
        int listSongNum = this.baseMapper.insert(listSong);
        if (listSongNum == 1) {
            LambdaQueryWrapper<ListSong> query = new QueryWrapper<ListSong>()
                    .lambda()
                    .eq(ListSong::getSongId, listSongVO.getSongId())
                    .eq(ListSong::getSongId, listSongVO.getSongListId());
            return this.baseMapper.selectOne(query);

        }
        return null;
    }


    @Override
    public List<ListSong> selectAll() {
        return this.baseMapper.selectList(null);
    }


    @Override
    public ListSong selectBySongId(Integer songId) {
        LambdaQueryWrapper<ListSong> query = new LambdaQueryWrapper<ListSong>().eq(ListSong::getSongId, songId);
        return this.baseMapper.selectOne(query);
    }
}
