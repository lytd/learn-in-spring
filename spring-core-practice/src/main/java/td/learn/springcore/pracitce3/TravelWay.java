package td.learn.springcore.pracitce3;

import java.util.List;
import java.util.Set;

public class TravelWay {

    public List<String> ways;
    private Set<String> didian;


    public TravelWay(List<String> ways) {
        System.out.println("构造器注入");
        this.ways = ways;
    }

    public TravelWay() {

    }

    public Set<String> getDidian() {
        return didian;
    }

    public void setDidian(Set<String> didian) {
        this.didian = didian;
    }
}
