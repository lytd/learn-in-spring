package td.learn.springcore.practice2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import td.learn.springcore.practice2.Car;
import td.learn.springcore.practice2.Driver;

@Configuration
public class Practice2Config {

    @Bean
    public Car getCar(){
        return new Car();
    }

    @Bean
    public Driver getDriver(Car car){
        return new Driver(car);
    }


}
