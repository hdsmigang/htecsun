package com.zoe.tecsun.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoe.tecsun.music.entity.Song;
import com.zoe.tecsun.music.mapper.SongMapper;
import com.zoe.tecsun.music.service.ISongService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@Service
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements ISongService {

}
