package td.learn.practice8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.UnitTestBase;
import td.learn.springcore.aop.practice8.ICar;

public class Test8_xml extends UnitTestBase {



    public Test8_xml() {
        super("classpath*:springcore/practice8/spring-practice8.xml");
    }

    @Test
    public void cheapCarRun(){
      //  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("");
        ICar car= (ICar)super.getBean("byd");

         car.run();
    }
}
