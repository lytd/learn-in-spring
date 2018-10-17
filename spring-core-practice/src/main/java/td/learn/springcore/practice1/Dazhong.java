package td.learn.springcore.practice1;

import javafx.beans.NamedArg;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named("dz")
public class Dazhong implements ICar {
    @Override
    public void run() {
        System.out.println("dazhong启动了");
    }
}
