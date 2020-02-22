package Lesson1;

public class Person {

    public String name;
    public int age = 10;


    public Person() {
        name = "Default name";
        age = 1;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
