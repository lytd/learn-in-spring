package td.learn.springcore.practice6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IntelI7 implements ICPU {
    @Override
    public void coreNum() {
        System.out.println("Intel I7 8核心");
    }
}
