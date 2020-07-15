package homework6;

public class Animal {

    private String name;
    private int maxRun;
    private double maxJump;
    private int maxSwim;

    public Animal(String name) {
        this.name = name;
        if (this instanceof Dog) {
            maxRun = (int) (Math.random() * 200 + 400);
            maxJump = Math.random() * 5 + 0.5;
            maxSwim = (int) (Math.random() * 25 + 5);
        } else {
            maxRun = (int) (Math.random() * 100 + 150);
            maxJump = Math.random() * 2 + 1;
            maxSwim = 0;
        }
    }

    void Run(double run) {
        if (run < 0) {
            System.out.println("Вы ввели некорректное значение");
        } else if (run <= maxRun) {
            System.out.printf("%s может пробежать %.1f, т.к. его максимум %d%n", name, run, maxRun);
        } else {
            System.out.printf("%s не может пробежать %.1f, т.к. его максимум %d%n", name, run, maxRun);
        }
    }

    void Jump(double jump) {
        if (jump < 0) {
            System.out.println("Вы ввели некорректное значение");
        } else if (jump <= maxJump) {
            System.out.printf("%s может прыгнуть на %.3f, т.к. его максимум %.2f%n", name, jump, maxJump);
        } else {
            System.out.printf("Кот %s не может прыгнуть на %.3f, т.к. его максимум %.2f%n", name, jump, maxJump);
        }
    }

    //можно убрать оверрайд в других методах, получится то же самое
    void Swim(double swim) {
        if (this instanceof Cat) {
            System.out.printf("%s не умеет плавать :(%n", name);
        } else {
            if (swim < 0) {
                System.out.println("Вы ввели некорректное значение");
            } else if (swim <= maxSwim) {
                System.out.printf("%s может проплыть %.1f, т.к. ее максимум %d%n", name, swim, maxSwim);
            } else {
                System.out.printf("%s не может проплыть %.1f, т.к. ее максимум %d%n", name, swim, maxSwim);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
