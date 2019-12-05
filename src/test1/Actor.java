package test1;

public class Actor extends Person {

    public Actor(String name, int age) {
        super(name, age);
    }

    public void Perform() {
        System.out.println(name + "Acts");
    }

}
