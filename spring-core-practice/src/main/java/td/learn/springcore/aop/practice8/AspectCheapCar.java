package td.learn.springcore.aop.practice8;


public class AspectCheapCar {

    private IRun irun;

    public AspectCheapCar(IRun irun) {
        this.irun = irun;
    }

    public void run(){

    };

    public void runBefore(){
        irun.start();
    };

    public void runAfter(){

    };

}
