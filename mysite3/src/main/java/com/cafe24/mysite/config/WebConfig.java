package com.cafe24.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.web.FileuploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.MessageConfig;
import com.cafe24.config.web.SecurityConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.mysite.controller", "com.cafe24.mysite.exception"})
@Import({MVCConfig.class, SecurityConfig.class, FileuploadConfig.class, MessageConfig.class})
public class WebConfig {
}
