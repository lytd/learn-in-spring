package td.learn.springcore.practice4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class Practice4ProdConfig {

    @Bean
    public ICar Car(){
        return new Bmw();
    }
}
