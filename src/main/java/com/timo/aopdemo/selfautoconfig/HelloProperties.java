package com.timo.aopdemo.selfautoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = "hello"
)
public class HelloProperties {
    private static  final  String MSG="world";
    private String message=MSG;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
