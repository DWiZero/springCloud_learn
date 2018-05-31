package com.DWiZero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * springCloud的服务注册中心
 */
@EnableEurekaClient
//@EnableDiscoveryClient
//上面两个注解的区别：
// 1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现；
//2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
//如果你的classpath中添加了eureka，则它们的作用是一样的
@SpringBootApplication
public class ServerApplication
{

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
