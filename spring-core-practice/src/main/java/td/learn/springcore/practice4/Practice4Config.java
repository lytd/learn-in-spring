package td.learn.springcore.practice4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class Practice4Config {

    @Bean
    @Profile("dev")
    public ICar Car(){
        return new Benz();
    }

    @Bean
    @Profile("prod")
    public ICar myCar(){
        return new Bmw();
    }
}
