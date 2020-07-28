package com.zoe.tecsun.music.controller;


import com.zoe.tecsun.crud.util.ResultVO;
import com.zoe.tecsun.music.entity.Consumer;
import com.zoe.tecsun.music.service.IConsumerService;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/music/consumer")
public class ConsumerController {
    private final IConsumerService iConsumerService;

    public ConsumerController(IConsumerService iConsumerService) {
        this.iConsumerService = iConsumerService;
    }

    @PostMapping("addConsumer")
    public ResultVO<Consumer> addConsumer(@RequestBody Consumer consumer){
        Consumer data = this.iConsumerService.addConsumer(consumer);
        return ResultVO.data(data).setMessage("新增用户成功");
    }

    @GetMapping("selectAllConsumer")
    public ResultVO<List<Consumer>> selectAllUser(){
        List<Consumer> consumerList = this.iConsumerService.selectAllConsumer();
        return ResultVO.data(consumerList).setMessage("获取全部用户成功");
    }



}
