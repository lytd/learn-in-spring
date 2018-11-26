package td.learn.springcore.aop.practice8;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLuxuryCar {

    @Autowired
    @Qualifier("Luxury")
     IRun irun;

    @Pointcut("execution(* td.learn.springcore.aop.practice8.ICar.run())")
    public void run(){

    }

    @Before("run() && (bean(Benz)||bean(Bmw))")
    public void luxuryBeforeRun(){
        irun.start();
        //System.out.println("车内欢迎音响起");
    }

    @Before("run() && (bean(Byd)||bean(Bmw))")
    public void cheapBeforeRun(){

    }
}
