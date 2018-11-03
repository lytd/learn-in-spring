package td.learn.pracitce6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import td.learn.springcore.practice6.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Practice6Config.class)
public class Test6 {

    @Autowired
    ICPU cpu;


    @Autowired
    @Qualifier("renlei")
    IJump iJump;


    @Autowired
    @White
    IDessrt iDessrt;

    @Test
    public void getCpu(){
        cpu.coreNum();
    }

    @Test
    public void jump(){
        iJump.jump();
    }

    @Test
    public void taste(){
        iDessrt.taste();
    }


}
