package com.timo.aopdemo.selfautoconfig;

public class HelloService {
    private String msg;
    public void sayHello(){
        System.out.println("hello "+msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
