package td.learn.springcore.practice6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("gou")
public class Dog implements IJump{
    @Override
    public void jump() {
        System.out.println("Dog jump");

    }
}
