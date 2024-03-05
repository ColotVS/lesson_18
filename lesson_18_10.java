public class lesson_18_10 {
    //Перед тобой 4 класса животных — Cow, Lion, Wolf и Elephant.
    //Корова (Cow) и слон (Elephant) являются травоядными, поэтому они наследуются от класса Herbivore.
    //А лев (Lion) и волк (Wolf) являются хищниками, поэтому они наследуются от класса Predator.
    //В свою очередь классы Herbivore и Predator унаследованы от Animal.
    //В классе lesson_18_10 реализуй метод printRation(Animal animal), который должен выводить в консоли рацион переданного животного:
    //если животное хищник, нужно вывести "Любит мясо";
    //если животное травоядное, вывести "Любит траву".
    public static void main(String[] args) {
        printRation(new Cowe());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = " любит траву";
        String predator = " любит мясо";

            if(animal instanceof Cowe cowe)
            {
                cowe.printInfo();
                System.out.println(herbivore);
            }
            else if(animal instanceof Elephant elephant)
            {
                elephant.printInfo();
                System.out.println(herbivore);
            }

            if(animal instanceof Wolf wolf)
            {
                wolf.printInfo();
                System.out.println(predator);
            }
            else if(animal instanceof Lion lion)
            {
                lion.printInfo();
                System.out.println(predator);
            }
    }
}
class AllAnimal {
    public void printInfo()
    {
        System.out.print("Животное");
    }
}

class Herbivore extends Animal {
    public void printInfo()
    {
        System.out.print("Травоядное");
    }

}

class Predator extends Animal {
    public void printInfo()
    {
        System.out.print("Хищник");
    }
}

class Wolf extends Predator {
    @Override
    public void printInfo()
    {
        System.out.print("Волк");
    }
}
class Lion extends Predator {
    @Override
    public void printInfo()
    {
        System.out.print("Лев");
    }
}
class Elephant extends Herbivore {
    @Override
    public void printInfo() {
        System.out.print("Слон");
    }
}
class Cowe extends Herbivore {
    @Override
    public void printInfo() {
        System.out.print("Корова");
    }
}
