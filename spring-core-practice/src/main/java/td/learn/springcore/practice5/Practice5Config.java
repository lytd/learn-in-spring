package td.learn.springcore.practice5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Practice5Config {

    @Bean
    @Conditional(MyCondition.class)
    public ICar getBenz(){
        return new BenZ();
    }


    @Bean
    @Conditional(MyCondition.class)
    public ICar getBmw(){
        return new Bmw();
    }

}
