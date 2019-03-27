package com.hqk.dubbo.demo_client;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.hqk.dubbo.demo_api.po.User;
import com.hqk.dubbo.demo_api.service.UserService;

public class ApiProducer {
    public static void main(String[] args) throws IOException {
        //配置信息
        ApplicationConfig config = new ApplicationConfig();
        config.setName("demo-server");
        //配置注册中心
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("N/A");
        ReferenceConfig<UserService> referenceConfig = new ReferenceConfig<UserService>();
        referenceConfig.setApplication(config);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(UserService.class);
        referenceConfig.setVersion("1.0"); //调用服务提供的版本
        referenceConfig.setUrl("dubbo://192.168.62.1:20880/com.hqk.dubbo.demo_api.service.UserService");
        //调用远程服务好像调用本地服务一样
        UserService userService = referenceConfig.get();
        User user = userService.getById(1);
        System.out.println(user);
        System.out.println(userService.getClass()); //业务变成阿里的代理对象
    }
}
