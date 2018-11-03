package td.learn.Practice4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.UnitTestBase;
import td.learn.springcore.practice4.ICar;
import td.learn.springcore.practice4.Practice4DevConfig;

public class XmlTest1 extends UnitTestBase {



    public XmlTest1() {
        super("classpath*:springcore/practice4/spring-practice4.xml");
    }

    @Test
    public void getCarName(){
      ICar car= (ICar) getBean("car");
        System.out.println(car.getCarName());
    }
}
