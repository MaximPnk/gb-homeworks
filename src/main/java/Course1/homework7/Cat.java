package Course1.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean notHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.decrease(appetite);
            this.appetite = 0;
            notHungry = true;
        } else {
            System.out.println(this.name + " не может покушать. Корма не хватает.");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", notHungry=" + notHungry +
                '}';
    }
}
