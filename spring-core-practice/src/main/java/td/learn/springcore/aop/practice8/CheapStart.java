package td.learn.springcore.aop.practice8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cheap")
public class CheapStart implements IRun{

    @Override
    public void start() {
        System.out.println("钥匙启动");
    }
}
