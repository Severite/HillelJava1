package Lesson1;

public class References {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(" befor call " + number);
        changeNumber(number);
        System.out.println(" after call " + number);

        Cat cat = new Cat();
        cat.name = "Рыжий";
        System.out.println(" befor call");


    }

    public static void changeNumber(int number) {
        System.out.println(" input number " + number);
        number = 10;
        System.out.println(" after chande " + number);
    }

    public static void changeCat(Cat cat) {
        System.out.println("input cat" + cat.name);
        cat.name = "New name";
        System.out.println("after change" + cat.name);
    }
}
