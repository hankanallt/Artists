package test1;

public class Artist extends Person {

    public Artist(String name, int age) {
        super(name, age);
    }

    public void perform() {
        System.out.println(name + "Sings");
    }
}
