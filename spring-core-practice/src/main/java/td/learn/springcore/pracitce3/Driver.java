package td.learn.springcore.pracitce3;

public class Driver {
    private Jili car;

    public Driver() {
    }

    public Driver(Jili car) {
        System.out.println("构造方法注入");
        this.car = car;

    }

    public Jili getCar() {
        return car;
    }

    public void setCar(Jili car) {
        System.out.println("set方法注入");
        this.car = car;
    }

    public void drive(){
        car.run();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "car=" + car +
                '}';
    }
}
