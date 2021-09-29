package com.zoe.tecsun.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2021-09-29
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/good")
public class Test {
   private final DataCleanStrategy dataCleanStrategy;

   @GetMapping("/test")
   public String  getStrategy() throws Exception {
       return this.dataCleanStrategy.getOrThrow("FIRST_CLEAN").dataClean("111");
   }
}
