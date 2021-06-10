package com.tongy.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.tongy.boot.bean.Pet;
import com.tongy.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({User.class, DBHelper.class}) //给容器中自动创建出这两个类型的组件，默认组件的名字是全类名
@Configuration(proxyBeanMethods = true) //告诉Spring这是一个配置类，相当于之前写的xml配置文件
public class MyConfig {

  @Bean("tom")
  public Pet tomcatPet() {
    return new Pet("tomcat");
  }

  @Bean // 给容器中添加组件。以方法名作为组件的id。返回类型就是组件的类型。返回的值就是组件在容器中的实例。相当于之前在xml文件写的bean id=XXX
  @ConditionalOnBean(name="tom") // 容器添加组件是按顺序添加的。如果tomcatPet方法在user01方法之后也不会添加user01组件了
  public User user01() {
    User alice = new User("Alice", 18);
    alice.setPet(tomcatPet());
    return alice;
  }



}
