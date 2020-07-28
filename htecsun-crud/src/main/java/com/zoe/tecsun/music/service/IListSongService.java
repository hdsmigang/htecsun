package com.zoe.tecsun.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.tecsun.music.entity.ListSong;
import com.zoe.tecsun.music.vo.ListSongVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
public interface IListSongService extends IService<ListSong> {

    ListSong addListSong(ListSongVO listSongVO);

    List<ListSong> selectAll();

    ListSong selectBySongId(Integer songId);
}
