package homework6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Боня");
        Animal cat1 = new Cat("Белла");
        Animal dog = new Dog("Бобик");
        Animal dog1 = new Dog("Люк");

        dog.Run(450.31894);
        dog1.Run(550.23852);
        dog.Jump(2.4);
        dog1.Jump(3.78876);
        dog.Swim(10.2349025);
        dog1.Swim(20.238423);

        System.out.println();

        cat.Run(175.2342);
        cat1.Run(225.4839);
        cat.Jump(1.75);
        cat1.Jump(2.25);
        cat.Swim(3.34895);
        cat1.Swim(0);

    }
}
