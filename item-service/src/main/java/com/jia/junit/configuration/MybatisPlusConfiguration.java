package com.jia.junit.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jjsai
 * @date 2022/7/1 14:22
 **/
@Configuration
@MapperScan(basePackages = "com.jia.junit.**.mapper")
public class MybatisPlusConfiguration {
}