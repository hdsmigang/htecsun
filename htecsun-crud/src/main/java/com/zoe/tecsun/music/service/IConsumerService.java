package com.zoe.tecsun.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.tecsun.music.entity.Consumer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
public interface IConsumerService extends IService<Consumer> {
    /**
     * 添加听歌者
     * @param consumer
     * @return
     */
    Consumer addConsumer(Consumer consumer);

    List<Consumer> selectAllConsumer();
}
