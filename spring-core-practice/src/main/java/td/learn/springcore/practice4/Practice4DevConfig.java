package td.learn.springcore.practice4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class Practice4DevConfig {

    @Bean
    public ICar Car(){
        return new Benz();
    }
}
