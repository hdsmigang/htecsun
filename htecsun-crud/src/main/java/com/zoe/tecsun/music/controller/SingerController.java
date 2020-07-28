package com.zoe.tecsun.music.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zoe.tecsun.crud.enumeration.ResultEnum;
import com.zoe.tecsun.crud.util.ResultVO;
import com.zoe.tecsun.music.entity.Singer;
import com.zoe.tecsun.music.service.ISingerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@RestController
@RequestMapping("/music/singer")
public class SingerController {
    private final ISingerService iSingerService;

    public SingerController(ISingerService iSingerService) {
        this.iSingerService = iSingerService;
    }

    @GetMapping("allSingerByPage")
    public ResultVO<IPage<List<Singer>>> allSinger(Page page){
        IPage<List<Singer>> listIPage = this.iSingerService.selectAll(page);
        return ResultVO.data(listIPage).setMessage("获取歌手信息成功");
    }

    @GetMapping("getSingerById")
    public ResultVO<Singer> getSingerById(Integer id){
        Singer singerById = this.iSingerService.getSingerById(id);
        return  ResultVO.data(singerById).setMessage("获取单条信息成功");
    }

}
