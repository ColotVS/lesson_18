public class lesson_18_28 {
    //Проблема

    //С помощью интерфейсов с методами можно значительно упростить иерархии многих классов.
    //Например, абстрактные классы InputStream и OutputStream можно объявить интерфейсами!
    //Это позволит использовать их гораздо чаще и гораздо удобнее.
    //Но в мире уже написаны десятки миллионов (миллиарды?) Java-классов.
    //И если начать менять стандартные библиотеки, то есть риск, что что-то может поломаться.

    //Чтобы случайно не сломать работающие программы и библиотеки, было решено,
    //что реализация методов в интерфейсах получит самый низкий приоритет при наследовании.
    //Например, если от интерфейса с методом унаследовать второй интерфейс и в нем объявить этот же метод, но без реализации,
    //то реализация из первого метода до класса не дойдет.

    //Пример:

    /*
    interface Pet
    {
        default void meow()
        {
            System.out.println("Мяу");
        }
    }

    interface Cat extends Pet
    {
        void meow(); // тут мы перекрыли дефолтную реализацию ее отсутствием
    }

    class Barsik implements Cat     //Код не скомпилируется, т.к. в классе Barsik не реализован метод meow().
    {

    }
    */
}