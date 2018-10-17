# Spring中bean装配的三种方式
## XML显示装配



## java中进行显示装配



## 隐式的bean发现机制和自动装配
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


