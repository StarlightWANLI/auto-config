package com.laowan.demo.command;

import com.laowan.demo.util.ServerPortUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: auto-config
 * @description:
 * @author: wanli
 * @create: 2020-05-18 11:45
 **/
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    private  Logger logger = LoggerFactory.getLogger(MyEnvironmentPostProcessor.class);

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Map<String, String> propertyMap = new HashMap<>();
        propertyMap.put("server.port", String.valueOf(ServerPortUtils.getAvailablePort()));

      //  logger.info("程序随机端口server.port:{}",propertyMap.get("server.port"));
        System.out.println("程序随机端口server.port:" + propertyMap.get("server.port"));
        MyPropertySource propertySource = new MyPropertySource("myPropertySource",propertyMap);

        environment.getPropertySources().addLast(propertySource);
    }
}
