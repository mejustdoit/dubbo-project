package com.shitao.example.provider;
import com.shitao.example.api.DemoService;
/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2019-08-19 17:59
 * @Version 1.0
 **/
public class DemoServiceImpl implements DemoService{

  @Override
  public String sayHello(String name) {
    return "Hello " + name;
  }
}
