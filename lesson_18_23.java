public class lesson_18_23 {
    //Суть интерфейсов

    //Чтобы лучше понять преимущества интерфейсов и места их использования, нужно поговорить о более абстрактных вещах.
    //Класс — это, чаще всего модель какого-то конкретного объекта.
    //Интерфейс же больше соответствует не объектам, а их способностям или ролям.

    //Например, такие вещи, как машина, велосипед, мотоцикл и колесо лучше всего представить в виде классов и объектов.
    //А такие их способности, как «могу ездить», «могу перевозить людей», «могу стоять», лучше представить в виде интерфейсов.

    //Вот несколько примеров:
}
interface Movable               //соответствует способности передвигаться
{
    void move(String newAddress);
}

interface Driveable             //соответствует способности управляться водителем
{
    void drive(Driver driver);
}

interface Transport             //соответствует способности перевозить грузы
{
    void addStuff(Object stuff);
    Object removeStuff();
}

class Wheel implements Movable  //класс Wheel (колесо) обладает способностью передвигаться
{
    @Override
    public void move(String newAddress) {

    }
}

class Car implements Movable, Driveable, Transport  //класс Car (машина) обладает способностью передвигаться,
                                                    // управляться человеком и перевозить грузы
{

    @Override
    public void move(String newAddress) {

    }

    @Override
    public void drive(Driver driver) {

    }

    @Override
    public void addStuff(Object stuff) {

    }

    @Override
    public Object removeStuff() {
        return null;
    }
}

class Skateboard implements Movable, Driveable  //класс Skateboard (скейтборд) обладает способностью передвигаться и управляться человеком
{

    @Override
    public void move(String newAddress) {

    }

    @Override
    public void drive(Driver driver) {

    }
}

class Driver{

}
