
public class lesson_18_17 {
    //Класс Person объявлен как абстрактный. Это значит, что мы не можем создавать его экземпляры.
    //Сделай из данного класса обычный, допиши недостающую логику, которая отвечает общепринятым подходам к инкапсуляции:
    //геттеры должны возвращать, а сеттеры — устанавливать значения соответствующим полям.


    public static void main(String[] args) {
        Person person = new Person("Влад",25);
        person.setAge(26);
        person.setName("Владислав");
        System.out.println(person.getName()+ " " + person.getAge());
    }
}
class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}