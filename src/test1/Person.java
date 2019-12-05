package test1;

public class Person {

    String name;
    String Lastname;
    String Type;
    int age;
    Double Salary;

    public Person(String Type, int age, Double Salary) {
        this.Type = Type;
        this.age = age;
        this.Salary = Salary;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    
}
    
    public void perform() {
        System.out.println(name + "");
    }
    
    public void age(){
        System.out.println(name + "" + age + "");
    }
}
