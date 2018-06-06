package com.DWiZero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * springCloud的服务注册中心
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class configServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(configServerApplication.class, args);
    }
}
