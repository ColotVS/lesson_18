import java.util.ArrayList;

public class lesson_18_25 {
    //Роли

    //Интерфейсы сильно упрощают жизнь программиста.
    //Очень часто в программе есть тысячи объектов, сотни классов и всего пара десятков интерфейсов — ролей.
    //Ролей мало, а их комбинаций — классов — очень много.

    //Весь смысл в том, что вам не нужно писать код для взаимодействия всех классов со всеми.
    //Вам достаточно взаимодействовать с их ролями (интерфейсами).

    //Представьте, что вы дрессируете домашних животных, каждое из которых может иметь несколько разных способностей.
    //И вы поспорили с соседом, чьи животные громче кричат.
    //Вы просто берете всех, у которых есть способность «голос», и командуйте им: Голос!.

    //Вам все равно, что это за животные и какие у них есть другие способности. Хоть тройное сальто назад.
    //В этот конкретный момент вас интересует только способность громко орать. Вот как это выглядело бы в коде:

    public static void main(String[] args)
    {
        // добавляем всех животных в список
        ArrayList pets = new ArrayList();
        pets.add(new Кот());
        pets.add(new Собака());
        pets.add(new Рыбка());

        // орать, если есть такая способность
        for(Object pet: pets)
        {
            if (pet instanceof Sound)
            {
                Sound крикун = (Sound) pet;
                крикун.voice();
            }
        }
    }
}
interface Sound                 //Способность Звучание. Понимает команду голос — имеет соответствующий метод.
{
    void voice();
}
class Кот implements Sound      //Животные, у которых есть эта особенность.
{                               //Для удобства мы дали классам имена на русском.
    @Override                   //Такое допускается в Java, но крайне нежелательно.
    public void voice()
    {
        System.out.println("МЯУ");
    }
}

class Собака implements Sound
{
    @Override
    public void voice()
    {
        System.out.println("ГАВ");
    }
}

class Рыбка                     //Наша Рыбка не обладает способностью говорить (не реализует интерфейс Sound).
{

}

    //Когда количество классов в ваших программах пойдет на тысячи, вы жить без интерфейсов не сможете.
    //Вместо описания взаимодействия тысяч классов,
    //достаточно описать взаимодействие десятков интерфейсов — это очень сильно упрощает жизнь.


