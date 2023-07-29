import java.util.ArrayList;
import java.util.List;

/**
 * Класс коробок
 */
public class Box <T extends Fruit> {
    private final ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    @SafeVarargs
    public final void addFruit(T... fruit){
        fruits.addAll(List.of(fruit));
    }

    public double getWeight(){
        double sum = 0;
        for (T element:fruits) sum += element.weight;
        return sum;
    }

    public boolean compare(Box fruits2){
        double sum = 0;
        for (T element:fruits) sum += element.weight;
        return sum == fruits2.getWeight();
    }

    public void addAll(Box<T> fruits2){
        fruits.addAll(fruits2.fruits);
        fruits2.fruits.clear();
    }

    @Override
    public String toString() {
        return "Коробка с фруктами: " + fruits;
    }
}
