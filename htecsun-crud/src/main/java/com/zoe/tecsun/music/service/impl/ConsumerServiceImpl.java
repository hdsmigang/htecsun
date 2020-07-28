package com.zoe.tecsun.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoe.tecsun.music.entity.Consumer;
import com.zoe.tecsun.music.mapper.ConsumerMapper;
import com.zoe.tecsun.music.service.IConsumerService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@Service
public class ConsumerServiceImpl extends ServiceImpl<ConsumerMapper, Consumer> implements IConsumerService {

    @Override
    public Consumer addConsumer(Consumer consumer) {
        if (ObjectUtils.isEmpty(consumer)) {
            throw new ApiException("用户信息为空");
        }
        String userName = consumer.getUsername();
        String password = consumer.getPassword();
        Integer sex = consumer.getSex();
        if (StringUtils.isEmpty(userName)) {
            throw new ApiException("用户名不能为空");

        }
        if (StringUtils.isEmpty(password)) {
            throw new ApiException("用户密码不能为空");
        }
        //时间新增为空时，默认取当前时间
        Date date = Optional.ofNullable(consumer.getCreateTime()).orElse(new Date());
        consumer.setCreateTime(date);
        Date date1 = Optional.ofNullable(consumer.getUpdateTime()).orElse(new Date());
        consumer.setUpdateTime(date1);
        List<Consumer> consumerList = this.baseMapper.selectList(null);
        List<Consumer> collect =
                consumerList.stream()
                        .filter(e -> e.getUsername().equals(consumer.getUsername()))
                        .collect(Collectors.toList());
        if (collect.size() > 0) {
            throw new ApiException("存在相同用户名，请换个新的昵称哦亲!");

        }
        int insert = this.baseMapper.insert(consumer);
        if (insert == 1) {
            LambdaQueryWrapper<Consumer> eq = new QueryWrapper<Consumer>().lambda()
                    .eq(Consumer::getUsername, consumer.getUsername())
                    .eq(Consumer::getPassword, consumer.getPassword());
            return this.baseMapper.selectOne(eq);
        }
        return null;
    }


    @Override
    public List<Consumer> selectAllConsumer() {
        return this.baseMapper.selectList(null);
    }
}
