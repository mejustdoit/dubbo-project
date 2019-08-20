package com.shitao.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shitao.example.api.DemoService;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2019-08-19 18:17
 * @Version 1.0
 **/

public class Consumer {
  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-consumer.xml"});
    context.start();
    // Obtaining a remote service proxy
    DemoService demoService = (DemoService)context.getBean("demoService");
    // Executing remote methods
    String hello = demoService.sayHello("world");
    // Display the call result
    System.out.println(hello);
  }
}
