package td.learn.practice5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.springcore.practice4.Benz;
import td.learn.springcore.practice5.ICar;
import td.learn.springcore.practice5.Practice5Config;


public class Test5 {



    @Test
    public void test(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Practice5Config.class);
        ICar car= (ICar) context.getBean("getBmw");
        if(null!=car){car.run();}

    }

}
