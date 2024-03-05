import org.w3c.dom.ls.LSOutput;

public class lesson_18_04 {
    //Классы Triangle, Rectangle и Circle — геометрические фигуры, поэтому они и унаследованы от класса Shape.
    //Переопредели в них метод printInfo(), чтобы в консоли выводилось название конкретной фигуры:
    //Для Triangle — "Треугольник";
    //Rectangle — "Прямоугольник";
    //Circle — "Круг".

    //Метод main() в тестировании участия не принимает.
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();      //Геометрическая фигура
        circle.printInfo();     //Круг
        rectangle.printInfo();  //Прямоугольник
        triangle.printInfo();   //Треугольник
    }
}

class Shape {
    public void printInfo(){
        System.out.println("Геометрическая фигура");
    }
}

class Circle extends Shape {
    @Override
    public void printInfo() {
        System.out.println("Круг");
    }
}

class Rectangle extends Shape {
    @Override
    public void printInfo() {
        System.out.println("Прямоугольник");
    }
}

class Triangle extends Shape {
    @Override
    public void printInfo() {
        System.out.println("Треугольник");
    }
}

