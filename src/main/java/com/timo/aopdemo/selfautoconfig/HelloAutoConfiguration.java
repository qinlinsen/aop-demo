package com.timo.aopdemo.selfautoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties({HelloProperties.class})
@ConditionalOnClass({HelloService.class})
@ConditionalOnProperty(
        prefix = "hello",
        value = {"enabled"},
        matchIfMissing = true
)
public class HelloAutoConfiguration {
    private final HelloProperties properties;

    public HelloAutoConfiguration(HelloProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(properties.getMessage());
        return  helloService;
    }

}
