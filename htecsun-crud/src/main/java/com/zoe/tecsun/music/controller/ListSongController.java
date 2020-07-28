package com.zoe.tecsun.music.controller;


import com.google.common.collect.Lists;
import com.zoe.tecsun.crud.util.ResultVO;
import com.zoe.tecsun.music.entity.ListSong;
import com.zoe.tecsun.music.service.IListSongService;
import com.zoe.tecsun.music.vo.ListSongVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/music/listSong")
public class ListSongController {
    //构造器注入，也可以使用autowired,控制层访问服务层建议使用构造器注入
    private final IListSongService iListSongService;

    public ListSongController(IListSongService iListSongService) {
        this.iListSongService = iListSongService;
    }

    /**
     * 给歌单添加歌曲
     * @param listSongVO
     * @return
     */
    @PostMapping("listSong/add")
    public ResultVO<ListSong> addListSong(@RequestBody ListSongVO listSongVO){
        ListSong listSong = this.iListSongService.addListSong(listSongVO);
        return ResultVO.data(listSong).setMessage("添加歌单成功");
    }

    /**
     * 查询所有歌单
     * @return
     */
    @GetMapping("selectAllSong")
    public ResultVO<List<ListSong>> selectAllSong(){
        List<ListSong> listSongs = this.iListSongService.selectAll();
        return ResultVO.data(listSongs).setMessage("查询所有歌单成功");
    }

    /**
     * 根据歌单编码获取歌单信息
     * @param songId
     * @return
     */
    @GetMapping("/listSong/detail")
    public ResultVO<ListSong>  listSongBySongId(@RequestParam Integer songId){
        ListSong listSong = this.iListSongService.selectBySongId(songId);
        return ResultVO.data(listSong).setMessage("获取单条歌曲成功");
    }

    @GetMapping("updateListSong")
    public ResultVO<ListSong> updateListSong(@RequestBody ListSong list){
        return null;
    }







}
