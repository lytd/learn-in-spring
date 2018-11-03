package td.learn.springcore.practice6;

import org.springframework.stereotype.Component;

@Component
@Cold
@White
public class WhiteChocolate implements IDessrt{
    @Override
    public void taste() {
        System.out.println("White good ");
    }
}