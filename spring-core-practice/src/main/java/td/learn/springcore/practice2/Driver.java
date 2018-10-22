package td.learn.springcore.practice2;

public class Driver {

private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public  void drive(){
        System.out.println("启动...");
        car.run();
    }

}
