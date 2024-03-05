public class lesson_18_12 {
    //Класс Pet является родительским классом для классов Cats и Dogs.
    //В нем реализован метод printInfo(), который сообщает, что данный объект является питомцем.
    //В классах Cats и Dogs переопредели метод printInfo(), дополнив его функционал следующим образом:

    //Вначале вызови метод printInfo() родительского класса;
    //потом дополнительно выведи в консоли "Я не люблю людей" для класса Cats или "Я люблю людей" для класса Dogs.
    //Пример вывода для класса Cats:
    //Я домашний питомец.
    //Я не люблю людей.

    //Пример вывода для класса Dogs:
    //Я домашний питомец.
    //Я люблю людей.

    public static void main(String[] args) {
        Cats cat = new Cats();
        cat.printInfo();
        Dogs dog = new Dogs();
        dog.printInfo();
    }
}
class Pet{
    public void printInfo(){
        System.out.println("Я домашний питомец.");
    }
}

class Dogs extends Pet{
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Я люблю людей.");
    }
}

class Cats extends Pet{
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Я не люблю людей.");
    }
}
