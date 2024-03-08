public class lesson_18_29 {
    //Классы Auto и Bus имплементируют интерфейс Vehicle. При этом имплементации некоторых его методов у них сходятся.
    //Реализуй эти методы как default в самом интерфейсе Vehicle, а из классов Auto и Bus их убери.
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.start();
        auto.move();
        auto.stop();
        System.out.println();
        Bus bus = new Bus();
        bus.start();
        bus.move();
        bus.stop();
    }

}
interface Vehicle {
    default void start() {
        System.out.println("Начинаю движение.");
    }
    void move();
    default void stop() {
        System.out.println("Останавливаюсь.");
    }
}

class Auto implements Vehicle {

    public void move() {
        System.out.println("Еду со средней скоростью 70 км/ч.");
    }

}

class Bus implements Vehicle{

    public void move() {
        System.out.println("Еду со средней скоростью 50 км/ч.");
    }

}
