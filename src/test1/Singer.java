package test1;

public class Singer extends Person {

    public Singer(String name, int age) {
        super(name, age);
    }

    public void Perform() {
        System.out.println(name + "Sings");
    }

}
