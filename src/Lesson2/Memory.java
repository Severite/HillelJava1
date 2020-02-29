package Lesson2;

public class Memory {
    public static void main(String[] args) {
        int i = 1;
        Object object = new Object();
        Memory memory = new Memory();
        memory.exMethod(object);

    }

    private void exMethod(Object param){
        String string = param.toString();
        System.out.println(string);
    }
}
