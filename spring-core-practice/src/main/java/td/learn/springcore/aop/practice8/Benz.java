package td.learn.springcore.aop.practice8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Benz")
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("Benz run...");
    }
}
