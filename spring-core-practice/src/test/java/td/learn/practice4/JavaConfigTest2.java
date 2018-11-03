package td.learn.Practice4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.springcore.practice4.ICar;
import td.learn.springcore.practice4.Practice4Config;
import td.learn.springcore.practice4.Practice4DevConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= Practice4Config.class)
@ActiveProfiles("prod")
public class JavaConfigTest2 {

    @Autowired
    ICar car;

    @Test
    public void getCarName(){
        System.out.println(car.getCarName());
    }
}
