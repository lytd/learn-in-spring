package td.learn.springcore.practice6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("renlei")
public class Human implements IJump{
    @Override
    public void jump() {
        System.out.println("Human jump");

    }
}
