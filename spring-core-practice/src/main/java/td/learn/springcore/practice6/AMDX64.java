package td.learn.springcore.practice6;

import org.springframework.stereotype.Component;

@Component
public class AMDX64 implements ICPU {
    @Override
    public void coreNum() {
        System.out.println("AMD 12核");
    }
}
