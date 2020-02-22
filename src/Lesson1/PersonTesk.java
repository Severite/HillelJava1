package Lesson1;

public class PersonTesk {
    public void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");

        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person(12);

        System.out.println(person2.name);
        System.out.println(person2.age);

        Person person3 = new Person("New Name", 12);

        System.out.println(person3.name);
        System.out.println(person3.age);
    }
    
}
