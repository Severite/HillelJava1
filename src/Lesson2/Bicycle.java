package Lesson2;

public class Bicycle {

    int height;
    int weight;
    String model;

    public void ride() {

    }

        public class StreeringWheel {

            public void left() {
                System.out.println("left");
            }

            public void right() {
                System.out.println("right");
            }
        }

        public class Seat {

            public void up() {
                height ++;
                System.out.println("bicycle weight: " + height );
            }

            public void down() {
                height --;
                System.out.println("bicycle weight: " + height);
            }
        }

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        Seat seat = bicycle.new Seat();
    }
}
