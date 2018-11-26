package td.learn.practice8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.springcore.aop.practice8.Config8;
import td.learn.springcore.aop.practice8.ICar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config8.class)
public class Test8 {
    @Autowired
    @Qualifier("Benz")
    ICar benz;

    @Test
    public void LuxuryCarRun(){
        benz.run();
    }





}
