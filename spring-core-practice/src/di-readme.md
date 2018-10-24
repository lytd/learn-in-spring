# **Spring中bean装配的三种方式**

## **XML显示装配**
通过XML装配bean有两个步骤：
1. 创建XML配置规范
2. 在xml中声明bean

xml装配bean的方式
- 借助构造器注入初始化bean
   - 构造器注入bean引用
   - 将字面量注入到构造器中
   - 装配集合
   
- 通过setter方法设置属性
   - 注入bean引用
   - 将字面量注入到set方法中
   - 装配集合




## **java中进行显示装配**
javaConfig与其他的java代码不同，javaConfig是以类的方式去描述的配置代码，和其他的业务逻辑代码、领域逻辑代码不同。javaConfig是无侵入性的，因此，在项目中，javaConfig会被放到单独的包，这样就会它的意图产生迷惑

实现javaConfig的显示装配
1. 创建配置类
```java
@Configuration
public class Practice2Config {

    @Bean
    public Car getCar(){
        return new Car();
    }

    @Bean
    public Driver getDriver(Car car){
        return new Driver(car);
    }


}
```
2. 声明简单bean
3. 通过javaConfig实现注入


通过javaconfig，会使bean加载到Spring上下文中，默认情况下，bean的id就是@bean注解的方法名一致，如需设置别名，则使用@bean注解的name属性


## **隐式的bean发现机制和自动装配**
通过两方面实现自动化装配

- 组件扫描：Spring会自动发现应用上下文中创建的bean

- 自动装配：Spring会自动满足bean之间的依赖



  1. **对class类添加注解**

     - **@Component或派生注解**,可以在后面括号中添加别名
     - **@Named**,这个是javax包中java的原生JNDI的实现,可以在后面括号中添加别名

  2. **扫描包**

     - 添加@ComponentScan注解

       ```java
       @Configuration
       //1.此为当前文件所在的包下
       @ComponentScan
       //2.@ComponentScan("XXX") 或者@ComponentScan(basePackages="XXX")是扫描指定包路径
       //3.@ComponentScan(basePackages={"XXX","xx"})是扫描多个包路径
       //4.@ComponentScan(basePackageClasses={XXX.Class,XX.class})指定包中所包含的类或接口
       public class XXX {
           
       }
       ```

     - 在配置XML中添加

       ```XML
       <context:compoent-scan base-package="com.td.xxx"/>
           <!-- 扫描配置路径下的所有类 -->
       ```

  3. **使用自动装配**

      - **@Autowired**

        1. @Autowired 可以添加在字段上，或setter方法上，还可以用在构造方法上

        2. @Autowired有required属性(默认为true)，**当设置为false时，未自动装配成功的bean不会抛出异常，但是会为空，处于未装配状态**

      - @Inject 是java依赖注入的规范，spring支持此注解做自动装配


## 混合导入
### javaconfig中导入xml
在javaconfig类中可以引用另一个javaconfig、xml配置文件或者同时引用
- **引用javaconfig**:在javaconfig类中使用@Import注解可以引用其他的javaconfig类

- **引用xml**:在javaconfig类中使用@ImportResources注解可以引用xml配置

```java
@Configuration
@Import({Config1.class,Config2.class})
@ImportResource("classpath:config.xml")
public class SystemConfig{
    //...
}

```

### xml中导入javaconfig
- **引用javaconfig**:没有xml标签可以直接导入javaconfig，但是可以使用bean标签，先声明一个bean，然后在将其装配

- **引用xml**:在xml配置文件中使用<import>标签可以引用xml配置

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <import resource="classpath:spring-context.xml"></import>
    <bean id="config" class="td.learn.springcore.practice2.javaconfig.Practice2Config"></bean>
</beans>

```