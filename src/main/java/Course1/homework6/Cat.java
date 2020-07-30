package Course1.homework6;

public class Cat extends Animal {

    private int maxRun;
    private double maxJump;

    public Cat(String name) {
        super(name);
        maxRun = (int) (Math.random() * 100 + 150);
        maxJump = Math.random() * 2 + 1;
    }

    @Override
    void Run(double run) {
        if (run < 0) {
            System.out.println("Вы ввели некорректное значение");
        } else if (run <= maxRun) {
            System.out.printf("%s может пробежать %.1f, т.к. его максимум %d%n", super.getName(), run, maxRun);
        } else {
            System.out.printf("%s не может пробежать %.1f, т.к. его максимум %d%n", super.getName(), run, maxRun);
        }
    }

    @Override
    void Jump(double jump) {
        if (jump < 0) {
            System.out.println("Вы ввели некорректное значение");
        } else if (jump <= maxJump) {
            System.out.printf("%s может прыгнуть на %.3f, т.к. его максимум %.2f%n", super.getName(), jump, maxJump);
        } else {
            System.out.printf("Кот %s не может прыгнуть на %.3f, т.к. его максимум %.2f%n", super.getName(), jump, maxJump);
        }
    }
}
