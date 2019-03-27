package com.hqk.dubbo.demo_server;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.hqk.dubbo.demo_api.service.UserService;
import com.hqk.dubbo.demo_server.service.impl.UserServiceImpl;

public class ApiServer {
	public static void main(String[] args) throws Exception{
		//配置信息
        ApplicationConfig config = new ApplicationConfig();
        config.setName("demo-server");
        //传输协议
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
		protocolConfig.setPort(20880);
        //配置注册中心
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("N/A");
        //发布服务
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<UserService>();
        serviceConfig.setApplication(config);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setVersion("1.0"); //服务化最佳实践
        serviceConfig.setRef(new UserServiceImpl());
        serviceConfig.export();
        System.in.read(); //阻塞式通讯
    }
}
