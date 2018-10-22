package td.learn.springcore.pracitce3;

public class Tom {
    public int age;
    public String name;

    public Tom() {
    }

    public Tom(int age, String name) {
        System.out.println("构造注入");
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tom{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
