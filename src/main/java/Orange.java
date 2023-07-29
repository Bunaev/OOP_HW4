/**
 * Класс апельсинов, наследник класса фруктов
 */
public class Orange extends Fruit{
    public Orange(double weight) {
        super(weight);
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "Апельсин " + weight + " кг.";
    }
}
