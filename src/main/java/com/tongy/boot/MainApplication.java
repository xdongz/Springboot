package com.tongy.boot;

import com.tongy.boot.bean.Pet;
import com.tongy.boot.bean.User;
import com.tongy.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @SpringBootApplication: 告诉程序这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {

  public static void main(String[] args) {
    // 1. 返回IOC容器
    ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

    // 2. 查看容器中的组件
//    String[] names = run.getBeanDefinitionNames();
//    for (String name : names) {
//      System.out.println(name);
//    }

    // 3. 从容器中获取组件
    // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot总会检查这个组件是否在容器中有
    // 默认是true。如果置为false，则每次会创建一个新的
//    User user01 = run.getBean(User.class);

    // 4. 如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot总会检查这个组件是否在容器中有
    // 默认是true。如果置为false，则每次会创建一个新的
//    MyConfig bean = run.getBean(MyConfig.class);
//    User user1 = bean.user01();
//    User user2 = bean.user01();
//    System.out.println(user1 == user2);
//
//    User user011 = run.getBean("user01", User.class);
//    Pet tom = run.getBean("tom", Pet.class);
//    System.out.println("用户的宠物："+ (user011.getPet() == tom));

    System.out.println(run.containsBean("tom"));
    System.out.println(run.containsBean("user01"));

  }

}
