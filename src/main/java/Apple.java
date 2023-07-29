/**
 * Класс яблок, наследник класса фруктов
 */
public class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "Яблоко " + weight + " кг.";
    }
}
