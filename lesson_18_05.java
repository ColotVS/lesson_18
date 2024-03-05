public class lesson_18_05 {
    //Полиморфизм, часть 2

    //Предположим, в классе Cow есть метод printAll(), который вызывает два других метода. Тогда код будет работать так:

    /*
class Cow
{
    public void printAll()
    {
        printColor();
        printName();
    }

    public void printColor ()
    {
        System.out.println("Я — белая");
    }

    public void printName()
    {
        System.out.println("Я — корова");
    }
}

class Whale extends Cow
{
    public void printName()
    {
        System.out.println("Я — кит");
    }
}
    */

    /*
    public static void main(String[] args)
    {
    Whale whale = new Whale ();
    whale.printAll();                       //На экран будет выведена надпись: Я — белая Я — кит
    }
    */

    //Обратите внимание: когда вызывается метод printAll(), написанный в классе Cow, у объекта типа Whale,
    //используется метод printName класса Whale, а не Cow.
    //Главное — не в каком классе написан метод, а какой тип (класс) объекта, у которого этот метод вызван.

    //Наследовать и переопределять можно только нестатические методы.
    //Статические методы не наследуются и, следовательно, не переопределяются.

    //Вот как выглядит класс Whale после применения наследования и переопределения методов:
    /*
class Whale
{
    public void printAll()
    {
        printColor();
        printName();
    }

    public void printColor()
    {
        System.out.println("Я - белая");
    }

    public void printName()
    {
        System.out.println("Я - кит");
    }
}
    */

    //Вот как выглядит класс Whale после применения наследования и переопределения метода.
    //Ни о каком старом методе printName мы и не знаем.

}
