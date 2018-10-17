package td.learn.springcore.practice1;

import org.springframework.stereotype.Component;


public class Bmw implements ICar {
    @Override
    public void run() {
        System.out.println("Bmw启动了");
    }
}
