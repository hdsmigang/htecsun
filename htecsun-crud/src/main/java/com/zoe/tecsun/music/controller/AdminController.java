package com.zoe.tecsun.music.controller;


import com.zoe.tecsun.crud.util.ResultVO;
import com.zoe.tecsun.music.entity.Admin;
import com.zoe.tecsun.music.service.IAdminService;
import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@RestController
@RequestMapping("/music/admin")
public class AdminController {
    private final IAdminService iAdminService;
    public AdminController(IAdminService iAdminService) {
        this.iAdminService = iAdminService;
    }

    /**
     *获取登录接口
     * @param name
     * @param password
     * @return
     */
    @GetMapping("login")
    public ResultVO<Admin> login(String name,String password) {
        Admin res = this.iAdminService.login(name, password);
        return ResultVO.data(res).setMessage("管理员核对信息正确");

    }

}
