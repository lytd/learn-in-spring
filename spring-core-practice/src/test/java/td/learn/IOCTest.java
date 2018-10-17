package td.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import td.learn.springcore.practice1.Benz;
import td.learn.springcore.practice1.ICar;
@RunWith(BlockJUnit4ClassRunner.class)
public class IOCTest extends UnitTestBase {


    public IOCTest() {
        super("classpath*:spring-context.xml");
    }

    @Test
    public void getBeanByBeanNameFromXML() {
       ICar c = (ICar) super.getBean("Car");
        c.run();
    }


    @Test
    public void getBeanByBeanTypeFromXML() {

        ICar c = (ICar) super.getBean(Benz.class);
        c.run();
    }

}
