package com.zoe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-06-28
 */
@SpringBootApplication
@MapperScan("com.zoe.tecsun.**.mapper")
public class HTecsunApplication {
    public static void main(String[] args) {
        SpringApplication.run(HTecsunApplication.class,args);
    }

}
