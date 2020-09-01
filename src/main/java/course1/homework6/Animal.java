package course1.homework6;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void Run(double run) {
        System.out.printf("%s не умеет бегать :(%n", name);
    }

    void Jump(double jump) {
        System.out.printf("%s не умеет прыгать :(%n", name);
    }

    void Swim(double swim) {
        System.out.printf("%s не умеет плавать :(%n", name);
    }

    public String getName() {
        return name;
    }
}
