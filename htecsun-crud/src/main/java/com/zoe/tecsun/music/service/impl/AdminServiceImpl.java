package com.zoe.tecsun.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoe.tecsun.music.entity.Admin;
import com.zoe.tecsun.music.mapper.AdminMapper;
import com.zoe.tecsun.music.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
    @Override
    public Admin login(String name, String password) {
        LambdaQueryWrapper<Admin> query =
                new QueryWrapper<Admin>().lambda().eq(Admin::getName, name).eq(Admin::getPassword, password);
        return this.baseMapper.selectOne(query);
    }
}
