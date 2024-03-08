public class lesson_18_30 {
    //Классы Eagle (Орел), Raven (Ворон) и Aircraft (Самолет) имплементируют интерфейс Flyable,
    //который содержит дефолтную реализацию метода int getMaxSpeed() и возвращает значение 80.
    //Такая реализация неправильная, так как реальная максимальная скорость Орла — 180 км/ч, Ворона — 48, а самолета — 1200.

    //Тебе нужно убрать дефолтную реализацию метода getMaxSpeed() из интерфейса Flyable (сам метод нужно оставить)
    //и имплементировать его в каждом из классов.
    //Для каждого класса укажи правильное значение максимальной скорости.

    public static void main(String[] args) {
        Flyable1 eagle = new Eagle();
        System.out.println("Максимальная скорость орла: " + eagle.getMaxSpeed() + " км/ч");
        Flyable1 raven = new Raven();
        System.out.println("Максимальная скорость ворона: " + raven.getMaxSpeed() + " км/ч");
        Flyable1 aircraft = new Aircraft();
        System.out.println("Максимальная скорость самолёта: " + aircraft.getMaxSpeed() + " км/ч");
    }


}

interface Flyable1 extends Flyable {
    int getMaxSpeed();
}

class Eagle implements Flyable1 {
    @Override
    public int getMaxSpeed() {
        return 180;
    }
}

class Raven implements Flyable1 {
    @Override
    public int getMaxSpeed() {
        return 48;
    }
}

class Aircraft implements Flyable1 {

    @Override
    public int getMaxSpeed() {
        return 1200;
    }
}