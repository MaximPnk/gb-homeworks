package homework6;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void Swim(double swim) {
        if (swim < 0) {
            System.out.println("Вы ввели некорректное значение");
        } else if (swim <= super.getMaxSwim()) {
            System.out.printf("%s может проплыть %.1f, т.к. ее максимум %d%n", super.getName(), swim, super.getMaxSwim());
        } else {
            System.out.printf("%s не может проплыть %.1f, т.к. ее максимум %d%n", super.getName(), swim, super.getMaxSwim());
        }
    }


}
