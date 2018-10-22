package td.learn.practice3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.UnitTestBase;
import td.learn.springcore.pracitce3.Driver;
import td.learn.springcore.pracitce3.Jili;
import td.learn.springcore.pracitce3.Tom;
import td.learn.springcore.pracitce3.TravelWay;

import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
public class Test3 extends UnitTestBase {

    public Test3() {
        super("classpath*:springcore/practice3/spring1.xml");
    }

    @Test
    public void conSimpleBean() {
        Driver d = (Driver) getBean("Siji");
        d.drive();
    }


    @Test
    public void comSimpleValue() {
        Tom tom= (Tom) getBean("Tom");
        System.out.println(tom);
    }

    @Test
    public void comSimpleCollections() {
        TravelWay travelWay= (TravelWay) getBean("TravelWay");
        System.out.println(travelWay.ways);
    }


    @Test
    public void setterSimpleBean() {
        Driver d = (Driver) getBean("MyDriver");
        d.drive();
    }


    @Test
    public void setterSimpleValue() {
        Tom tom= (Tom) getBean("MyTom");
        System.out.println(tom);
    }

    @Test
    public void setterSimpleCollections() {
        TravelWay travelWay= (TravelWay) getBean("TravelPlan");
        System.out.println(travelWay.getDidian());
    }


}
