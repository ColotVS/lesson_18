import java.util.ArrayList;
import java.util.List;

public class lesson_18_26 {
    //В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
    //Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
    //Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.

    //Для этого:
    //в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
    //в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
    //метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.

    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        for (MusicalInstrument instrument:orchestra)
        {
            instrument.play();
        }
    }
}

interface MusicalInstrument {
    void play();
}

class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет орган.");
    }
}

class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино.");
    }
}

class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }
}

class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет скрипка.");
    }
}