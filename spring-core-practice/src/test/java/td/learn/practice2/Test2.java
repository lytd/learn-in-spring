package td.learn.practice2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.springcore.practice2.Driver;
import td.learn.springcore.practice2.javaconfig.Practice2Config;


public class Test2 {

    @Test
    public void Driver(){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(td.learn.springcore.practice2.javaconfig.Practice2Config.class);
        Driver d= (Driver) context.getBean("getDriver");
        d.drive();
    }

}
