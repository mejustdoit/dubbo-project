package com.shitao.example.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2019-08-19 18:24
 * @Version 1.0
 **/


public class Provider {

  public static void main(String[] args) throws Exception {
    System.setProperty("java.net.preferIPv4Stack", "true");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
    context.start();
    System.out.println("Provider started.");
    System.in.read(); // press any key to exit
  }
}