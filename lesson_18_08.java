import java.util.ArrayList;

public class lesson_18_08 {
    //Полиморфизм, часть 3

    //Приведение типов

    //Переменные ссылочных типов (классов) тоже можно преобразовывать к разным типам.
    //Однако это работает только в рамках одной иерархии типов.
    //Давайте рассмотрим на простом примере. Допустим, у нас есть такая иерархия классов: классы ниже наследуются от классов выше.


                                        //Класс Животное
    //Дикое животное extends Животное                           //Домашнее животное extends Животное
    //Волк extends Дикое животное                               //Кот extends Домашнее животное
    //Лиса extends Дикое животное                               //Собака extends Домашнее животное

    //Приведение ссылочных типов, как и примитивных тоже делится на расширяющие и сужающее.
    //Мы видим, что класс Кот унаследован от класса ДомашнееЖивотное, а класс ДомашнееЖивотное в свою очередь от класса Животное.

    //Если мы напишем такой код:

    //Животное котик = new Кот();
    //Это расширяющее приведение типа: его еще называют неявным.
    //Мы расширили ссылку котик, и теперь она ссылается на объект типа Кот.
    //При таком приведении мы не сможем через ссылку котик вызвать методы, которые есть у класса Кот, но которых нет у класса Животное.

    //Сужающее приведение (или явное) происходит в обратную сторону:
    //Кот котэ = (Кот) котик;
    //Мы явно указали, что хотим привести ссылку, которая хранится в переменной котик (типа Животное) к типу Кот.

    //Перед тем, как космический корабль отправится бороздить просторы Вселенной,
    //необходимо пригласить на борт экипаж, который будет состоять из 2 людей, 1 собаки и 1 кота.
    //В методе createCrew() добавь необходимое количество экземпляров соответствующих классов в список astronauts.
    //Подсказка:
    //Чтобы добавить объекты разных классов в один список, им нужен общий предок.
    //Унаследуй интересующие тебя классы от Astronaut. Кто угодно может стать исследователем космоса
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Astronaut humanOne = new Human();
        Astronaut humanTwo = new Human();
        Astronaut dog = new Dog();
        Astronaut cat = new Cat();
        astronauts.add(humanOne);
        astronauts.add(humanTwo);
        astronauts.add(dog);
        astronauts.add(cat);
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
class Astronaut {
    public String getInfo(){
        return "Неизвестный астронавт";
    }
}
class Human extends Astronaut{
    public String getInfo(){
        return "Человек";
    }
}
class Cat extends Astronaut{
    public String getInfo(){
        return "Кот";
    }
}
class Dog extends Astronaut{
    public String getInfo(){
        return "Собака";
    }
}
