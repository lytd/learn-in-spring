package td.learn.practice1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.springcore.practice1.Benz;
import td.learn.springcore.practice1.Bmw;
import td.learn.springcore.practice1.Dazhong;
import td.learn.springcore.practice1.Practice1Config;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Practice1Config.class)
public class Test1 {

    @Autowired
    Benz benz;

    @Autowired(required = false)
    Bmw bmw;

    @Inject
    Dazhong dazhong;


    @Test
    public void BenzFind(){
        benz.run();
    }

    @Test
    public void BmwFind(){
        if(null!=bmw){
            bmw.run();
        }else {
            System.out.println("bmw is null");
        }

    }

    @Test
    public void dazhongFind(){
        dazhong.run();
    }


}
