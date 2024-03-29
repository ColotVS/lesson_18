public class lesson_18_20 {
    //Отделение «описания методов» от их реализации.

    //Раньше мы уже рассказывали, что если вы хотите разрешить вызывать методы своего класса из других классов,
    //то их нужно пометить ключевым словом public.
    //Если же хотите, чтобы какие-то методы можно было вызывать только из этого же класса, их нужно помечать ключевым словом private.
    //Другими словами, мы делим методы класса на две категории: «для всех» и «только для своих».

    //С помощью интерфейсов это деление можно усилить еще больше.
    //Мы сделаем специальный «класс для всех», и второй «класс для своих», который унаследуем от первого.

    //Вот как это примерно будет:
    public static void main(String[] args)
    {
        Student student = new StudentImpl("Ali");
        System.out.println(student.getName());

        //Мы разбили наш класс на два: интерфейс и класс, унаследованный от интерфейса. И в чем тут преимущество?

        //Один и тот же интерфейс могут реализовывать (наследовать) различные классы.
        //И у каждого может быть свое поведение.
        //Так же, как ArrayList и LinkedList — это две различные реализации интерфейса List.

        //Таким образом, мы скрываем не только различные реализации, но и сам класс,
        //который ее содержит (везде в коде может фигурировать только интерфейс).
        //Это позволяет очень гибко, прямо в процессе исполнения программы, подменять одни объекты на другие,
        //меняя поведение объекта скрытно от всех классов, которые его используют.

        //Это очень мощная технология в сочетании с полиморфизмом. Сейчас далеко не очевидно, зачем так нужно делать.
        //Вы сначала должны столкнуться с программами, состоящими из десятков или сотен классов, чтобы понять,
        //что интерфейсы способны существенно упростить жизнь.
    }
}

interface Student
{
    public String getName();
}

class StudentImpl implements Student
{
    private String name;
    public StudentImpl(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    private void setName(String name)
    {
        this.name = name;
    }
}
