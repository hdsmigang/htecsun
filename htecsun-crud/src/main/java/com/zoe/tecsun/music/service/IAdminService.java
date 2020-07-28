package com.zoe.tecsun.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.tecsun.music.entity.Admin;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
public interface IAdminService extends IService<Admin> {

    Admin login(String name, String password);
}
