package Lesson2;

public class BicycleTest {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.StreeringWheel streeringWheel = bicycle.new StreeringWheel();

        seat.down();
        seat.up();
        seat.up();

        streeringWheel.left();
        streeringWheel.right();
    }
}
