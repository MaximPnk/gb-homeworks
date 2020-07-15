package homework6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void Swim(double swim) {
        System.out.printf("%s не умеет плавать :(%n", super.getName());
    }
}
