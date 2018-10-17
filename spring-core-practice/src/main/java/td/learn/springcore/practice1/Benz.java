package td.learn.springcore.practice1;

import org.springframework.stereotype.Component;

@Component
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("Benz启动了");
    }
}
