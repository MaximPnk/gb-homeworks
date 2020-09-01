package course1.homework6;

public class Dog extends Animal{

    private int maxRun;
    private double maxJump;
    private int maxSwim;

    public Dog(String name) {
        super(name);
        maxRun = (int) (Math.random() * 200 + 400);
        maxJump = Math.random() * 5 + 0.5;
        maxSwim = (int) (Math.random() * 25 + 5);
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

    @Override
    void Swim(double swim) {
        if (swim < 0) {
            System.out.println("Вы ввели некорректное значение");
        } else if (swim <= maxSwim) {
            System.out.printf("%s может проплыть %.1f, т.к. ее максимум %d%n", super.getName(), swim, maxSwim);
        } else {
            System.out.printf("%s не может проплыть %.1f, т.к. ее максимум %d%n", super.getName(), swim, maxSwim);
        }
    }


}
