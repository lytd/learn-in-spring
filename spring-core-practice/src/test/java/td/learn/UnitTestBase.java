package td.learn;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UnitTestBase {

    //创建一个容器对象
    private ClassPathXmlApplicationContext context;

    //配置文件路径
    private String xmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String xmlPath) {
        this.xmlPath = xmlPath;
    }


    @Before
    public void init() {
        System.out.println("容器初始化 - 开始");

        context = new ClassPathXmlApplicationContext(xmlPath.split("[,\\s]+"));
        System.out.println("容器初始化 — 完成");
    }


    /**
     * 按bean名称获取bean
     * @param beanName bean名称
     * @return
     */
    public Object getBean(String beanName) {

        System.out.println("根据bean名称获取bean:" + beanName);
        String[] beandefeinetions=context.getBeanDefinitionNames();

        return context.getBean(beanName);
    }


    /**
     * 按类型获取bean
     *
     * @param beanType bean类型
     * @return
     */
    public Object getBean(Class beanType) {

        System.out.println("根据bean类型获取bean:" + beanType);
        return context.getBean(beanType);
    }



    @After
    public void destory() {
        System.out.println("容器销毁 - 开始");

        context.destroy();


        System.out.println("容器销毁 — 完成");
    }
}
