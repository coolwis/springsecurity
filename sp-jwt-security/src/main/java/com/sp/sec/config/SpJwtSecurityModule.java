package com.sp.sec.config;

import com.sp.sec.web.config.SpJwtProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//SpJwtProperties 설정 등록을 위해서
@Configuration
@EnableConfigurationProperties({SpJwtProperties.class})
public class SpJwtSecurityModule {

}
