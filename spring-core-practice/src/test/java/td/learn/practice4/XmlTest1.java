package td.learn.practice4;

import org.junit.Test;
import td.learn.UnitTestBase;
import td.learn.springcore.practice4.ICar;

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
