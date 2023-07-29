import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1.0);
        Apple apple2 = new Apple(1.0);
        Apple apple3 = new Apple(1.0);
        Apple apple4 = new Apple(1.0);
        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);
        Orange orange3 = new Orange(1.5);
        Orange orange4 = new Orange(1.5);
        Box<Apple> box1 = new Box<>(new ArrayList<>());
        Box<Orange> box2 = new Box<>(new ArrayList<>());
        Box<Orange> box3 = new Box<>(new ArrayList<>());
        box1.addFruit(apple1, apple2, apple3, apple4);
        box2.addFruit(orange1,orange2);
        box3.addFruit(orange3,orange4);
        System.out.printf("Коробки:\n 1.%s;\n 2.%s;\n 3.%s;\n\n", box1, box2, box3);
        System.out.println("Вес коробки с яблоками: " + box1.getWeight() + " кг.\n" + "Вес одной коробки с апельсинами: " + box2.getWeight() + " кг.\n");
        System.out.printf("Сравнение веса коробки №1 и коробки №2: %s\n\n", box1.compare(box2)?"вес коробок равен.":"вес коробок не равен.");
        System.out.printf("Пересыпаем апельсины из коробки №2 в коробку №3:\nДо пересыпки:\n  2.%s;\n  3.%s;\n", box2,box3);
        box3.addAll(box2);
        System.out.printf("После пересыпки:\n  2.%s;\n  3.%s;\n", box2,box3);


    }
}
