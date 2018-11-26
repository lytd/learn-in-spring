package td.learn.springcore.aop.practice8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Luxury")
public class LuxuryStart implements IRun{

    @Override
    public void start() {
        System.out.println("一键启动");
    }
}
