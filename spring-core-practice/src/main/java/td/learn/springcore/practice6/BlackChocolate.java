package td.learn.springcore.practice6;

import org.springframework.stereotype.Component;

@Component
@Cold
@Black
public class BlackChocolate implements IDessrt{
    @Override
    public void taste() {
        System.out.println("Black good ");
    }
}
